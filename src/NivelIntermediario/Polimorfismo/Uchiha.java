package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    /*Override é uma tecnica de polimorfismo , onde estou sobreescrevendo um metodo
    * e fazendo ele ter um resultado diferente*/
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha , um ataque de fogo");
    }
}
