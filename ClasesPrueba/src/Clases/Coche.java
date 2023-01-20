package Clases;

public class Coche {
	private int puertas;
	private int potencia;
	private String marca;
	private int peso;
	private int trenMotriz;
	
	public Coche(int puertas, String marca, int potencia, int peso, int trenMotriz) {
		
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getTrenMotriz() {
		return trenMotriz;
	}

	public void setTrenMotriz(int trenMotriz) {
		this.trenMotriz = trenMotriz;
	}
	public static int darValoracion(Coche vehiculo1) {
		int valoracion = 1;
		if (vehiculo1.potencia / vehiculo1.peso  > 0.8 ) {
			valoracion = valoracion + 3;
			if (vehiculo1.trenMotriz == 2) {
				valoracion = valoracion + 2;
			}
			if (vehiculo1.trenMotriz == 3) {
				valoracion = valoracion + 1;
			}
		}
		if (vehiculo1.potencia > 200) {
			valoracion = valoracion + 4;
		}
		if (vehiculo1.potencia > 250) {
			valoracion = valoracion + 5;
		}
		if (vehiculo1.potencia > 310) {
			valoracion = valoracion + 6;
		}
		else {
			valoracion = valoracion + 3;
		}
		return valoracion;
		
	}

	

	
}
