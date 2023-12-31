package vehiculos;

public class Automovil extends Vehiculo{
	//atributos
	private int puestos;
	protected static int automoviles;
	
	
	//atributos heredados 
	public Automovil(String placa,String nombre,int precio,int peso, Fabricante fabricante,int puestos) {
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
	
	public static int getCantidadAutomoviles() {
		return Automovil.automoviles;
	}
	public static void setCantidadAutomoviles(int automoviles) {
		Automovil.automoviles = automoviles;
	}
}


