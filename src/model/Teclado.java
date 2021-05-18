package model;

public class Teclado {
	//atributos
	private int cantOctavas;
	private String materialTeclado;
	
	public Teclado(int cantOctavas,String materialTeclado) {
		this.cantOctavas=cantOctavas;
		this.materialTeclado=materialTeclado;
	}

	public int getCantOctavas() {
		return cantOctavas;
	}

	public String getMaterialTeclado() {
		return materialTeclado;
	}

}
