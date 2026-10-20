package sistemaescolar;

import java.util.ArrayList;

public class Turma {

    private String codigo;
    private String nomeDisciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, String nomeDisciplina, Professor professor) {
        setCodigo(codigo);
        setNomeDisciplina(nomeDisciplina);
        setProfessor(professor);
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            return false;
        }
        this.codigo = codigo.trim();
        return true;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public boolean setNomeDisciplina(String nomeDisciplina) {
        if (nomeDisciplina == null || nomeDisciplina.trim().isEmpty()) {
            return false;
        }
        this.nomeDisciplina = nomeDisciplina.trim();
        return true;
    }

    public Professor getProfessor() {
        return professor;
    }

    public boolean setProfessor(Professor professor) {
        if (professor == null) {
            return false;
        }
        this.professor = professor;
        return true;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public boolean setAlunos(ArrayList<Aluno> alunos) {
        if (alunos == null) {
            return false;
        }
        this.alunos = alunos;
        return true;
    }

    public boolean contemAluno(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            return false;
        }

        for (Aluno a : alunos) {
            if (a != null && a.getMatricula() != null
                    && a.getMatricula().equalsIgnoreCase(matricula.trim())) {
                return true;
            }
        }

        return false;
    }

    public boolean matricularAluno(Aluno novoAluno) {
        if (novoAluno == null
                || novoAluno.getMatricula() == null
                || novoAluno.getMatricula().trim().isEmpty()) {
            return false;
        }

        if (contemAluno(novoAluno.getMatricula())) {
            return false;
        }

        alunos.add(novoAluno);
        return true;
    }

    public String getDadosFormatados() {
        String dados = "Código: " + (codigo != null ? codigo : "Não informado")
                + "\nDisciplina: " + (nomeDisciplina != null ? nomeDisciplina : "Não informada");

        if (professor != null && professor.getNome() != null) {
            dados += "\nProfessor responsável: " + professor.getNome();
        } else {
            dados += "\nProfessor responsável: Não informado";
        }

        dados += "\nAlunos matriculados:";

        if (alunos == null || alunos.isEmpty()) {
            dados += "\n  - Nenhum aluno matriculado";
        } else {
            for (Aluno a : alunos) {
                if (a != null) {
                    dados += "\n  - " + (a.getNome() != null ? a.getNome() : "Sem nome")
                            + " (Matrícula: " + (a.getMatricula() != null ? a.getMatricula() : "Sem matrícula") + ")";
                }
            }
        }

        return dados;
    }
}
