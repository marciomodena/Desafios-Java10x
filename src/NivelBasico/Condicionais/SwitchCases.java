package Condicionais;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCase: Servem para gerar casos específicos
        * Objetivo da aula: Pedir ao usuario escolher entre os ninjas*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem:");
        System.out.println("1- Naruto Uzunaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Voce escolheu o Naruto Uzunaki");
                break;

            case 2:
                System.out.println("O usuario escolher o Sasuke Uchiha");
                break;


            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno");
                break;

            default:
                System.out.println("Voce digitou um numero invalido");
        }







        scanner.close();
    }
}
