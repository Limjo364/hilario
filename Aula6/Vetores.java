package Aula6;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        for (int i = 1; i<11; i++){
            A[i-1] = i;}
        System.out.println("Escreva o numero desejado > ");
        int x=entrada.nextInt();
        for (int j = 0; j<10; j++){
            B[j] = (A[j]+x);}
        for (int k = 0; k<10; k++){
            System.out.println(A[k]);
            System.out.println(B[k]);}
}}
