package model;

import vista.VentanaPrincipal;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Module extends Thread {

	private VentanaPrincipal vp; //instancia de la clase VentanaPrincipal
	private String moduleName;
	private String serviceType;
	private String estado;
	private Queue<Cliente> cola;
	private Time tiempo;
	private ArrayList<Integer> turnos;
	private int progress;

	
	public Module( String moduleName, String serviceType, VentanaPrincipal ventanaPrincipal) {
		
		vp = ventanaPrincipal;
		vp.setVisible(true);
		tiempo = new Time(0, 0, 0);
		this.moduleName = moduleName;
		this.serviceType = serviceType;
		estado = "";
		cola = new LinkedList();
		turnos = new ArrayList<>();
		//turnos.add(0);
		vp.getLblModulo().setText(moduleName + ": ");
		vp.getTextModulo().setText(serviceType);
	}
	
	public void run() {
		do {
			
			if( cola.isEmpty() != true ) {
				estado = "en tramite";
				vp.getTextModulo().setText( serviceType + "( " + estado + " )");
				tiempo.setTime( (int)(Math.random()*120+1) * 1000 ); //asignación random del tiempo de espera
				long tiempoEspera = tiempo.getTime()/1000;
				cola.peek().setAttentionTime( new Time(tiempoEspera*1000) );
				
				//carga los datos del turno actual a la ventana principal
				vp.getTextCliente().setText(cola.peek().getName());
				vp.getTextTurno().setText( cola.peek().getTurno() );
				vp.getTextTiempoEstimado().setText( tiempo.getMinutes() + ":" + tiempo.getSeconds() );
				
				do {
					tiempo.setTime( tiempo.getTime() - 1000); //resta de un segundo al tiempo de espera
					progress = (int)( ( (tiempoEspera-tiempo.getTime()/1000)*100)/tiempoEspera ); //calculo del porcentaje de tiempo completado
					vp.getBarraProgreso().setValue(progress);
					try {
						sleep( 1000 );
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					

				}while( tiempo.getTime() != 0 );
				
				cola.poll();
				vp.getTextCliente().setText( "" );
				vp.getTextTurno().setText( "" );
				vp.getTextTiempoEstimado().setText( "0:00" );
				vp.getBarraProgreso().setValue(0);
				
			}else {
				estado = "en espera de atender";
				vp.getTextModulo().setText( serviceType + "( " + estado + " )");
			}
		}while( estado != "cerrado" );
	}

	public String nuevoTurno(Cliente newCliente ) {
		turnos.add( turnos.size() );
		newCliente.setTurno( serviceType.charAt(0) + "" + (turnos.size()) + "");
		cola.add(newCliente);
		return newCliente.getTurno();
	}
	
}
