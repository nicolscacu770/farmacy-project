package model;

import java.sql.Time;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class RunnerModule {
	
	public static void main(String[] args) {
		
		Module moduloEmbarazadas = new Module("Modulo 1", "Embarazadas");

		moduloEmbarazadas.nuevoTurno( new Cliente("Marizol", "1234567890", "Embarazada"));
		moduloEmbarazadas.nuevoTurno( new Cliente("Juanita", "1004526304", "Embarazada"));
		moduloEmbarazadas.nuevoTurno( new Cliente("Valentina", "60984236", "Embarazada"));
		
		moduloEmbarazadas.start();
		
	}
}