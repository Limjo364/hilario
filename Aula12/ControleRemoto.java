package Aula12;

public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }
    
    public void aumentarvolume() {
        if (tv.getvolume() < 100) {
            tv.setvolume(tv.getvolume() + 1);}
            else{
                System.out.println("Volume no maximo");}
    }

    public void diminuirvolume() {
        if (tv.getvolume() > 1) {
            tv.setvolume(tv.getvolume() - 1);}
            else{
                System.out.println("Volume no minimo");}
    }

    public void aumentarcanal() {
        if (tv.getcanal() < 50) {
            tv.setcanal(tv.getcanal() + 1);}
            else{
                System.out.println("Ultimo canal");}
    }

    public void diminuircanal() {
        if (tv.getcanal() > 1) {
            tv.setcanal(tv.getcanal() - 1);}
            else{
                System.out.println("Primeiro canal");}
    }

    public void trocarcanal(int canal) {
        tv.setcanal(canal);
    }

    public int consultarvolume() {
        return tv.getvolume();
    }

    public int consultarcanal() {
        return tv.getcanal();
    }
}