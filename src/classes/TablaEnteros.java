package classes;

public class TablaEnteros {
	private Integer[] tabla;

	//Constructor
	public TablaEnteros(Integer[] tabla){
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos.");
		this.tabla=tabla;
	}

	//devuelve la suma de los elementos de la tabla
	public int sumaTabla() {
		int suma =0;
		for (int contador= 0; contador< tabla.length; contador++)
			suma +=tabla[contador];
		return suma;
	}

	public int posicionTabla(int elementoABuscar) {
		for(int contador = 0; contador<tabla.length;contador++)
			if (tabla[contador]== elementoABuscar)
				return contador;
		throw new IllegalArgumentException("No existe: "+ elementoABuscar);
	}
}