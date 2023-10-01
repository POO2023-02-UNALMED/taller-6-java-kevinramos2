package vehiculos;

public class Fabricante {
	//atributos
	private String nombre;
	private String pais;
	
	public Fabricante() {
		
	}
	public Fabricante(String nombre,String pais) {
		this.nombre = nombre;
		this.pais = pais;
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
	
}
