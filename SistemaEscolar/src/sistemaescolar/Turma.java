
package sistemaescolar;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private String nomeDisciplina;
    private Professor professor;
    private ArrayList<Aluno> aluno;
    
    public Turma(String codigo, String nomeDisciplina, Professor professor){
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.aluno = new ArrayList<>();   
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    public ArrayList<Aluno> getAlunos(){
        return aluno;
    }
    public boolean contemAluno(String matricula){
        if (matricula == null || matricula.trim().isEmpty()) {
            return false;
        }

        for (Aluno a : aluno) {
            if (a != null && a.getMatricula() != null) {
                if (a.getMatricula().trim().equalsIgnoreCase(matricula.trim())) {
                    return true;
            }
        }
    }
    return false; 
    }
    public boolean matricularAluno(Aluno novoAluno){
        if (novoAluno == null || novoAluno.getMatricula() == null || novoAluno.getMatricula().trim().isEmpty()) {
            return false;
        }

        if (contemAluno(novoAluno.getMatricula())) {
            return false;
        }

        aluno.add(novoAluno);
        return true;
    }
    public String getDadosFormatados() {
        String nomeProf = (professor != null && professor.getNome() != null && !professor.getNome().trim().isEmpty()) 
                          ? professor.getNome() 
                          : "Professor Inválido/Não Cadastrado";

        String texto = "Código: " + codigo + " | Disciplina: " + nomeDisciplina + " | Professor: " + nomeProf + "\n";
        texto += "Alunos Matriculados (" + aluno.size() + "):\n";

        if (aluno.isEmpty()) {
            texto += "  - Nenhum aluno matriculado nesta turma.\n";
        } else {
            for (Aluno a : aluno) {
                if (a != null) {
                    String nomeAluno = (a.getNome() != null && !a.getNome().trim().isEmpty()) 
                                       ? a.getNome() 
                                       : "Nome não informado";
                                       
                    texto += "  - [" + a.getMatricula() + "] " + nomeAluno + "\n";
                }
            }
        }
        return texto;
    
    }
}
//Final Classe
