package NivelIntermediario.HerancaMultipla;

public class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    Rank rank;


    //TODO: Incluir novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Gennin, Chunnin,Jounnin,Hokage
    /*TODO: Toda vez que eu precisar fazer a sobrecarga de um construtor, ou seja imagine que voce
     *  vai precisar inserir novos atributos em uma classe para isso voce tem um construtor que ja
     * estava feito, voce precisa referenciar todos de uma vez só, ex: this(nome,aldeia,idade) e não
     * um por um como : this.nome = nome / this.idade = idade ...*/


    //Construtores

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, Rank rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }
    //Sobrecarga de metodo - EstrategiaDeBatalha


    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de combate");
    }


    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + " e voce é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu qi é: " + qi + " e voce é um ninja promissor");

        } else {
            System.out.println("Seu qi é " + qi + " e voce precisa melhorar mais");
        }

    }
    //Metodo sem Override
    public void metodoProvisorio(){
        System.out.println("Teste");
    }

    @Override
    public String toString() {
        return "sla" ;
    }
}
