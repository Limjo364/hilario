package Aula8;

public class Conta {
    private String nro;
    double saldo;
    public Conta (String nro, double saldo){
            this.nro = nro;
            this.saldo = saldo;}
    public void depositar (double valor){
            this.saldo+=valor;}
    public void sacar (double valor){
            this.saldo-=valor;}
    public double getSaldo(){
            return this.saldo;}
    
    }