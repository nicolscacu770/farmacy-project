package model;

public class Cliente {

	private String Name;
	private String identification;
	private String userType;
	private String turno;
	
	public Cliente(String name, String identification, String userType) {
		super();
		Name = name;
		this.identification = identification;
		this.userType = userType;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String id) {
		this.identification = id;
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}

	
	
}
