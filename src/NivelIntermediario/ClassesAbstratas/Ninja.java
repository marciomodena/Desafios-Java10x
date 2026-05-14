package NivelIntermediario.ClassesAbstratas;

public abstract class Ninja implements EstrategiaDeBatalha {

    //Criando os construtores da classe Ninja


    public Ninja() {
        //No Args Constructor
    }

    //All args Constructor
    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /*Com a classe abstrata consigo obrigar a todos a criarem objetos a partir da classe abstrata*/
    String nome;
    int idade;

     //Metodo geral! todos ninjas vão ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }
    //Metodo abstrato - obrigatorio ter em todas as classes que extendem essa
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia de combate");
    }
}
