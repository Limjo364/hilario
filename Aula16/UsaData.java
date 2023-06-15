package Aula16;
import java.util.Scanner;

public class UsaData {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Data a = new Data();
        System.out.println("DIgite o dia");
        int dia = in.nextInt();
        a.setDia(dia);
        System.out.println("DIgite o mes");
        int mes = in.nextInt();
        a.setMes(mes);
        System.out.println("DIgite o ano");
        int ano = in.nextInt();
        a.setAno(ano);
        a.mostrarData();
    }
}
