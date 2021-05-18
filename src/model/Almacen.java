package model;

public class Almacen {
	public static final int MAXINTRUMENTOS=6;
	 
	//atributos
	private String name;
	//relaciones
	private Agitados agitado;
	private Percutido percutido;
	private Viento viento;
	private Frotada frotada;
	private Pulsada pulsada;
	private Percutidas percutidas;
	
	
	public Almacen(String name) {
		this.name=name;
		agitado=new Agitados("pandereta",15.3,10.2,4.3,"metal","100963","ALMACENADO","QUINTA SINFONIA","Cra 56 norte",316897650);
		percutido=new Percutido("Bateria",80.5,123.5,96.4,15.9,"madera",2,"100.782","EXHIBICION","QUINTA SINFONIA","Cra 56 norte",316897650);
		viento=new Viento("clarinete",26,5.3,4.2,"madera","200854","EXHIBICION","Casa de la orquesta","cll 5A",317485039);
		frotada=new Frotada("violonchelo",78.5,140.6,48.6,40.7,7.9,4.3,5,"300789","EXHIBICION","Plaza Sinfonia","Crra 106",315789456);
		pulsada=new Pulsada();
		percutidas=new Percutidas("clavicordio",127,11,36,114,5,24,7,"laton","300345","EXHIBICION","Plaza Sinfonia","Crra 106",315789456);
	}
	
	public String getName() {
		return name;
	}
	
	public Agitados getAgitado() {
		return agitado;
	}
	
	public Percutido getPercutido() {
		return percutido;
	}
	
	public Viento getViento() {
		return viento;
	}
	
	public Frotada getFrotada() {
		return frotada;
	}
	
	public Percutidas getPercutidas() {
		return percutidas;
	}
	
	public Pulsada getPulsada() {
		return pulsada;
	}
	
	public String mostrarInventario() {
		String message="";
		message="El instrumento "+agitado.getNombreInstrumento()+" tiene identificador "+agitado.getIdentificador()+" esta en "+agitado.getLocalizado()+"\n";
		message+="El instrumento "+percutido.getNombreInstrumento()+" tiene identificador "+percutido.getIdentificador()+" esta en "+percutido.getLocalizado()+"\n";
		message+="El instrumento "+viento.getNombreInstrumento()+" tiene identificador "+viento.getIdentificador()+" esta en "+viento.getLocalizado()+"\n";
		message+="El instrumento "+frotada.getNombreInstrumento()+" tiene identificador "+frotada.getIdentificador()+" esta en "+frotada.getLocalizado()+"\n";
		message+="El instrumento "+pulsada.getNombreInstrumento()+" tiene identificador "+pulsada.getIdentificador()+" esta en "+pulsada.getLocalizado()+"\n";
		message+="El instrumento "+percutidas.getNombreInstrumento()+" tiene identificador "+percutidas.getIdentificador()+" esta en "+percutidas.getLocalizado()+"\n";
		return message;
	}
	
}