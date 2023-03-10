package Aula5;

public class Fibo {

    static long fibo(int n){
        if (n < 2){
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);}}

    public static void main(String[] args){
        for (int i = 1; i<=20; i++){
            System.out.print("(" + i +"):" + Fibo.fibo(i));
            if (Fibo.fibo(i) % 2 == 0){
                System.out.print(" - Par" + "\n");
            }else{
                System.out.print(" - impar" + "\n");}}}}
