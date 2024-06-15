package com.listaencadeada;

public class ListaEncadeada {
    Nodo cabeca;

    public ListaEncadeada(){
        this.cabeca = null;
    }

    public void inserir(int dado){
        Nodo novoNodo = new Nodo(dado);
        if(cabeca == null) {
            // se a lista estiver vazia, o novo nodo se torna a cabeça da lista
            cabeca = novoNodo;
        }else {
            // se a lista não estiver vazia, vai até o final e adiciona la
            Nodo atual = cabeca;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            // atualizando o próximo do último nodo para o novo nodo
            atual.proximo = novoNodo;
        }
    }

    public void remover(int dado){
        if(cabeca == null) {
            return;
        }
        if(cabeca.dado == dado) {
            cabeca = cabeca.proximo;
            return;
        }
        // procura o nodo
        Nodo atual = cabeca;
        while(atual.proximo != null && atual.proximo.dado != dado){
            atual = atual.proximo;
        }
        if (atual.proximo == null){ //se nao estiver na lista
            return;
        }
        //remove o nodo encontrado
        atual.proximo = atual.proximo.proximo;

    }

    public void imprimeLista(){
        Nodo atual = cabeca;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.dado);
            if(atual.proximo != null){
                System.out.print(", ");
            }
            atual = atual.proximo;
        }
        System.out.print("]\n");
    }

}
