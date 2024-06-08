package br.com.alura.screenmatch.model;

import java.util.List;
import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args) {
        // Criando um objeto do tipo List para armazenar números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionando elementos ao List
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessando elementos do List
        System.out.println("Primeiro elemento: " + numeros.get(0)); // Saída: 10
        System.out.println("Segundo elemento: " + numeros.get(1)); // Saída: 20
        System.out.println("Terceiro elemento: " + numeros.get(2)); // Saída: 30

        // Percorrendo os elementos do
        System.out.println(" mostrando elementos da lista com for");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("**********");

        // Removendo um elemento do List
        numeros.remove(1); // Remove o elemento de índice 1 (20)
        System.out.println("mostrando lista com o elemtno 1 removido" + numeros);
        // Verificando o tamanho do List
        System.out.println("Tamanho do List: " + numeros.size()); // Saída: 2
    }
}