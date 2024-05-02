/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades.revisao;

/**
 *
 * @author Gabriel
 */

import java.util.Arrays;

public class FilaCircularEstatica {
    private int tamanhoMaximo;
    private int[] elementos;
    private int inicio;
    private int fim;
    private int quantidade;

    public FilaCircularEstatica(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.quantidade = 0;
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public boolean estaCheia() {
        return quantidade == tamanhoMaximo;
    }

    public void enfileirar(int elemento) {
        if (!estaCheia()) {
            fim = (fim + 1) % tamanhoMaximo;
            elementos[fim] = elemento;
            quantidade++;
        } else {
            System.out.println("Fila cheia. Não é possível enfileirar.");
        }
    }

    public int desenfileirar() {
        if (!estaVazia()) {
            int elementoRemovido = elementos[inicio];
            inicio = (inicio + 1) % tamanhoMaximo;
            quantidade--;
            return elementoRemovido;
        } else {
            System.out.println("Fila vazia. Não é possível desenfileirar.");
            return -1;
        }
    }

    // 12. Verificar se um elemento existe em uma fila circular estática.
    public boolean existeElemento(int elemento) {
        for (int i = 0; i < quantidade; i++) {
            if (elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    // 13. Retornar a posição de um elemento na fila linear com implementação dinâmica.
    public int encontrarPosicao(int elemento) {
        for (int i = 0; i < quantidade; i++) {
            if (elementos[i] == elemento) {
                return i;
            }
        }
        return -1; // Elemento não encontrado
    }

    // 14. Apresentar o último elemento da fila.
    public int ultimoElemento() {
        if (!estaVazia()) {
            return elementos[fim];
        } else {
            System.out.println("Fila vazia. Não há último elemento.");
            return -1;
        }
    }

    // 15. Mostrar a quantidade de elementos na fila.
    public int quantidadeElementos() {
        return quantidade;
    }
    
    
}
