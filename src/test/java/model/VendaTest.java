package model;

import org.junit.Assert;
import org.junit.Test;

public class VendaTest {

    @Test
    public void DeveGerarValorFinal() {
        Venda ven = new Venda();
        ven.setPercentual(10);
    
        Assert.assertEquals(110, ven.lancarCusto(100));
    }
}
