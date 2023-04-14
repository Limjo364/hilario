public class Usando {
    public static void main(String[] args){
        Lampada lampadal = new Lampada("Incandescente");
        lampadal.setpotencia(40);
        System.out.println(lampadal);
        Interruptor il = new Interruptor();
        il.conectar(lampadal);
        System.out.println(il);
        il.Ligar();
        System.out.println(lampadal);
        il.Desligar();
        System.out.println(lampadal);
    }
}
