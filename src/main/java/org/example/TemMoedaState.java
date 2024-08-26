package org.example;

public class TemMoedaState implements State {
    VendingMachine machine;

    public TemMoedaState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda já inserida.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda ejetada.");
        machine.setState(machine.getSemMoedaState());
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Produto selecionado.");
        machine.setState(machine.getProdutoSelecionadoState());
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Nenhum produto selecionado.");
    }
}