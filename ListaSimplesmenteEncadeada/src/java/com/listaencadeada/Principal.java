package com.listaencadeada;

import com.listaencadeada.ListaEncadeada;

public class Principal {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);

        lista.imprimeLista();

        lista.remover(2);
        lista.inserir(3);
        lista.inserir(10);



        lista.imprimeLista();

    }


}
