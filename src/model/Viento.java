package model;

public class Viento  extends Instrumento {
	private String nombreInstrumento;
	private double largo;
	private double alto;
	private double ancho;
	private String material;
	
	public Viento() {
		super();
		this.setNombreInstrumento("flauta");
		this.setLargo(27.2);
		this.setAlto(4.3);
		this.setAncho(3.2);
		this.setMaterial("marfil");
	}  
	
	public Viento(String nombreInstrumento,double largo,double alto,double ancho,String material,String identificador,String ubicacion,String nombre,String direccion,int telefono) {
		super(identificador,ubicacion,nombre,direccion,telefono);
		this.setNombreInstrumento(nombreInstrumento);
		this.setLargo(largo);
		this.setAlto(alto);
		this.setAncho(ancho);
		this.setMaterial(material);
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
	
	public String getMaterial() {
		return material;
	}
	
	public double getAncho() {
		return ancho;
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

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	

}
