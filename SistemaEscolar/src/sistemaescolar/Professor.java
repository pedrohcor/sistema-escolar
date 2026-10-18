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
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean setNome(String nome){
    if (nome == null) {
            System.out.println("Nome inválido!\n");
            return false;
        } else {
            String n = nome.trim();

            if (n.isEmpty()) {
                System.out.println("Nome inválido!\n");
                return false;
            } else {
                this.nome = n;
                return true;
            }
        }    }
    
    public String getFormacao(){
        return formacao;
    }
    
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }
    
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
