public class Tiempo {
  //atributos
  private int segundos;
  // Constructor y otros métodos /////////////////////
  public Tiempo(int horas, int minutos, int segundos){
    this.segundos = ((horas*3600)+(minutos*60)+segundos);
  }

  public Tiempo(int seg){ /*Necesario para suma y resta*/
    this.segundos = seg;
  }

  private int getSegundos(){/*Necesario para suma y resta*/
    return this.segundos;
  }

  public String toString (){
    int segundos = this.segundos;
    int horas = segundos / 3600;
    segundos -= horas*3600;
    int minutos = segundos/60;
    segundos -= minutos*60;

    if (this.segundos<0) {
      return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
    } else {
      return horas + "h " + minutos + "m " + segundos + "s";
    }
  }

  public Tiempo suma(Tiempo t){ /*Se introduce un objeto de clase "Tiempo"*/
    return new Tiempo(this.segundos + t.getSegundos());
  }

  public Tiempo resta(Tiempo t){
    return new Tiempo(this.segundos - t.getSegundos());
  }
}
/*


    if (this.segundos < 0) {

    } else {

    }


}*/
