package NivelIntermediario.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {

        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        //Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.estrategiaDeBatalha();
        sasuke.habilidadeEspecial();

        //Obj Uchiha2
        Uchiha itachi = new Uchiha("itachi" , 10);
        System.out.println(itachi.nome + " " + itachi.idade);



    }
}
