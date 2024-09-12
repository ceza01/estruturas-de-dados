package com.vetores;

public class Vetor {

    private int [] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

//    public void adiciona(int elemento){
//        for (int i=0; i < this.elementos.length; i++){
//            if (this.elementos[i] == 0) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }
    public boolean adiciona(int elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, int elemento){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        aumentaCapacidade();

        // mover todos os elementos
        for (int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public int buscar(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int buscarElemento(int elemento){
        for (int i=0; i<this.tamanho; i++){
            if (this.elementos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            int[] elementosNovos = new int[this.elementos.length*2];
            for (int i = 0; i < this.tamanho; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
}
