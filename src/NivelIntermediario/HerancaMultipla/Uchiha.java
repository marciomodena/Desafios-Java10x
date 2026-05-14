package NivelIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface  {


    //Polimorfismo sobreescrevendo o metodo da interface
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o sharingan" + " e eu ja completei "+ numeroDeMissoesConcluidas + " missões");
    }

    //Construtores:
    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, Rank rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    //Sobreescrever o metodo da classe Ninja


    @Override
    public void inteligenciaDeCombate() {
        super.inteligenciaDeCombate();
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        super.inteligenciaDeCombate(qi);
    }

    //Boa prática colocar a anotação override no java
    //A anotação override mostra se eu errar o nome de sobreescrita de um metodo
    @Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe uchiha");
    }
}
