package Condicionais;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios:São maneiras de reduzir um if e else
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes>=10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);
    }
}
