/*Crea la clase "Vehiculo", así como las clases "Bicicleta" y "Coche" como subclases de
la primera. Para la clase "Vehiculo", crea los atributos de clase "vehiculosCreados" y
"kilometrosTotales", así como el atributo de instancia "kilometrosRecorridos". Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra
a continuación:
VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
*/
public class ej2 {
	public static void main(String[] args) {
	// variables
	int opcion = 8;
	int km = 0;

	// Creación de objetos
	Bicicleta biciToWapa = new Bicicleta();
	Coche berlinaGrande = new Coche();

	do {
		System.out.println("VEHÍCULOS");
		System.out.println("=========");
		System.out.println("1. Anda con la bicicleta");
		System.out.println("2. Haz el caballito con la bicicleta");
		System.out.println("3. Anda con el coche");
		System.out.println("4. Quema rueda con el coche");
		System.out.println("5. Ver kilometraje de la bicicleta");
		System.out.println("6. Ver kilometraje del coche");
		System.out.println("7. Ver kilometraje total");
		System.out.println("8. Salir");
		System.out.println("Elige una opción (1-8):");
		opcion = Integer.parseInt(System.console().readLine());

		switch(opcion) {
			case 1:
				System.out.println("¿Cuantos km?:");
				km = Integer.parseInt(System.console().readLine());
				biciToWapa.anda(km);
			break;
			case 2:
				biciToWapa.hazCaballito();
			break;
			case 3:
				System.out.println("¿Cuantos km?:");
				km = Integer.parseInt(System.console().readLine());
				berlinaGrande.anda(km);
			break;
			case 4:
				berlinaGrande.quemaRueda();
			break;
			case 5:
				System.out.println("La bici lleva recorridos " + biciToWapa.getKilometraje() + " km");
			break;
			case 6:
				System.out.println("El coche lleva recorridos " + berlinaGrande.getKilometraje() + " km");
			break;
			case 7:
				System.out.println("Coche y bici levan " + Vehiculo.getkilometrosTotales() + " km recorridos");
			break;
			case 8:
				System.out.print("Saliendo");
			break;
			default:
				System.out.print("Opción erronea");
		}
	} while(opcion != 8);
	}
}
