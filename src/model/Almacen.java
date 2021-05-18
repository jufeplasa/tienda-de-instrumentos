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
		percutido=new Percutido();
		viento=new Viento("clarinete",26,5.3,4.2,"madera","200854","EXHIBICION","Casa de la orquesta","cll 5A",317485039);
		frotada=new Frotada();
		pulsada=new Pulsada("Bajo",45.3,39.4,15.2,4,24,"Tela","300249","EXHIBICION","Plaza Sinfonia","Crra 106",315789456);
		percutidas=new Percutidas();
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
		message="El instrumento "+agitado.getNombreInstrumento()+" tiene identificador "+agitado.getIdentificador()+" esta "+agitado.getLocalizado()+"\n";
		message+="El instrumento "+percutido.getNombreInstrumento()+" se toca con "+percutido.getHerramienta().getCantReq()+" elementos y de material "+percutido.getHerramienta().getMaterial()+" esta "+percutido.getLocalizado()+"\n";
		message+="El instrumento "+viento.getNombreInstrumento()+" esta "+viento.getLocalizado()+" fue distribuido por "+viento.getDistribuidor().getNombre()+"\n";
		message+="El instrumento "+frotada.getNombreInstrumento()+" tiene arco con "+frotada.getArco().getLargo()+" de largo, "+frotada.getArco().getAlto()+" de alto, "+frotada.getArco().getAncho()+" de ancho \n";
		message+="El instrumento "+pulsada.getNombreInstrumento()+" tiene "+pulsada.getCantCuerdas()+" cuerdas, "+pulsada.getCantTrastes()+" de trastes y esta "+pulsada.getLocalizado()+"\n";
		message+="El instrumento "+percutidas.getNombreInstrumento()+" tiene "+percutidas.getTeclado().getCantOctavas()+" octavas y las dimensiones de su caja es "+percutidas.getCaja().getLargo()+" de largo, "+percutidas.getCaja().getAlto()+" de alto, "+percutidas.getCaja().getAncho()+" de ancho. \n";
		return message;
	}
}
;