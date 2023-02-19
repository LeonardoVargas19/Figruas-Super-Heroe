package figuras;

public class Figura {
	
	private String codigo;
	private double precio;
	private SuperHeroe superHeroe;
	private Dimension dimension;
	
	
	public Figura(String codigo, double precio, SuperHeroe superHeroe, Dimension dimension) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.superHeroe = superHeroe;
		this.dimension = dimension;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public SuperHeroe getSuperHeroe() {
		return superHeroe;
	}
	public void setSuperHeroe(SuperHeroe superHeroe) {
		this.superHeroe = superHeroe;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	@Override
	public String toString() {
		return "Figura [codigo=" + codigo + ", precio=" + precio + ", \n" + superHeroe + "\n"
				+ dimension + "]";
	}
	public void subir(double cantidad) {
		precio+=cantidad;
		
	}
	
	
	
	
}
