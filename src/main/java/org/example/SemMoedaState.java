package org.example;

public class SemMoedaState implements State {
    VendingMachine machine;

    public SemMoedaState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida.");
        machine.setState(machine.getTemMoedaState());
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda para ejetar.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Primeiro insira a moeda.");
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Pagamento necessário.");
    }
}
