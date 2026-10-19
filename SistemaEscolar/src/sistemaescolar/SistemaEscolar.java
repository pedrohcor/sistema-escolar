
package sistemaescolar;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();
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
                    String matriculaAluno = scanner.nextLine();
                    System.out.print("Digite o CPF do aluno: "); 
                    String cpfAluno = scanner.nextLine();

                    Aluno novoAluno = new Aluno(nomeAluno, matriculaAluno, cpfAluno);
                    alunos.add(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                   if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\n=== ALUNOS CADASTRADOS ===");
                        for (Aluno a : alunos) {
                            System.out.println("Matrícula: " + a.getMatricula() + " | Nome: " + a.getNome());
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
                   System.out.print("Digite o código da turma: ");
                    String codTurma = scanner.nextLine();
                    System.out.print("Digite o nome da disciplina: ");
                    String disciplina = scanner.nextLine();
                    System.out.print("Digite o ID do professor responsável: ");
                    String idProf = scanner.nextLine();

                    Professor profResponsavel = null;
                    for (Professor p : professores) {
                        if (p.getId() != null && p.getId().equals(idProf)) {
                            profResponsavel = p;
                    break;
                        }
                    }

                    if (profResponsavel == null) {
                        System.out.println("Erro: Professor não encontrado! Cadastre o professor primeiro.");
                    } else {
                        Turma novaTurma = new Turma(codTurma, disciplina, profResponsavel);
                        turmas.add(novaTurma);
                        System.out.println("Turma cadastrada com sucesso!");
                    }
                    break;
                    
                case 6:
                   System.out.print("Digite o código da turma: ");
                    String buscaCodTurma = scanner.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    String buscaMatricula = scanner.nextLine();

                    Turma turmaEncontrada = null;
                    for (Turma t : turmas) {
                        if (t.getCodigo() != null && t.getCodigo().equalsIgnoreCase(buscaCodTurma)) {
                            turmaEncontrada = t;
                    break;
                        }
                    }

                    Aluno alunoEncontrado = null;
                    for (Aluno a : alunos) {
                        if (a.getMatricula() != null && a.getMatricula().equalsIgnoreCase(buscaMatricula)) {
                            alunoEncontrado = a;
                            break;
                        }
                    }

                    if (turmaEncontrada == null) {
                        System.out.println("Erro: Turma não encontrada.");
                    } else if (alunoEncontrado == null) {
                        System.out.println("Erro: Aluno não encontrado.");
                    } else {
                        boolean sucesso = turmaEncontrada.matricularAluno(alunoEncontrado);
                        if (sucesso) {
                            System.out.println("Aluno matriculado com sucesso na turma " + turmaEncontrada.getNomeDisciplina() + "!");
                        } else {
                            System.out.println("Erro: Aluno já está na turma ou dados inválidos.");
                        }
                    }
                    break;

                case 7:
                   if (turmas.isEmpty()) {
                        System.out.println("Nenhuma turma cadastrada.");
                    } else {
                        System.out.println("\n=== TURMAS CADASTRADAS ===");
                        for (Turma t : turmas) {
                            
                            System.out.println(t.getDadosFormatados());
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 8:
                   System.out.print("Digite a matrícula do aluno que deseja consultar: ");
                    String matriculaConsulta = scanner.nextLine();

                    Aluno alunoConsultado = null;
                    for (Aluno a : alunos) {
                        if (a.getMatricula() != null && a.getMatricula().equalsIgnoreCase(matriculaConsulta)) {
                            alunoConsultado = a;
                    break;
                        }
                    }

                    if (alunoConsultado == null) {
                        System.out.println("Erro: Aluno com matrícula '" + matriculaConsulta + "' não encontrado.");
                    } else {
                        System.out.println("\n=== DADOS DO ALUNO ===");
                        System.out.println("Nome: " + alunoConsultado.getNome());
                        System.out.println("Matrícula: " + alunoConsultado.getMatricula());
                        System.out.println("Turmas matriculadas:");
                        boolean encontrouTurma = false;
                        
                        for (Turma t : turmas) {
                            if (t.contemAluno(alunoConsultado.getMatricula())) {
                                System.out.println("  - " + t.getNomeDisciplina() + " (Código: " + t.getCodigo() + ")");
                                encontrouTurma = true;
                            }
                        }
                        
                        if (!encontrouTurma) {
                            System.out.println("  - O aluno ainda não está matriculado em nenhuma turma.");
                        }
                        System.out.println("======================");
                    }
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