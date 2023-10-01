package vehiculos;

public class Automovil extends Vehiculo{
	//atributos
	private int puestos;
	
	//atributos heredados 
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, 4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		Vehiculo.cantidadVehiculos += 1;
	}
	public Automovil() {
		Vehiculo.cantidadVehiculos += 1;
	}
	public Automovil(int puestos) {
		this.puestos = puestos;
		Vehiculo.cantidadVehiculos += 1;
	}

	}


