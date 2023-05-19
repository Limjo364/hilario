package Aula15;

import java.util.Scanner;

public class Midias 
{
    public static void main(String[] args)
    {
        Midia[] lista = new Midia[10];
        int opcao;
        for (int i = 0; i < 2; i++)
        {
            System.out.printf("digite 1 para CD e 2 para DVD");
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();
            if(1 == opcao)
            {
                lista[i] = new Cd();
            }
            else
            {
                lista[i] = new Dvd();
            }
            lista[i].inserirDados();
        }
        for (int j = 0; j < 2; j++)
        {
            lista[j].printDados();
        }
    }
}
