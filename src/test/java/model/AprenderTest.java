package model;

import org.junit.Assert;
import org.junit.Test;


public class AprenderTest {
    
    @Test
    public void DeveGerarSalarioParaNivelUm() {
        Aprender ap = new Aprender();
        ap.setNivel(1);
        
        Assert.assertEquals(12.0, ap.calcularSalario(1), 0.001);
        Assert.assertEquals(24.0, ap.calcularSalario(2), 0.001);
    }
    
    @Test
    public void DeveGerarSalarioParaNivelDois() {
        Aprender ap = new Aprender();
        ap.setNivel(2);
        
        Assert.assertEquals(17.0, ap.calcularSalario(1), 0.001);
        Assert.assertEquals(34.0, ap.calcularSalario(2), 0.001);
    }

    @Test
    public void DeveGerarSalarioParaNivelTres() {
        Aprender ap = new Aprender();
        ap.setNivel(3);
        
        Assert.assertEquals(25.0, ap.calcularSalario(1), 0.001);
        Assert.assertEquals(50.0, ap.calcularSalario(2), 0.001);
    }
}
