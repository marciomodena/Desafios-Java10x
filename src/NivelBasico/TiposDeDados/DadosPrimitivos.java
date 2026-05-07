package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*Dados Primitivos - int,double,float,char,boolean,short
        *Objetivo da aula: Criar um ninja - Naruto
        *
        *
        *
        *
        * */
        int idade = 16; //valor maximo que um int pode alocar: 2 147 483 647
        double altura = 1.85;
        char inicial = 'N'; // char sempre preciso passar o valor entre aspas simples
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999999L; //somente o long preciso declarar com letra Maiuscula valor maximo: 9 223 372 036 854 775 807

        System.out.print(idade); // comando para mostrar para o usuario
        System.out.println(saldoBancario); // mostra e quebra a linha
        System.out.println("Minha idade é " + idade); //concatenação
    }
}
