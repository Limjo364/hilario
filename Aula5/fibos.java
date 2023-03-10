package Aula5;
import java.util.Scanner;

public class fibos {
    static long fibo(int n){
        if (n < 2){
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);}}

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quatidade de numeros");
        int n=entrada.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.print("(" + i +"):" + Fibo.fibo(i));
            if (Fibo.fibo(i) % 2 == 0){
                System.out.print(" - Par" + "\n");
            }else{
                System.out.print(" - impar" + "\n");}}
        entrada.close();}}
