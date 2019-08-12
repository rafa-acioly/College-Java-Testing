package model;

import org.junit.Assert;
import org.junit.Test;

public class ParcelaTest {
    
    @Test
    public void DeveGerarParcelas() {
        Assert.assertEquals(20.00, Parcela.calcularParcela(100.0), 0.001);
    }
}
