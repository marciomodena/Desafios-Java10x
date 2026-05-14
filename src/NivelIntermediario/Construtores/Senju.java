package NivelIntermediario.Construtores;

public class Senju extends Hokages {
    public Senju() {
    }

    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    //Todos as classes que extendem uma classe que possui metodos abstratos são obrigados a sobreescrever o metodo

    @Override
    public void sabedoriaHokage() {
        System.out.println("Voce ganhou sabedoria");
    }
}
