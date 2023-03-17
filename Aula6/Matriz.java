package Aula6;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A[][] = new int[5][5];
        int B[][] = new int[5][5];
        int C[][] = new int[5][5];
        for (int i = 0; i<5 ; i++){
            for (int j = 0; j<5 ; j++){
                System.out.println("Escreva o numero desejado > ");
                int x=entrada.nextInt();
                A[i][j] = x;}}
        for (int k = 0; k<5 ; k++){
            for (int l = 0; l<5 ; l++){
                System.out.println("Escreva o numero desejado > ");
                int z=entrada.nextInt();
                B[k][l] = z;}}
        for (int t = 0; t<5 ; t++){
            for (int r = 0; r<5 ; r++){
                C[t][r] = (A[t][r])+(B[t][r]);}}
        for (int e = 0; e<5 ; e++){
            for (int q = 0; q<5 ; q++){
                System.out.println(A[e][q]);
                System.out.println(B[e][q]);
                System.out.println(C[e][q]);}}
}}
