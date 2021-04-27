package model;

import java.sql.Time;

public class Cliente {

	private String name;
	private String identification;
	private String userType;
	private String turno;
	private Time attentionTime;
	
	public Cliente(String name, String identification, String userType) {
		this.name = name;
		this.identification = identification;
		this.userType = userType;
		turno = "";
		attentionTime = new Time(0,0,0);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
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

	public Time getAttentionTime() {
		return attentionTime;
	}

	public void setAttentionTime(Time attentionTime) {
		this.attentionTime = attentionTime;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + ", identification=" + identification + ", userType=" + userType + ", turno="
				+ turno + ", attentionTime=" + attentionTime + "]";
	}
	
}
