package com.listaduplamenteencadeada;

public class Nodo {
    int dado;
    Nodo proximo;
    Nodo anterior;

    public Nodo(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}
