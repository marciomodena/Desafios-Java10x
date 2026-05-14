package NivelIntermediario.Construtores;

public abstract class Hokages {

    /*Classes abstratas:
    * caracteristicas: não pode criar um objeto a partir de uma classe abstrata
    * */

    /*Posso criar metodos abstratos tambem*/

    String nome;
    int idade;
    boolean vivoOuNao;
    String missao;
    int numeroDeMissoes;

    //Metodo abstrato
    public abstract void sabedoriaHokage();



    public Hokages() {
        //Construtor vazio sem argumentos
        /*Construtor diferente de métodos não leva nenhum tipo e sempre é inicializado como
         * public nom_do_construtor*/
    }


    //AllArgs Constructor
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;


        //Atalho para fazer um construtor: Ctrl + N




    }
}
