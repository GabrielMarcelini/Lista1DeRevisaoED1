/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades.revisao;

/**
 *
 * @author Gabriel
 */
public class FilaEncadeada {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node inicio;
    private Node fim;

    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void enfileirar(int novoDado) {
        Node newNode = new Node(novoDado);
        if (estaVazia()) {
            inicio = newNode;
        } else {
            fim.next = newNode;
        }
        fim = newNode;
    }

    public int desenfileirar() {
        if (!estaVazia()) {
            int dadoRemovido = inicio.data;
            inicio = inicio.next;
            if (inicio == null) {
                fim = null;
            }
            return dadoRemovido;
        } else {
            System.out.println("Fila vazia. Não é possível desenfileirar.");
            return -1;
        }
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    // 17. Verificar se uma fila encadeada de inteiros está em ordem crescente.
    public boolean estaEmOrdemCrescente() {
        if (estaVazia() || inicio.next == null) {
            return true; // Fila vazia ou com apenas um elemento está sempre em ordem crescente
        }
        Node current = inicio;
        while (current.next != null) {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
