package Condicionais;

public class IfEElse {
    public static void main(String[] args) {


    /*
    * Objetivo da aula: Passar o ninja e nivel de acordo com o numero de missões usando if
    * and else*/


    String nome = "Naruto Uzumaki";
    int idade = 16;
    boolean Hokage = false;
    int numeroDeMissoes = 20;
    String rank;

    //if(condicao) {faça isso}

   /* if(numeroDeMissoes > 10 && idade > 15){

        System.out.println("Naruto está pronto para passar");
    }
    else{
        System.out.println("Naruto não está pronto pra passar");
    }*/

    //else if:

        if(numeroDeMissoes == 10 && idade > 15){

            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes>=20) {
            System.out.println("Rank: Jounin");
        }
        else{
            System.out.println("Rank: Gennin");
        }


    }
}
