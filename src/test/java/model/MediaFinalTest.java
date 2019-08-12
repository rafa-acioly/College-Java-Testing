package model;

import org.junit.Assert;
import org.junit.Test;

public class MediaFinalTest {

    @Test
    public void deveCalcularMediaDeDuasNotas() {

        MediaFinal mediaFinal = new MediaFinal();
        mediaFinal.setPrimeiraProva(new Prova(7.0));
        mediaFinal.setSegundaProva(new Prova(5.0));

        mediaFinal.calcular();

        Assert.assertEquals(6.0, mediaFinal.getMedia(), 0.001);
    }
}
