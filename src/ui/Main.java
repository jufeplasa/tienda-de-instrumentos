package ui;
import model.Almacen;
import java.util.Scanner;
public class Main {
	
	private Scanner leer;
	
	//relacion
	private Almacen tienda;
	
	public Main(){
		leer=new Scanner(System.in);
		tienda=new Almacen("Clave de Sol");
	}
	
	public static void main(String [] args) {
		Main inter=new Main();
		String respuesta="";
		int i=0;
		System.out.println("Bienvendio a la "+inter.tienda.getName()+" \n");
		
		System.out.println("Desea ver los instrumentos disponibles (Si, no) ");
		while(i==0) {
			respuesta=inter.leer.nextLine();
			if(respuesta.equalsIgnoreCase("si")) {
				String message="";
				message=inter.tienda.mostrarInventario();
				System.out.println(message);
				i++;
			}
			else if (respuesta.equalsIgnoreCase("no")){
				System.out.println("Hasta pronto. =D \nHas salido del programa. ");
				i++;
			}
			else {
				System.out.println("Esa opcion no es valida, porfavor intentelo de nuevo. ");
			}
		}
		
		
	}	
}
