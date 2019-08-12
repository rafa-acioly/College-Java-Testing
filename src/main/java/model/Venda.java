package model;

public class Venda {
    
    private int percentual;

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }
    
    public int lancarCusto(int valor) {
        return ((this.percentual * valor) / 100) + valor;
    }
}
