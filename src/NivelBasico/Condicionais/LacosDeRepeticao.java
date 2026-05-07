package Condicionais;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Lacos de repetição: repetem infinitamente ou até atingir o parametro desejado
        * WHILE E FOR
        * */

        //While
        //while(condicao){tudo aqui vai acontecer}

    /*    int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones<= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O naruto fez um clone " + numeroDeClones);


        }*/

        //for
        int numeroMaximoDeClones = 40;

        for (int numeroDeClones = 0 ; numeroDeClones<=numeroMaximoDeClones; numeroDeClones++){
            System.out.println("O naruto fez um clone " + numeroDeClones);
        }


    }
}
