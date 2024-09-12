package com.vetores;

public class Principal {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);
        vetor.adiciona(4);

        System.out.println(vetor);

        vetor.remove(3);

        System.out.println(vetor);

    }
}
