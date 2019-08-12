package model;

public class MediaFinal {

    private Prova primeiraProva;
    private Prova segundaProva;
    private Double media;

    public Prova getPrimeiraProva() {
        return primeiraProva;
    }

    public void setPrimeiraProva(Prova primeiraProva) {
        this.primeiraProva = primeiraProva;
    }

    public Prova getSegundaProva() {
        return segundaProva;
    }

    public void setSegundaProva(Prova segundaProva) {
        this.segundaProva = segundaProva;
    }

    public Double getMedia() {
        return media;
    }

    public void calcular() {
        this.media = (primeiraProva.getNota() + segundaProva.getNota()) / 2;

    }
}
