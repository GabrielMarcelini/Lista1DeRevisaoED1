/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades.revisao;

/**
 *
 * @author Gabriel
 */

public class PilhaEncadeada {

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;

    public PilhaEncadeada() {
        top = null;
    }

    public void push(T novoDado) {
        Node<T> newNode = new Node<>(novoDado);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia. Não é possível remover.");
            return null;
        }
        T removedData = top.data;
        top = top.next;
        return removedData;
    }

    // 18. Mostrar o topo da pilha encadeada.
    public T peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia. Não há topo.");
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private static class T {

        public T() {
        }
    }
}
