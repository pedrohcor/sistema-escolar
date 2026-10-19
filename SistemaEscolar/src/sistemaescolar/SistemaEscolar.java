package sistemaescolar;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();

        do {
            System.out.println("================================");
            System.out.println("         SISTEMA ESCOLAR");
            System.out.println("================================");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Cadastrar professor");
            System.out.println("4. Listar professores");
            System.out.println("5. Cadastrar turma");
            System.out.println("6. Matricular aluno");
            System.out.println("7. Listar turmas");
            System.out.println("8. Consultar aluno");
            System.out.println("9. Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();

                    System.out.print("Digite a matrícula do aluno: ");
                    String matricula = scanner.nextLine();

                    System.out.print("Digite o CPF do aluno: ");
                    String cpf = scanner.nextLine();

                    Aluno aluno = new Aluno(nomeAluno, matricula, cpf);

                    if (aluno.setNome(nomeAluno)
                            && aluno.setMatricula(matricula)
                            && aluno.setCpf(cpf)) {

                        System.out.println("Aluno cadastrado com sucesso!");
                        alunos.add(aluno);

                    } else {
                        System.out.println("Não foi possível cadastrar aluno.");
                    }
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\n=== ALUNOS CADASTRADOS ===");

                        for (Aluno a : alunos) {
                            System.out.println("Nome: " + a.getNome());
                            System.out.println("Matrícula: " + a.getMatricula());
                            System.out.println("CPF: " + a.getCpf());
                            System.out.println("------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do professor: ");
                    String id = scanner.nextLine();

                    System.out.print("Digite o nome do professor: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a formação do professor: ");
                    String formacao = scanner.nextLine();

                    Professor professor = new Professor(id, nome, formacao);

                    if (professor.setId(id)
                            && professor.setNome(nome)
                            && professor.setFormacao(formacao)) {

                        professores.add(professor);
                        System.out.println("Professor cadastrado com sucesso!");

                    } else {
                        System.out.println("Não foi possível cadastrar o professor.");
                    }
                    break;
                case 4:
                    if (professores.isEmpty()) {
                        System.out.println("Nenhum professor cadastrado.");
                    } else {
                        System.out.println("\n=== PROFESSORES CADASTRADOS ===");

                        for (Professor p : professores) {
                            System.out.println("ID: " + p.getId());
                            System.out.println("Nome: " + p.getNome());
                            System.out.println("Formação: " + p.getFormacao());
                            System.out.println("------------------------------");
                        }
                    }
                    break;

                case 5:
                    // Cadastrar turma
                    break;

                case 6:
                    // Matricular aluno
                    break;

                case 7:
                    // Listar turmas
                    break;

                case 8:
                    // Consultar aluno
                    break;

                case 9:
                    System.out.println("Encerrando o Sistema Escolar...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println();

        } while (opcao != 9);

        scanner.close();
    }
}
