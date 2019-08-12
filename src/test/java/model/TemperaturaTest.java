package model;

import org.junit.Assert;
import org.junit.Test;

public class TemperaturaTest {
    
    @Test
    public void GerarFahrenheit() {
        
        Assert.assertEquals(
            77,
            Temperatura.converterParaFahrenheit(25)
        );
    }
}
