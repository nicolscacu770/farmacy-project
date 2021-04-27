package model;

import java.util.ArrayList;

import vista.VentanaPrincipal;

public class Gestion {

	private Module moduloEmbarazadas;
	private Module moduloAncianos;
	private Module moduloDiscapacitados;
	private Module moduloGeneral;
	private ArrayList<Cliente> clientes;

	public Gestion(VentanaPrincipal vpEmbarazadas, VentanaPrincipal vpAncianos) {
		clientes = new ArrayList<>();
		moduloEmbarazadas = new Module("Modulo 1", "Embarazadas",vpEmbarazadas);
		moduloEmbarazadas.start();
		//moduloAncianos = new Module("Modulo 2", "Ancianos",vpAncianos);
		//moduloAncianos.start();
		
		precargarEmbarazadas();
		//precargarAncianos();
	}
	
	private void precargarEmbarazadas() {
		clientes.add( new Cliente("Marizol", "1234567890", "Embarazada") );
		asignarTurno( findCliente("1234567890") );
		clientes.add( new Cliente("Juanita", "1004526304", "Embarazada") );
		asignarTurno( findCliente("1004526304") );
		clientes.add( new Cliente("Valentina", "60984236", "Embarazada") );
		asignarTurno( findCliente("60984236") );
	}
	
	private void precargarAncianos() {
		moduloAncianos.nuevoTurno( new Cliente("Raul", "1234567890", "Anciano"));
		moduloAncianos.nuevoTurno( new Cliente("Victor", "1004526304", "Anciano"));
		moduloAncianos.nuevoTurno( new Cliente("Alvaro", "60984236", "Anciano"));
		moduloAncianos.nuevoTurno( new Cliente("Emilio", "1234567890", "Anciano"));
		moduloAncianos.nuevoTurno( new Cliente("Fabio", "1004526304", "Anciano"));
		
		
	}

	public Cliente findCliente(String id) {
		for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getIdentification().equals(id)) {
				return clientes.get(i);
			}
		}
		return null;
	}

	public void asignarTurno( Cliente cliente ) {
		if( cliente.getUserType().equals("Embarazada") ) {
			moduloEmbarazadas.nuevoTurno( cliente );
		}else if( cliente.getUserType().equals("Anciano") ) {
			moduloAncianos.nuevoTurno( cliente );
		}else if( cliente.getUserType().equals("Discapacitado") ) {
			moduloDiscapacitados.nuevoTurno( cliente );
		}else if( cliente.getUserType().equals("General") ) {
			moduloGeneral.nuevoTurno(  cliente );
		}
	}
	public void registrarCliente(String name, String id, String userType) {
		clientes.add( new Cliente(name, id, userType));
		asignarTurno( clientes.get( clientes.size() - 1 ));
		System.out.println("Bienvenid@\nsu turno es: " + findCliente( id ).getTurno());
	}
	
	public String ingresarCliente( String id ) {
		if( findCliente( id ) != null ) {
			asignarTurno( findCliente( id ));
			return "Bienvenid@\nsu Turno es: " + findCliente( id ).getTurno(); 
		}else {
			return "Lo sentimos, cliente no encontrado\n verifique sus datos";
		}
		
	}
	
	public void historial() {
		for (int i = 0; i < clientes.size() ; i++) {
			System.out.println(clientes.get(i));
		}
	}
	
}
