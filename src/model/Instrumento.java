package model;

public class Instrumento {
	//atributos
	private String  identificador;
	private Ubicacion localizado;
	private Distribuidor distribuidor;
	
	public Instrumento(String identificador,String ubicacion,String nombre,String direccion,int telefono){
		this.identificador=identificador;
		distribuidor=new Distribuidor(nombre,direccion,telefono); 
		switch(ubicacion){
		case "EXHIBICION":
			localizado=Ubicacion.EXHIBICION;
		break;
			
		case "ALMACENADO":
			localizado=Ubicacion.ALMACENADO;
		break;
	
		case "EN_PEDIDO":
			localizado=Ubicacion.EN_PEDIDO;
		break;
		}
	}
	
	public Instrumento() {
		identificador="ZZZ";
		distribuidor=new Distribuidor("YAMAHA","Cll #28-22",3158972);
		localizado=Ubicacion.ALMACENADO;
	}

	public String getIdentificador() {

		return identificador;
	}
	
	public Ubicacion getLocalizado() {

		return localizado;
	}

	public Distribuidor getDistribuidor() {
		return distribuidor;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	

	public void setLocalizado(Ubicacion localizado) {
		this.localizado = localizado;
	}

	

	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
}
