package aulas;
public class lampada {
    private boolean estaLigada;
    public lampada(){
        this.estaLigada = false;
    }
    public void botao(){
        this.estaLigada = !this.estaLigada;
    }
    public void observa() {
        if (estaLigada) {
            System.out.println("Está ligada!");
        } else {
            System.out.println("Está desligada!");
        }
    }
}
