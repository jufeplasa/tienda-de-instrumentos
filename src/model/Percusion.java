package model;

public class Percusion extends Instrumento {
	private double largo;
	private double alto;
	private double ancho;
	  
	public Percusion(double largo,double alto,double ancho,String identificador,String ubicacion,String nombre,String direccion,int telefono) {
		super(identificador,ubicacion,nombre,direccion,telefono);
		this.setLargo(largo);
		this.setAlto(alto);
		this.setAncho(ancho);
	}
	
	public Percusion() {
		super();
		this.setLargo(23);
		this.setAlto(24.8);
		this.setAncho(17.6);
	}

	public double getLargo() {
		return largo;
	}

	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
}