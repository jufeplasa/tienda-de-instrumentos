package model;
 
public class Pulsada extends Cuerda {
	//atributos
	private String nombreInstrumento;
	private double largo;
	private double alto;
	private double ancho;
	private int cantCuerdas;
	private int cantTrastes;
	private String estuche;
	
	public Pulsada() {
		super();
		this.setNombreInstrumento("guitarra");
		this.setLargo(48.1);
		this.setAlto(20);
		this.setAncho(12.3);
		this.setCantCuerdas(6);
		this.setCantTrastes(12);
		this.setEstuche("Tela");	
	}
	
	public Pulsada(String nombreInstrumento,double largo,double alto,double ancho,int cantCuerdas,int cantTrastes,String estuche,String identificador,String ubicacion,String nombre,String direccion,int telefono) {
		super(identificador,ubicacion,nombre,direccion,telefono);
		this.setNombreInstrumento(nombreInstrumento);
		this.setLargo(largo);
		this.setAlto(alto);
		this.setAncho(ancho);
		this.setCantCuerdas(cantCuerdas);
		this.setCantTrastes(cantTrastes);
		this.setEstuche(estuche);	
	}
	
	public String getNombreInstrumento() {
		return nombreInstrumento;
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
	
	public int getCantCuerdas() {
		return cantCuerdas;
	}

	public int getCantTrastes() {
		return cantTrastes;
	}
	
	public String getEstuche() {
		return estuche;
	}

	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public void setCantCuerdas(int cantCuerdas) {
		this.cantCuerdas = cantCuerdas;
	}

	public void setCantTrastes(int cantTrastes) {
		this.cantTrastes = cantTrastes;
	}

	public void setEstuche(String estuche) {
		this.estuche = estuche;
	}

}
