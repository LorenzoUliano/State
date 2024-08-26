package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine maquina = new VendingMachine();

        maquina.inserirMoeda();
        maquina.selecionarProduto();
        maquina.dispensarProduto();

        maquina.ejetarMoeda();
    }
}