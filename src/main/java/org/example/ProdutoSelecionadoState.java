package org.example;

public class ProdutoSelecionadoState implements State {
    VendingMachine machine;

    public ProdutoSelecionadoState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Produto já selecionado.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Produto já selecionado, não pode ejetar moeda.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Produto já selecionado.");
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Produto dispensado.");
        machine.setState(machine.getSemMoedaState());
    }
}