package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;

    //Construtores

    //NoArgs
    public NinjaBasico() {
    }

    //AllArgs
    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;

    }




    //Sobrecarga dos metodos da interface
    @Override
    public void mostrarInformacoes() {
        System.out.println("Seu nome é: " + nome +
                " você tem " + idade + " anos " +
                " e sua habilidade especial é " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Voce é um ninja básico e por isso tem" +
                " a habilidade de se transformar em outra pessoa" +
                " ou objeto!");
    }

}
