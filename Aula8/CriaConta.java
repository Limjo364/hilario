package Aula8;

public class CriaConta {
    public static void main(String[] args){
        Conta c1 = new Conta("1234", 100);
        c1.saldo=200;
        c1.depositar(100);
        c1.sacar(50);
        System.out.println("Saldo atual: R$"+c1.getSaldo());
        
    }
}