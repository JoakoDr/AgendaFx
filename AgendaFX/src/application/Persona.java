package application;

import javafx.beans.property.SimpleStringProperty;

public class Persona {
	
	private final SimpleStringProperty primerNombre;
	private final SimpleStringProperty primerApellido;
	private final SimpleStringProperty email;
	
	public Persona(String pNombre, String pApellido , String email)
	{
		this.primerNombre = new SimpleStringProperty(pNombre);
		this.primerApellido = new SimpleStringProperty(pApellido);
		this.email = new SimpleStringProperty(email);
		
	}
	public String getprimerNombre()
	{
		return primerNombre.get();
	}
	public void setprimerNombre(String pNombre)
	{
		primerNombre.set(pNombre);
	}
	public String getprimerApellido()
	{
		return primerApellido.get();
	}
	public void setprimerApellido(String pApellido)
	{
		primerApellido.set(pApellido);
	}
	public String getEmail()
	{
		return email.get();
	}
	public void setEmail(String email1)
	{
		email.set(email1);
	}
}
