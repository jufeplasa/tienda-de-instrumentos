package model;

public class Caja {
	//atributos
	private double largo;
	private double alto;
	private double ancho;
	
	public Caja(double largo,double alto,double ancho) {
		this.largo=largo;
		this.alto=alto;
		this.ancho=ancho;
	}

	public double getLargo() {
		return largo;
	}

	public double getAncho() {
		return ancho;
	}

	public double getAlto() {
		return alto;
	}
	
}
