package Condicionais;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner é um jeito de trazer o usuario para dentro da aplicação
         * Objetivo da aula: Usuario vai criar um ninja e nós vamos validar os dados
         * */

        //Abertura do scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do ninja:");
        String nomeDoNinja = scanner.nextLine();
        System.out.println("O nome do ninja é : " + nomeDoNinja);

        System.out.println("Qual a idade do ninja?");
        int idade = scanner.nextInt();
        System.out.println("A idade do ninja é " + idade);

        if (idade>=18){
            System.out.println("O ninja " + nomeDoNinja + " é maior de 18 anos");

        }else {
            System.out.println("O ninja " + nomeDoNinja + " é menor de idade");
        }









        //Fechamento do scanner
        scanner.close();

    }



}
