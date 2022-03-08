package com.dio.collections.metodosList;

import java.util.*;

public class ExemploList {

   public static void main(String[] args) {}
/*Dada uma lista com 7 notas de uma aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
            //formas de utilização:
        //List notas = ArrayList(); => esta forma era feita antes do java 5
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        //Este tipo de implementação não permite adicionar e nem remover ítens na lista
        //List<Double> notas = (Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //notas.add(10d);

        //Este tipo de implementação torna e lista imutável
        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);

        System.out.println("Crie um lista e adicione as sete notas: ");

        //forma mais habitual de utilização
        List<Double> notas = new ArrayList<Double>(); //Generics (JDK 5) - Diamont Operator
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4 , 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("confita se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exima a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); //Ctrl+Alt+V cria altomatiicamente uma variável
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media dos notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

       //System.out.println("Confira se a lista está vazia: " + notas.isEmpty());*/

        /*Resolva as questões abaixo utilizando os métoodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                           "e coloque todos os elementos  da list ArrayList nessa nova lista: ");

        List<Double> notas2 = new LinkedList<>();
        notas2 = notas;

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.remove(0));

        System.out.println(notas2);


    }*/
}
