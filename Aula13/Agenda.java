public class Agenda {
    private String nome;
    private int idade;
    private float altura;

    public void armazenaPessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void removePessoa(String nome){
        
    }
    public void imprimeAgenda(){
        System.out.println("-Nome :" + nome + " -Idade :" + idade + " -Altura :" + altura);
    }
}