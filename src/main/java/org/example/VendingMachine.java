package org.example;

public class VendingMachine {
    State semMoedaState;
    State temMoedaState;
    State produtoSelecionadoState;

    State estadoAtual;

    public VendingMachine() {
        semMoedaState = new SemMoedaState(this);
        temMoedaState = new TemMoedaState(this);
        produtoSelecionadoState = new ProdutoSelecionadoState(this);

        estadoAtual = semMoedaState;
    }

    public void setState(State estado) {
        estadoAtual = estado;
    }

    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        estadoAtual.ejetarMoeda();
    }

    public void selecionarProduto() {
        estadoAtual.selecionarProduto();
    }

    public void dispensarProduto() {
        estadoAtual.dispensarProduto();
    }

    public State getSemMoedaState() {
        return semMoedaState;
    }

    public State getTemMoedaState() {
        return temMoedaState;
    }

    public State getProdutoSelecionadoState() {
        return produtoSelecionadoState;
    }
}
