package Aula8;

public class CriaConta {
    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.numero = "21.345-7";
        c1.saldo = 0;
        c1.credito (500.87);
        c1.debito (45.00);
        System.out.println(c1.saldo);
    }
}