package aulas;
public class semafaro {
  private String cor;

  semafaro(){
    this.cor = "Amarelo";
  }

  void mudarCor(){
    if (this.cor.equals("Vermelho")) {
      this.cor = "Verde";
      System.out.println("Verde");
    } else if (this.cor.equals("Verde")){
      this.cor = "Amarelo";
      System.out.println("Amarelo");
    } else if (this.cor.equals("Amarelo")) {
      this.cor = "Vermelho";
      System.out.println("Vermelho");
    }
  }
}