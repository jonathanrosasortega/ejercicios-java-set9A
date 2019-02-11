public class Ameba{
  //atributos
  private int peso;

  // Constructor y otros métodos /////////////////////
  public Ameba(){
    this.peso = 3;
  }

  public void come(int n){
    this.peso += n-1;
  }

  public void come(Ameba a){
    this.peso += (a.peso)-1;
    a.peso = 0;
  }

  public String toString(){
    return "Soy una Ameba y peso " + this.peso + " microgramos.";
  }
}
