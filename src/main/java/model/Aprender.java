package model;

public class Aprender {
    
    private int nivel;

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public Double calcularSalario(int horas) {
        switch (this.nivel) {
            case 1:
                return 12.0 * horas;
            case 2:
                return 17.0 * horas;
            case 3:
                return 25.0 * horas;
            default:
                return 0.0;
        }
    }
}
