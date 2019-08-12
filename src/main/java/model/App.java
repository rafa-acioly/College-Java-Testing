package model;

public class App {

    public static void main(String[] args) {

        //cenario -> entrada -> saida = 6.0
        MediaFinal mediaFinal = new MediaFinal();
        mediaFinal.setPrimeiraProva(new Prova(7.0));
        mediaFinal.setSegundaProva(new Prova(5.0));

        //executar
        mediaFinal.calcular();

        //valida
        System.out.println(mediaFinal.getMedia());
    }

}
