public class Zona{
  //atributos
  private String nomZona;
  private int numEntradas;
  // Constructor y otros métodos /////////////////////
  public Zona(String nombre, int num){
    this.nomZona = nombre;
    this.numEntradas = num;
  }

  public String toString (){
    String nombre = this.nomZona;
    int num = this.numEntradas;
    return nombre + ": " + num + " entradas aún disponibles.";
  }

  public void vendeEntradas(int n){
    if (this.numEntradas == 0) {
      System.out.println("No se puede realizar la operación. Se han agotado las entradas");
    } else if (this.numEntradas < n) {
      System.out.println("No se puede realizar la operación. No quedan suficientes entradas");
      System.out.println("Actualmente esta zona dispone de " + this.numEntradas + " entradas");
    } else {
      this.numEntradas -= n;
      System.out.println("Operación finalizada con éxito. Se han vendido " + n + " entradas");
    } // Fin if
  } // Fin vendeEntradas
}
