package NivelIntermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    //NoArgs
    public NinjaAvancado() {
    }

    //AllArgs


    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    //Sobrecarga dos metodos da interface
    @Override
    public void mostrarInformacoes() {
        System.out.println("Seu nome é: " + nome +
                " você tem " + idade + " anos " +
                " e sua habilidade especial é " + habilidade +
                " e sua especialidade é: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Voce é um ninja avançado, e sua habilidade especial é o Susanoo");
    }


}
