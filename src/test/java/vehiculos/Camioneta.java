package vehiculos;

public class Camioneta extends Vehiculo{
	//atributos
	private boolean volco;
	
	//atributos heredados
	public Camioneta() {
		Vehiculo.cantidadVehiculos += 1;
	}
	public Camioneta(boolean volco) {
		this.volco = volco;
		Vehiculo.cantidadVehiculos += 1;
	}
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90,nombre,peso, precio,"4X4",fabricante);
		this.volco = volco;
		Vehiculo.cantidadVehiculos += 1;
	}
	
}
