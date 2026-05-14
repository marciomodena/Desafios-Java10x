package NivelIntermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;
    String habilidadeEspecial;

    public void mostrarInformacoes() {
        System.out.println(
                nome + " " +
                        idade + " " +
                        missao + " " +
                        nivelDeDificuldade + " " +
                        statusMissao
        );
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }
}

