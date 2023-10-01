package vehiculos;
import java.util.ArrayList;
public class Pais {
	//atributo clase
	private String nombre;
	private int numdeventa;
	protected static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(){
		
	}
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	//set y get
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumDeVenta() {
		return this.numdeventa;
	}
	public void setNumDeVenta(int numdeventa) {
		this.numdeventa = numdeventa;
	}
	
	//metodo pais mas vendedor
	
	public static Pais pasMasVendedor() {
		int ventamayor =- 1;
		Pais mayorpais = null;
		for (Pais pais: paises) {
			final int numdeventa = pais.numdeventa;
			if (numdeventa > ventamayor) {
				ventamayor = numdeventa;
				mayorpais = pais;
			}
		}
		return mayorpais;
	}
}
