package application;

import javafx.beans.property.SimpleStringProperty;

public class Persona {
	
	private static SimpleStringProperty primerNombre;
	private static SimpleStringProperty primerApellido;
	private static SimpleStringProperty email;
	
	public Persona(String pNombre, String pApellido , String email)
	{
		Persona.primerNombre = new SimpleStringProperty(pNombre);
		Persona.primerApellido = new SimpleStringProperty(pApellido);
		Persona.email = new SimpleStringProperty(email);
		
	}
	public static String getprimerNombre()
	{
		return primerNombre.get();
	}
	public void setprimerNombre(String pNombre)
	{
		primerNombre.set(pNombre);
	}
	public static String getprimerApellido()
	{
		return primerApellido.get();
	}
	public void setprimerApellido(String pApellido)
	{
		primerApellido.set(pApellido);
	}
	public static String getEmail()
	{
		return email.get();
	}
	public void setEmail(String email1)
	{
		email.set(email1);
	}
}
