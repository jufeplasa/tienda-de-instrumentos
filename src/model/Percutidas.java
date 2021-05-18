package model;

public class Percutidas extends Cuerda {
	//atributos
	private String nombreInstrumento;
	private double totalLargo;
	private double totalAlto;
	private double totalAncho;
	
	//relaciones
	private Caja caja;
	private Teclado teclado;
	
	public Percutidas() {
		super();
		caja=new Caja(12.3,14.6,15.4);
		teclado=new Teclado(9,"Marfil");
		this.setNombreInstrumento("piano");
		this.setTotalLargo(30.3);
		this.setTotalAlto(130.5);
		this.setTotalAncho(50.84);
	}
	
	public Percutidas(String nombreInstrumento,double totalLargo,double totalAlto,double totalAncho,double largoCaja,double altoCaja,double anchoCaja,int cantOctavas,String materialTeclado,String identificador,String ubicacion,String nombre,String direccion,int telefono) {
		super(identificador,ubicacion,nombre,direccion,telefono);
		this.setNombreInstrumento(nombreInstrumento);
		this.setTotalLargo(totalLargo);
		this.setTotalAlto(totalAlto);
		this.setTotalAncho(totalAncho);
		caja=new Caja( largoCaja, altoCaja, anchoCaja);
		teclado=new Teclado( cantOctavas, materialTeclado);
	}

	public Caja getCaja() {
		return caja;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public double getTotalLargo() {
		return totalLargo;
	}

	public double getTotalAlto() {
		return totalAlto;
	}
	
	public double getTotalAncho() {
		return totalAncho;
	}
	
	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}

	public void setTotalLargo(double totalLargo) {
		this.totalLargo = totalLargo;
	}

	public void setTotalAlto(double totalAlto) {
		this.totalAlto = totalAlto;
	}

	public void setTotalAncho(double totalAncho) {
		this.totalAncho = totalAncho;
	}
	
	

}
