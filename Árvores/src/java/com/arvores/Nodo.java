package com.arvores;

public class Nodo {
    public int valor;
    public Nodo esquerda;
    public Nodo direita;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public boolean isFolha(){
        return (this.esquerda == null) && (this.direita == null);
    }
}
