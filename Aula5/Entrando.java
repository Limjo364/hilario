package Aula5;
import java.util.Scanner;

public class Entrando {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Escreva seu telefone");
    int numero=entrada.nextInt();
    System.out.println("Escreva seu nome");
    String nomes=entrada.next();
    System.out.println("Escreva sua rua e numero");
    String endereço=entrada.nextLine();

    System.out.println(numero);
    System.out.println(nomes);
    System.out.println(endereço);
    entrada.close();
}}