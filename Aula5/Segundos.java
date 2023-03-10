package Aula5;
import java.util.Scanner;

public class Segundos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dias ");
        int dias = entrada.nextInt();
        System.out.println("Horas ");
        int horas = entrada.nextInt();
        System.out.println("Minutos ");
        int minutos = entrada.nextInt();
        System.out.println("Segundos ");
        int segundos = entrada.nextInt();
        int total = segundos + (minutos*60) + ((horas*60)*60) + (((dias*24)*60)*60);
        System.out.println("Total = " +(total)+ " Segundos");
        entrada.close();}}
