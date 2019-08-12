package model;

import org.junit.Assert;
import org.junit.Test;

public class LojaTest {
    
    @Test
    public void DeveGerarDezPorCento() {
        int valorEsperado = 400;
        
        Loja loja = new Loja(); 
        loja.lancarVenda(4000);
        
        Assert.assertEquals(loja.getComissao(), valorEsperado);
    }

    @Test
    public void DeveGerarVintePorCento() {
        int valorEsperado = 1200;
        
        Loja loja = new Loja();
        loja.lancarVenda(6000);
    
        Assert.assertEquals(loja.getComissao(), valorEsperado);
    }
}
