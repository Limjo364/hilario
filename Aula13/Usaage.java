import java.util.Scanner;

public class Usaage {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        Agenda p = new Agenda();
        System.out.println("Digite o seu nome, idade e altura");
        String nome = console.nextLine();
        int idade = console.nextInt();
        Float altura = console.nextFloat();
        p.armazenaPessoa(nome, idade, altura);
        p.imprimeAgenda();
        console.close();
    }
}