/*Implementa la clase "Caballo" vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos.*/
public class ej1 {
	public static void main(String[] args) {
		Caballo rocinante;
		Caballo clavilenio;

		rocinante = new Caballo("Rocinante","macho");
		clavilenio = new Caballo("Clavileño","macho");

		/*System.out.println(rocinante.nombre);*/
		System.out.println(rocinante.getNombre()); /*Forma preferible*/

		System.out.println(clavilenio.getEdad());

		rocinante.setEdad(3);
		rocinante.setPeso(350);
		rocinante.setRaza("Español");

		System.out.println(rocinante.getEdad());

		System.out.print(rocinante);
		System.out.print(clavilenio);

		System.out.println(rocinante.getRaza());
	}
}
