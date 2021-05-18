package model;
  
public class Elementos {
	
	private double dimensiones;
	private String material;
	private int cantReq;
	
	public Elementos(double dimensiones,String material,int cantReq) {
		
		this.dimensiones=dimensiones;
		this.material=material;
		this.cantReq=cantReq;
	}
	
	public double getDimensiones() {
		return dimensiones;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getCantReq() {
		return cantReq;
	}
	
}
