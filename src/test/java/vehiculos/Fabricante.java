package vehiculos;
import java.util.ArrayList;
public class Fabricante {
	//atributos
	private String nombre;
	private String pais;
	private int numdeventa;
	protected static ArrayList<Fabricante> fabrilist = new ArrayList<Fabricante>();
	
	
	public Fabricante() {
		
	}
	public Fabricante(String nombre,String pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabrilist.add(this);
	}
	
	//get y set
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPais() {
		return this.pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public int getNumDeVenta() {
		return this.numdeventa;
	}
	public void setNumDeVenta(int numdeventa) {
		this.numdeventa = numdeventa;
	}
	
	//metodo fabrica mayor ventas
	public static Fabricante fabricaMayorVentas() {
		int ventamayor =- 1;
		Fabricante fabrimayor = null;
		for (Fabricante fabricante: fabrilist) {
			final int numdeventa = fabricante.numdeventa;
			if(numdeventa>ventamayor) {
				ventamayor = numdeventa;
				fabrimayor = fabricante;
			}
		}
		return fabrimayor;
	}
}
