package model;

public class Percutido extends Percusion {
	//atributos
	private String nombreInstrumento;
	
	
	//relacion
	private Elementos herramienta;
	
	//Metodos
	public Percutido(){
		super();
		this.setNombreInstrumento("tambor");
		herramienta=new Elementos(5,"madera",2);
	}
	
	public Percutido(String nombreInstrumento,double largo,double alto,double ancho,double dimensiones,String material,int cantReq,String identificador,String ubicacion,String nombre,String direccion,int telefono) {
		super(largo,alto,ancho,identificador,ubicacion,nombre,direccion,telefono);
		this.setNombreInstrumento(nombreInstrumento);
		herramienta=new Elementos(dimensiones,material,cantReq);
	}

	public Elementos getHerramienta() {
		return herramienta;
	}

	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}
	
	
}
