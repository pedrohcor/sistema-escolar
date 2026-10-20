
package sistemaescolar;

import java.util.ArrayList;

public class Professor {

    private String id;
    private String nome;
    private String formacao;
    private ArrayList<Turma> turmas;

    public Professor(String id, String nome, String formacao) {
        this.id = id;
        this.nome = nome;
        this.formacao = formacao;
        this.turmas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("ID inválido!\n");
            return false;
        } else {
            this.id = id.trim();
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido!\n");
            return false;
        } else {
            this.nome = nome.trim();
            return true;
        }
    }

    public String getFormacao() {
        return formacao;
    }

    public boolean setFormacao(String formacao) {
        if (formacao == null || formacao.trim().isEmpty()) {
            System.out.println("Formação inválida!\n");
            return false;
        } else {
            this.formacao = formacao.trim();
            return true;
        }
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        if (turmas == null) {
            System.out.println("Lista de turmas inválida!\n");
        } else {
            this.turmas = turmas;
        }
    }

    public boolean adicionarTurma(Turma turma) {
        if (turma == null || turmas.contains(turma)) {
            return false;
        }

        turmas.add(turma);
        return true;
    }
}
