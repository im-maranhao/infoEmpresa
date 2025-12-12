package br.com.miriam.condicionais;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        //Estrutura Condicional Switch
        int dia = 6; 

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        int diaSemana = 5;

        String nomeDia = switch (diaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };

        System.out.println(nomeDia);

        //Estrutura Condicional While

        int num;

        System.out.println("Digite um numéro(Para sair -> 0):");

        num = scanner.nextInt();
 
        // while (num != 0 ){
        //     System.out.println("Você digitou o número: " +num);
        //     System.out.println("Digite outro número(Para sair -> 0): ");
        //     num = scanner.nextInt();

        //     System.out.println("Programa encerrado!");

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = scanner.nextInt();
            System.out.println("Você digitou: " + num);
        } while (num != 0);

        System.out.println("Programa encerrado!");
        
            scanner.close();
        }

}
