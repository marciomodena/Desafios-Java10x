package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Objeto 1
        //Criar ninja sasuke uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome="Sasuke Uchiha";
        sasuke.aldeia="Aldeia da folha";
        sasuke.idade = 18;

        //chamando um metodo a partir de um objeto
        sasuke.SharinganAtivado();
        System.out.println("O " + sasuke.nome + " ele é da " + sasuke.aldeia + " e ele tem " + sasuke.idade + " anos");

        //Objeto 2
        //Criando o ninja naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia ="Aldeia da folha";
        naruto.idade = 18;
        naruto.modoSabio();


        //Objeto3
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Aldeia da Folha";
        hinata.idade = 18;
        hinata.
        ByakuganAtivado();


        //Objeto4
        Boruto boruto = new Boruto();
        boruto.nome="Boruto Hyuga Uzumaki";
        boruto.aldeia="Aldeia da Folha";
        boruto.idade=9;
        boruto.modoSabio();
        boruto.AtivarOKarma();
        boruto.AtivarJougan();

        //Acessando o metodo String
        String chamandoONinja =  naruto.euSouUmNinja();
        System.out.println(chamandoONinja);

        //Usando metodo com parametros:
        int tornarHokage = naruto.anosParaSeTornarHokage(30);
        System.out.println("Falta " + tornarHokage + " anos para se tornar Hokage e voce tem " + naruto.idade + " anos");

    }

}
