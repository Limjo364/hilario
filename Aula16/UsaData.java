package Aula16;
import java.util.Scanner;

public class UsaData {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Data a = new Data();
        int dia = in.nextInt();
        a.setDia(dia);
        int mes = in.nextInt();
        a.setMes(mes);
        int ano = in.nextInt();
        a.setAno(ano);
        a.mostrarData();
    }
}
