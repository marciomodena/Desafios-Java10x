package NivelIntermediario.HerancaMultipla;

public class Main {

    /*Herança multipla é o conceito de eu implementar diversas interfaces*/
    public static void main(String[] args) {

        System.out.println("-------------Sasuke Uchiha-----------------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",18);
        System.out.println(sasuke.toString());



        System.out.println("----------------Sasuke Uchiha --------------------------");
        Hatake kakashi = new Hatake("Kakashi Hatake","Aldeia da Folha",48);




    }
}
