package figuras;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
	SuperHeroe sup=new SuperHeroe("SuperMan","El hombre mas fuerte", true);
	
	System.out.println(sup.toString());
	SuperHeroe sup1= new SuperHeroe("Batman", "El señor de la noche ", true);
   	System.out.println(sup1.toString());
	Dimension dim= new Dimension(20,12,15);
	Dimension dimG= new Dimension(40,24,30);
	System.out.println(dim);
	System.out.println(dimG );
	System.err.println("\n");
	System.err.println("\n");
	
	Figura fi= new Figura("45asd5",2500,new SuperHeroe("Hulk", "El hombre mas fuerte del mundo ", true), new Dimension(45,25,40));
	System.out.println(fi.toString());
	System.out.println("\n");
	System.out.println("\n");
	System.out.println("\n");
	fi.subir(100);
	System.out.println(fi.toString());
	
	Coleccion cl=new Coleccion("Avenger");
	
	Figura fi1= new Figura("45asd",2522,new SuperHeroe("Iron Man","El hombre de acero ", false),new Dimension(25,85,69));
	
	cl.anadir(fi);
	cl.anadir(fi1);
	System.out.println(cl.toString());
}

}
