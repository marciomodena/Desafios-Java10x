package NivelIntermediario.ClassesAbstratas;

public class Uchiha extends Ninja {

    //Sobreescrever o metodo da classe Ninja


    public Uchiha() {
        super();
        //No args
    }

    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void estrategiaDeBatalha() {
        super.estrategiaDeBatalha();
    }
}
