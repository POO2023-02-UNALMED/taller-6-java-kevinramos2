package vehiculos;

public class Automovil extends Vehiculo{
	//atributos
	private int puestos;
	protected static int automoviles = 0;
	
	
	//atributos heredados 
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, 4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		Automovil.automoviles += 1;
	}

	
	//Set y Get
	
	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getCantidadAutomoviles() {
		return this.automoviles;
	}
	public void setCantidadAutomoviles(int automoviles) {
		this.automoviles = automoviles;
	}
}


