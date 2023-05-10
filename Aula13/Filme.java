public class Filme {
    private String codigo;
    private String nome;
    private String categoria;
    private String[] atoresPrincipais;
    private int anoLancamento;
    
    public Filme(String codigo, int anoLancamento, String[] atoresPrincipais) {
        this.codigo = codigo;
        this.anoLancamento = anoLancamento;
        this.atoresPrincipais = atoresPrincipais;
        this.nome = "";
        this.categoria = "";}
    
    public String getCodigo() {
        return codigo;}
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;}
    
    public String getNome() {
        return nome;}
    
    public void setNome(String nome) {
        this.nome = nome;}
    
    public String getCategoria() {
        return categoria;}
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;}
    
    public String[] getAtoresPrincipais() {
        return atoresPrincipais;}
    
    public void setAtoresPrincipais(String[] atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;}
    
    public int getAnoLancamento() {
        return anoLancamento;}
    
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;}
    
    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Atores Principais: ");
        for (String ator : atoresPrincipais) {
            System.out.println("- " + ator);}
        System.out.println("Ano de Lançamento: " + anoLancamento);}
}
