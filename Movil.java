import java.text.DecimalFormat;

public class Movil extends Terminal{
  private String tarifa;
  private float aPagar = 0;

  public Movil(String s, String tarifa){
    super(s);
    this.tarifa = tarifa;
  }

  @Override
  public void llama(Terminal t, int seg){ // La llamada se realiza por un Móvil, pero un Movil es un Terminal
    super.llama(t, seg);
    String tarifa = this.tarifa;
    
    switch(tarifa) {
      case "rata":
        this.aPagar += (float)(seg*0.1);
      break;
      case "mono":
        this.aPagar += (float)(seg*0.2);
      break;
      case "bisonte":
        this.aPagar += (float)(seg*0.5);
      break;
      default:
    }
  }

  @Override
  public String toString (){
    String nomTarifa = this.tarifa;
    return "Nº " + this.getNumero() + " - " + this.getSegundos() + "s de conversación. Tarifa: " + nomTarifa + ". Pago " + this.aPagar + " céntimos";
  }
}
