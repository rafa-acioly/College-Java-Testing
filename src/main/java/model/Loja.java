/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunocmc
 */
public class Loja {
     private int comissao;

    public int getComissao() {
        return this.comissao;
    }

    public void lancarVenda(int valor) {
        if (valor <= 5000) {
            this.comissao = (10*valor) / 100;
        } else if (valor > 5000) {
            this.comissao = (20*valor) / 100;
        }
    }
}
