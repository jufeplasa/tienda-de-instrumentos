package model;

public class Frotada extends Cuerda{
	//atributos
	private String nombreInstrumento;
	private double largo;
	private double alto;
	private double ancho;
	private int cantCuerdas;
	
	
	//relaciones
	private Arco arco;
	
	public Frotada() {
		super();
		this.setNombreInstrumento("violin");
		this.setAlto(12.4);
		this.setLargo(23.4);
		this.setAncho(15);
		this.setCantCuerdas(4);
		arco=new Arco(70.2,12.4,7);
	}
	
	public Frotada(String nombreInstrumento,double largo,double alto,double ancho,double arcoLargo,double arcoAlto,double arcoAncho,int cantCuerdas,String identificador,String ubicacion,String nombre,String direccion,int telefono) {
		super(identificador,ubicacion,nombre,direccion,telefono);
		this.setNombreInstrumento(nombreInstrumento);
		this.setAlto(alto);
		this.setLargo(largo);
		this.setAncho(ancho);
		this.setCantCuerdas(cantCuerdas);
		arco=new Arco(arcoLargo,arcoAlto,arcoAncho);
	}
	
	public Arco getArco() {
		return arco;
	}	
	
	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public double getAlto() {
		return alto;
	}

	public int getCantCuerdas() {
		return cantCuerdas;
	}

	public double getLargo() {
		return largo;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
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

	public void setCantCuerdas(int cantCuerdas) {
		this.cantCuerdas = cantCuerdas;
	}

}
