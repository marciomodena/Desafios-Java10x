package NivelIntermediario.Desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Ninja> ninja = new ArrayList<>();
        int escolhaDoUsuario;
        String resposta;

        while (true) {
            System.out.println("\n=== Cadastro de Ninjas ===");
            System.out.println("1- Cadastrar um novo Ninja");
            System.out.println("2- Exibir informações");
            System.out.println("3- Atualizar habilidade especial");
            System.out.println("4- Sair");

            escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (escolhaDoUsuario) {

                // ================= CADASTRO =================
                case 1:
                    System.out.println("O Ninja é um Uchiha? (s/n)");
                    resposta = scanner.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {

                        Uchiha u = new Uchiha();

                        System.out.println("Nome:");
                        u.nome = scanner.nextLine();

                        System.out.println("Idade:");
                        u.idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Missão:");
                        u.missao = scanner.nextLine();

                        System.out.println("Dificuldade:");
                        u.nivelDeDificuldade = scanner.nextLine();

                        System.out.println("Status:");
                        u.statusMissao = scanner.nextLine();

                        System.out.println("Habilidade especial:");
                        u.habilidadeEspecial = scanner.nextLine();

                        ninja.add(u);

                    } else {

                        Uzumaki u = new Uzumaki();

                        System.out.println("Nome:");
                        u.nome = scanner.nextLine();

                        System.out.println("Idade:");
                        u.idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Missão:");
                        u.missao = scanner.nextLine();

                        System.out.println("Dificuldade:");
                        u.nivelDeDificuldade = scanner.nextLine();

                        System.out.println("Status:");
                        u.statusMissao = scanner.nextLine();

                        System.out.println("Habilidade especial:");
                        u.habilidadeEspecial = scanner.nextLine();

                        ninja.add(u);
                    }
                    break;

                // ================= EXIBIR =================
                case 2:
                    if (ninja.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                        break;
                    }

                    System.out.println("Deseja ver Uchiha ou Uzumaki? (uchiha/uzumaki)");
                    resposta = scanner.nextLine();

                    for (Ninja n : ninja) {

                        if (resposta.equalsIgnoreCase("uchiha") && n instanceof Uchiha) {
                            n.mostrarInformacoes();
                            System.out.println("-----");

                        } else if (resposta.equalsIgnoreCase("uzumaki") && n instanceof Uzumaki) {
                            n.mostrarInformacoes();
                            System.out.println("-----");
                        }
                    }
                    break;

                // ================= ATUALIZAR =================
                case 3:
                    if (ninja.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                        break;
                    }

                    System.out.println("Digite o nome do ninja que deseja atualizar:");
                    String nomeBusca = scanner.nextLine();

                    boolean encontrado = false;

                    for (Ninja n : ninja) {
                        if (n.nome.equalsIgnoreCase(nomeBusca)) {

                            System.out.println("Nova habilidade especial:");
                            String novaHabilidade = scanner.nextLine();

                            if (n instanceof Uchiha) {
                                ((Uchiha) n).habilidadeEspecial = novaHabilidade;

                            } else if (n instanceof Uzumaki) {
                                ((Uzumaki) n).habilidadeEspecial = novaHabilidade;
                            }

                            System.out.println("Habilidade atualizada com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Ninja não encontrado.");
                    }

                    break;

                // ================= SAIR =================
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}