package Aula12;

public class Usacont {
    public static void main(String[] args){
        Televisao tv = new Televisao();
        ControleRemoto cont = new ControleRemoto(tv);
        System.out.println(cont.consultarcanal());
        System.out.println(cont.consultarvolume());
        cont.aumentarcanal();
        cont.diminuirvolume();
        cont.diminuirvolume();
        cont.aumentarcanal();
        System.out.println(cont.consultarcanal());
        System.out.println(cont.consultarvolume());
        cont.aumentarvolume();
        cont.diminuircanal();
        System.out.println(cont.consultarcanal());
        System.out.println(cont.consultarvolume());
        cont.trocarcanal(50);
        System.out.println(cont.consultarcanal());
        cont.aumentarcanal();
        System.out.println(cont.consultarcanal());
    }
}
