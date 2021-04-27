package runner;

import vista.VentanaPrincipal;

import javax.swing.JOptionPane;

import model.Gestion;

public class RunnerModule {
	
	public static void main(String[] args) {
		
		VentanaPrincipal ventanaEmbarazadas = new VentanaPrincipal(100, 100);		
		VentanaPrincipal ventanaAncianos = new VentanaPrincipal(600, 100);
		
		Gestion gestion = new Gestion( ventanaEmbarazadas, ventanaAncianos);
		
		String menu = "digite: \n 1.para registrarse.\n 2. para ingresar.\n 3. para mostrar el historial.\n 4. para salir.";
		int opcion = 0;
		do {
			opcion = Integer.parseInt( JOptionPane.showInputDialog(menu) );
			if(opcion == 1) {
				String name = JOptionPane.showInputDialog("digite su nombre");
				String identification = JOptionPane.showInputDialog("digite su numero de identificacion");
				String userType = JOptionPane.showInputDialog("digite su tipo de usuario");
				
				gestion.registrarCliente(name, identification, userType);
			}else if(opcion == 2) {
				String identification = JOptionPane.showInputDialog("digite su numero de identificacion");
				JOptionPane.showMessageDialog(ventanaEmbarazadas, gestion.ingresarCliente(identification));
			}else if(opcion == 3) {
				gestion.historial();
			}
		}while( opcion != 4);
	}
}