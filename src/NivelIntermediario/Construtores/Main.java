package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        /*Construtores :
        * NoArgs Constructor: Um construtor que vem vazio nao necessariamente recebe argumento nenhum
        * AllArgs Constructor: Um construtor que é preenchido com todos os atributos da classe*/
        Hokages Hashirama = new Hokages();

        Hokages Tobirama = new Hokages("Tobirama" , 19,true);
        System.out.println(Tobirama.nome + " " + Tobirama.idade + " e ele está " + Tobirama.vivoOuNao);

        Hokages Hiruzen = new Hokages("Hiruzen",19,false);




    }
}
