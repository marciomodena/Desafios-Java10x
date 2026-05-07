package NivelIntermediario;

public class Ninjas {
    String nome;
    int idade;
    String aldeia;


    /*
    * O metodo void não retorna valor nenhum!
    * */
    //Criando um metodo publico personalizado
    public void SharinganAtivado(){
        System.out.println("O sharingan ativou");
    }

    //Criando um metodo return:
    //Exemplo criar um metodo string onde vai ter que retornar uma string
    public String euSouUmNinja(){
        return "Eu sou um ninja";
    }

    //Metodo do tipo int
    public int anosParaSeTornarHokage(int idadeMinimaParaTornarHokage ){
       return idadeMinimaParaTornarHokage - idade;

    }


}
