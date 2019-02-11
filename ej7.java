/*Ejercicio 7
Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.

El menú del programa debe ser el que se muestra a continuación. Cuando
elegimos la opción 2, se nos debe preguntar para qué zona queremos las
entradas y cuántas queremos. Lógicamente, el programa debe controlar que
no se puedan vender más entradas de la cuenta.
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
*/
public class ej7{
  public static void main(String[] args) {
    int opcion = 0;
    int opcionB = 0;
    Zona z1 = new Zona("Sala principal", 1000);
    Zona z2 = new Zona("zona de compra-venta", 200);
    Zona z3 = new Zona("zona vip", 25);
    int ventaEntradas = 0;

    do {
        System.out.println("Elija opción:");
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
          case 1:
            System.out.println(z1);
            System.out.println(z2);
            System.out.println(z3);
          break;
          case 2:
            System.out.println("¿Para que zona quiere vender?:");
            System.out.println("1. Sala principal");
            System.out.println("2. zona de compra-venta");
            System.out.println("3. zona vip");
            opcionB = Integer.parseInt(System.console().readLine());
            switch (opcionB) {
              case 1:
                System.out.println("¿Cuantas va a vender?");
                ventaEntradas = Integer.parseInt(System.console().readLine());
                z1.vendeEntradas(ventaEntradas);
              break;
              case 2:
                System.out.println("¿Cuantas va a vender?");
                ventaEntradas = Integer.parseInt(System.console().readLine());
                z2.vendeEntradas(ventaEntradas);
              break;
              case 3:
                System.out.println("¿Cuantas va a vender?");
                ventaEntradas = Integer.parseInt(System.console().readLine());
                z3.vendeEntradas(ventaEntradas);
              break;
              default:
                System.out.println("Zona incorrecta");
            } //Fin Switch opcionB
          break;
          case 3:
            System.out.println("Cerrando...");
          break;
          default:
            System.out.println("Opción incorrecta. Inténtelo de nuevo");
        } // Fin switch opcion
    } while (opcion != 3);
  }
}
