package com.vetores;

public class Principal {

    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<Integer>(3);
        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);

        System.out.println(vetor);
    }
}
