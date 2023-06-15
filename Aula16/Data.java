package Aula16;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){}
    public void setDia(int dia){
        if (dia <= 31 && dia >= 1){
            this.dia = dia;}
            else{
                System.out.println("Dia invalido");}
    }
    public int getDia(){
        return this.dia;
    }
    public void setMes(int mes){
        if (mes <=12 && mes >= 1){
            this.mes = mes;}
            else{
                System.out.println("Mes invalido");}
    }
    public int getMes(){
        return this.mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
    public void mostrarData(){
        String messes[] = new String[12];
        messes[0] = "Janeiro";
        messes[1] = "Fevereiro";
        messes[2] = "Marco";
        messes[3] = "Abril";
        messes[4] = "Maio";
        messes[5] = "Junho";
        messes[6] = "Julho";
        messes[7] = "Agosto";
        messes[8] = "Setembro";
        messes[9] = "Outubro";
        messes[10] = "novembro";
        messes[11] = "Dezembro";
        System.out.println("Dia " + dia + " de " + messes[mes-1] + " de " + ano + "\n");
    }
}
