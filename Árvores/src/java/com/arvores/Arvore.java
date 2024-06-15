package com.arvores;

import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    public Nodo raiz;

    public void inserir (int valor){
        if (raiz == null) raiz = new Nodo(valor);
        else {
            Nodo novoNodo = new Nodo(valor);
            Queue<Nodo> queue = new LinkedList<>(); // TODO futuramente utilizar métodos criados nesse repo
            queue.add(raiz);
            while(!queue.isEmpty()){
                Nodo nodoAtual = queue.remove();
                if (nodoAtual.esquerda == null){
                    nodoAtual.esquerda = novoNodo;
                    break;
                } else {
                    queue.add(nodoAtual.esquerda);
                }
                if (nodoAtual.direita == null){
                    nodoAtual.direita = novoNodo;
                    break;
                } else {
                    queue.add(nodoAtual.direita);
                }
            }
        }
    }

    public void preOrdem(){
        preOrdem(raiz);
    }

    public void preOrdem(final Nodo nodo) {
        // pre ordem = raiz - esquerda - direita
        if (nodo == null) return;
        System.out.println(nodo.valor);
        preOrdem(nodo.esquerda);
        preOrdem(nodo.direita);
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

    public void posOrdem(){
        posOrdem(raiz);
    }

    public void posOrdem(final Nodo nodo) {
        // pos ordem = esquerda - direita - raiz
        if (nodo == null) return;
        posOrdem(nodo.esquerda);
        posOrdem(nodo.direita);
        System.out.println(nodo.valor);
    }

    public void BFS(){ //Breadth First Search - busca em largura
        if (raiz == null) return;
        Queue<Nodo> queue = new LinkedList<>();
        queue.add(raiz);
        while (!queue.isEmpty()) {
            Nodo nodo = queue.remove();
            if (nodo.esquerda != null) queue.add(nodo.esquerda);
            if (nodo.direita != null) queue.add(nodo.direita);

            System.out.println(nodo.valor);
        }
    }

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(37);
        arvore.inserir(11);
        arvore.inserir(66);
        arvore.inserir(8);
        arvore.inserir(17);
        arvore.inserir(42);
        arvore.inserir(72);

        System.out.println("------------------");
        arvore.preOrdem();
        System.out.println("------------------");

//        System.out.println(arvore.raiz.valor);
//        System.out.println(arvore.raiz.esquerda.valor);
//        System.out.println(arvore.raiz.direita.valor);
//
//        System.out.println(arvore.raiz.isFolha());
//        System.out.println(arvore.raiz.direita.isFolha());
    }
}
