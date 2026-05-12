package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        //NINJA BÁSICO
        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki" , 18,
                "Trocar de lugar rapidamente com outro objeto" );
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();



        //NINJA AVANCADO
        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", 25,"Fazer chakra de relâmpago na mão", "Prender o inimigo em um mundo criado pelo usuário.");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();

    }
}
