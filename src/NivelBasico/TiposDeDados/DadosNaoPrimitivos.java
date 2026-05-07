package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos : String , Array, Class, enum
        * Objetivo da aula: Criar um ninja e tribuir métodos a ele*/

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); //vai colocar tudo em capslock
        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Esse texto está em Capslock: " + nomeUpperCase);
        System.out.println("Esse texto está normal: " + nome);
        System.out.println(aldeiaLowerCase);
    }
}
