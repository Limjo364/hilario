package Provas;
import java.util.Scanner;

public class 624500_av_01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A[][] = new int[5][5];
        int B[][] = new int[5][5];
        for (int i = 0; i<5 ; i++){
            for (int j = 0; j<5 ; j++){
                System.out.println("Escreva o numero desejado para a matriz > ");
                int n=entrada.nextInt();
                A[i][j] = n;}}
        System.out.print("Escreva o numero desejado > ");
        int x=entrada.nextInt();
        for (int i = 0; i<5 ; i++){
            for (int j = 0; j<5 ; j++){
                if( (A[i][j])%2 == (x%2)){
                    B[i][j] = (A[i][j])*x;}
                else{
                    B[i][j] = A[i][j];}}}
        for (int i = 0; i<5 ; i++){
            for (int j = 0; j<5 ; j++){
                System.out.println(A[i][j]);
                System.out.println(B[i][j]);}}
        entrada.close();
}}
