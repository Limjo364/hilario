public class Interruptor {
    private Lampada conectada;
    private boolean ligado;
    public Interruptor(){
    }
    public Interruptor(Lampada conectada){
        this.conectar(conectada);
    }
    public void conectar(Lampada l){
        this.conectada = l;
    }
    public void Ligar(){
        System.out.println("Ligando interruptor");
        if (!this.ligado){
            this.ligado = true;
            if (conectada != null){
                conectada.acender();
            }
        }
    }
    public void Desligar(){
        System.out.println("Desligando interruptor");
        if (this.ligado){
            this.ligado = false;
            if (conectada != null){
                conectada.apagar();
            }
        }
    }
    @Override
    public String toString(){
        return "Interruptor (conectada=" + conectada + ")";
    }
}
