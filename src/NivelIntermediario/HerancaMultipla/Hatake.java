package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface,AnbuInterface {

    //Construtores:

    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void boasVindas(){
        System.out.println( nome + " Eu sou um Hatake");
    }

    //Metodo da interface
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " Ativou o sharingan");
    }

    //Metodo Anbu

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + " eu sou um ninja de elite");
    }
}
