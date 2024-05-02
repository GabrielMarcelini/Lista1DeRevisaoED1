/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades.revisao;

/**
 *
 * @author Gabriel
 */

//16. Utilizando uma pilha crie um programa que converta um número decimal em qualquer base de 2 a 8.
public class ConversorDecimalBase {
    public static String converterBase(int numeroDecimal, int base) {
        if (base < 2 || base > 8) {
            return "Base inválida. A base deve estar entre 2 e 8.";
        }
        PilhaEncadeada pilha = new PilhaEncadeada();
        String resultado = "";

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % base;
            pilha.push(resto);
            numeroDecimal /= base;
        }

        while (!pilha.isEmpty()) {
            resultado += pilha.pop();
        }

        return resultado;
    }
}


