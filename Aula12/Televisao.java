package Aula12;

public class Televisao {
    private int canal;
    private int volume;

    public Televisao() {
        this.canal = 1;
        this.volume = 50;
    }

    public int getcanal() {
        return canal;
    }

    public void setcanal(int canal) {
        if (canal >= 1 && canal <= 50) {
            this.canal = canal;
        }
    }

    public int getvolume() {
        return volume;
    }

    public void setvolume(int volume) {
        if (volume >= 1 && volume <= 100) {
            this.volume = volume;
        }
    }
}
