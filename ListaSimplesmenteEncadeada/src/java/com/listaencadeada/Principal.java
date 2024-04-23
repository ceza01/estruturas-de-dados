package com.listaencadeada;

import com.listaencadeada.ListaEncadeada;

public class Principal {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        lista.imprimeLista();

        lista.remover(20);
        lista.inserir(40);

        lista.imprimeLista();

    }


}
