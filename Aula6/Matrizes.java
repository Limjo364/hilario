package Aula6;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A[][] = new int[3][5];
        int c = 1;
        for (int i = 0; i<3 ; i++){
            for (int j = 0; j<5 ; j++){
                A[i][j] = c;
                c++;}}
        System.out.println("Escreva o numero desejado");
            int x=entrada.nextInt();
        for (int k = 0; k<3 ; k++){
            for (int l = 0; l<5 ; l++){
                float r = (x%2);
                if ((A[k][l]%2) == r){
                    System.out.println(A[k][l]);
                }}}
        entrada.close();
}}
