package vehiculos;

public class Vehiculo {

	//atributos
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	protected static int cantidadVehiculos = 0;


	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.cantidadVehiculos += 1;
	}
	public Vehiculo() {
		Vehiculo.cantidadVehiculos += 1;
	}
	
	//get y set
		//placa
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
		//puertas
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
		//velocidadMaxima
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
		//nombre
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		//precio
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
		//peso
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}	
		//traccion
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
		//fabricante
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
		//cantidad vehiculos
	public static int getCantidadVehiculos() {
		return Vehiculo.cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	//metodo vehiculosportipo
	
	public static String vehiculosPorTipo() {
		int cantidadAutomoviles = Automovil.automoviles;
		int cantidadCamiones = Camion.camiones;
		int cantidadCamionetas = Camioneta.camionetas;

		return "Automoviles: "+cantidadAutomoviles+"\nCamiones: "+cantidadCamiones+"\nCamionetas: "+cantidadCamionetas;
	}
	
}