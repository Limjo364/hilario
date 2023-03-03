package Aula4;

public class dowhile {
    public static void main(String[] args){
        int continua = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Alterar");
            System.out.println("4. Exluir");
            continua = 1;
        }while (continua < 0);
    }
}
