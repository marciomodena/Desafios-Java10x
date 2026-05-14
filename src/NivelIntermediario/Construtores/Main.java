package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        /*Construtores :
        * NoArgs Constructor: Um construtor que vem vazio nao necessariamente recebe argumento nenhum
        * AllArgs Constructor: Um construtor que é preenchido com todos os atributos da classe*/

        Senju Hashirama = new Senju("Hashirama" , 22,true);
        System.out.println(Hashirama.nome + " " + Hashirama.idade + " e ele está " + Hashirama.vivoOuNao);
        Hashirama.sabedoriaHokage();






    }
}
