package figuras;

import java.util.ArrayList;

public class Coleccion {
	private String nombreCollecion ;
	private ArrayList<Figura> listaFiguras;
	public Coleccion(String nombreCollecion) {
		
		this.nombreCollecion = nombreCollecion;
		this.listaFiguras = new ArrayList<>();
		
	}
	public String getNombreCollecion() {
		return nombreCollecion;
	}
	public void setNombreCollecion(String nombreCollecion) {
		this.nombreCollecion = nombreCollecion;
	}
	public void anadir(Figura figura) {
		listaFiguras.add(figura);
		
	}
	public void subirPrecio(double cantidad, String id) {
		for(Figura f: listaFiguras) {
			if(f.getCodigo().equals(id)) {
				f.subir(cantidad);
			}
		}
		
	
	}
	@Override
	public String toString() {
		String cadena= "Coleccion"+nombreCollecion+"\n---------------";
		for(Figura f:listaFiguras) {
			cadena+=f+"\n";
		
		}
		return cadena;
		
		
	}
	
	
}
