package model;
 
public class Agitados extends Percusion {
	private String material;
	private String nombreInstrumento;
	 
	public Agitados() {
		super();
		this.setMaterial("plastico");
		this.setNombreInstrumento("maracas");
	}
	
	public Agitados(String nombreInstrumento,double largo,double alto,double ancho,String material,String identificador,String ubicacion,String nombre,String direccion,int telefono) {
		super(largo,alto,ancho,identificador,ubicacion,nombre,direccion,telefono);
		this.setMaterial(material);
		this.setNombreInstrumento(nombreInstrumento);
	}

	public String getMaterial() {
		return material;
	}
	
	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}
	
}
