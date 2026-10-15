
package sistemaescolar;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private String nomeDisciplina;
    private Professor professor;
    private ArrayList<Aluno> aluno;
    
    public Turma(String codigo, String nomeDisciplina, Professor professor){
        this. codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.aluno = new ArrayList<>();   
    }
    
    public String getcodigo(){
        return codigo;
    }
    
    public String getnomeDisciplina(){
        return nomeDisciplina;
    }
    
    public Professor getprofessor(){
        return professor;
    }
    
    public ArrayList<Aluno> getAlunos(){
        return aluno;
    }
    public boolean contemAluno(String matricula){
        for (Aluno a: aluno){
            if (a.getMatricula().equalsIgnoreCase(matricula)){
                return true;
            }
        }
    return false;
    }
    
    public boolean matricularAluno(Aluno novoAluno){
        if(contemAluno(novoAluno.getMatricula())){
            return false;
        }
        aluno.add(novoAluno);
        return true;
    }
    public void exibirTurma(){
        String texto = "codigo: " + codigo + "| Disciplina. " + nomeDisciplina + "
               texto += "Alunos Matriculados (" + aluno.size() + "):\n";
               
        if(aluno.isEmpty()){
            texto += " - Nenhum aluno matriculado nesta turma. \n";
        }else{
            for(Aluno a : aluno){
                texto += " -[" + a.getMatricula() + "]" + a.getNome() + "\n";
            }
        }
    return texto;
    }
    
    
}
