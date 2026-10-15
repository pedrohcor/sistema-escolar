package sistemaescolar;

import java.util.ArrayList;

public class Professor {
    
    private String id;
    private String nome;
    private String formacao;

    public Professor(String id, String nome, String formacao) {
        this.id = id;
        this.nome = nome;
        this.formacao = formacao;
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
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getFormacao(){
        return formacao;
    }
    
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }
}
