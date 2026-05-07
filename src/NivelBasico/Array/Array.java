package NivelBasico.Array;

public class Array {
    public static void main(String[] args) {

        /*
        * Usar array é como voce pegasse uma referencia na sua memoria , ou seja
        * um espacinho ali da sua memoria e dividisse isso qem diversos outros
        * espaços se eu tenho um array [4] é apenas uma referencia dividida em 4 vezes,
        * quando declaro uma variavel tambem é uma referencia na memoria
        *
        * quando separo um espaço na memoria e não preencho nada ele vem como null se for
        * string, 0 se for int, double inicializa como 0.0 , boolean inicializa como false
        * */

        String[] ninjas = new String[4];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Hinata Hyuga";
        ninjas[3]= "Sakura Haruno";

        System.out.println(ninjas);

        int [] numeroDeMissoes = new int[2];
        numeroDeMissoes[0] = 1;
        System.out.println(numeroDeMissoes[1]);

        //Redeclarando um array
        ninjas = new String[4];
        ninjas[0]= "Hashirama";
        ninjas[1] = "Naruto Uzumaki";
        ninjas[2] = "Hinata Hyuga";
        ninjas[3]= "Sakura Haruno";

        //Mostrar a lista de ninjas de um array:
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);

        }
    }
}
