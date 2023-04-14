public class Lampada {
    private int potencia;
    private String tipo;
    private boolean acesa;
    public Lampada(String tipo){
        this.tipo = tipo;
    }
    public int getpotencia(){
        return potencia;
    }
    public void setpotencia(int potencia){
        this.potencia = potencia;
    }
    public String gettipo(){
        return tipo;
    }
    public void settipo(String tipo){
        this.tipo = tipo;
    }
    public boolean isacesa(){
        return acesa;
    }
    public void setacesa(boolean acesa){
        this.acesa = false;
    }
    public void apagar(){
        System.out.println("Apagando");
        this.acesa = false;
    }
    public void acender(){
        System.out.println("Acendendo lampada");
        this.acesa = true;
    }
    @Override
    public String toString(){
        return "Lampada (potencia=" + potencia + ", tipo=" + tipo + ", acesa=" + acesa + ")";
    }
}
