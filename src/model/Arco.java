package model;
 
public class Arco {
	private double largo;
	private double alto;
	private double ancho;
	 
	public Arco(double arcoLargo,double arcoAlto,double arcoAncho) {
		largo=arcoLargo;
		alto=arcoAlto;
		ancho=arcoAncho;
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
	
}

