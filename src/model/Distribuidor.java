package model;
  
public class Distribuidor {
	private String nombre;
	private String direccion;
	private int telefono;
	
	public Distribuidor(String nombre,String direccion,int telefono) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
