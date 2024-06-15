package com.arvores;

public class BST { // binary search tree - Árvore Binária de Busca
    public Nodo raiz;

    public void inserir(int valor){
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            inserir(raiz,valor);
        }
    }

    private void inserir(final Nodo raiz, final int valor) {
        if (raiz == null) return;
        if (valor == raiz.valor) return;
        if (valor > raiz.valor){
            if (raiz.direita == null) raiz.direita = new Nodo(valor);
            else inserir(raiz.direita, valor);
        } else {
            if (raiz.esquerda == null) raiz.esquerda = new Nodo(valor);
            else inserir(raiz.esquerda, valor);
        }
    }

    public void emOrdem(){
        emOrdem(raiz);
    }

    public void emOrdem(final Nodo nodo) {
        // em ordem = esquerda - raiz - direita
        if (nodo == null) return;
        emOrdem(nodo.esquerda);
        System.out.println(nodo.valor);
        emOrdem(nodo.direita);
    }

    public boolean contem(int valor){
       return contem(raiz, valor);
    }

    private boolean contem(final Nodo raiz, final int valor) {
        if (raiz == null) return false;
        if (raiz.valor == valor) return true;
        if (valor > raiz.valor) return contem(raiz.direita, valor);
        else return contem(raiz.esquerda, valor);
    }

    public int menorValor(Nodo nodoAtual){
        while(nodoAtual.esquerda != null) {
            nodoAtual = nodoAtual.esquerda;
        }
        return nodoAtual.valor;
    }

    public void removerNodo(int valor) {
        raiz = removerNodo(raiz, valor);
    }

    private Nodo removerNodo(final Nodo raiz, final int valor) {
        if (raiz == null) return null;

        if (valor < raiz.valor) {
            raiz.esquerda = removerNodo(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = removerNodo(raiz.direita, valor);
        } else {
            if ((raiz.esquerda == null) && (raiz.direita == null)) {
                return null;
            } else if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            } else {
                int menorValor = menorValor(raiz.direita);
                raiz.valor = menorValor;
                raiz.direita = removerNodo(raiz.direita, menorValor);
            }
        }
        return raiz;
    }


    public static void main(String[] args) {
        BST arvoreBuscaBinaria = new BST();
        arvoreBuscaBinaria.inserir(37);
        arvoreBuscaBinaria.inserir(11);
        arvoreBuscaBinaria.inserir(66);
        arvoreBuscaBinaria.inserir(8);
        arvoreBuscaBinaria.inserir(17);
        arvoreBuscaBinaria.inserir(42);
        arvoreBuscaBinaria.inserir(72);

        arvoreBuscaBinaria.removerNodo(66);
        arvoreBuscaBinaria.removerNodo(8);
        arvoreBuscaBinaria.emOrdem();

//        System.out.println(arvoreBuscaBinaria.contem(17));
//        System.out.println(arvoreBuscaBinaria.contem(72));
    }

}
