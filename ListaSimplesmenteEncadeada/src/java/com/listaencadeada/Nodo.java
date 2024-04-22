package com.listaencadeada;

public class Nodo {

    int dado; //armazena o valor do nodo
    Nodo proximo; //referencia o proximo nodo da lista

    public Nodo(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
