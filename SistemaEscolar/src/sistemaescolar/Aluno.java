package sistemaescolar;

public class Aluno {

    private String nome;
    private String matricula;
    private String cpf;

    public Aluno(String nome, String matricula, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setNome(String nome) {
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
        }
    }

    public boolean setMatricula(String matricula) {
        if (matricula == null) {
            System.out.println("Matrícula inválida! \n");
            return false;
        } else {
            String m = matricula.trim();
            if (m.isEmpty()) {
                System.out.println("Matrícula inválida! \n");
                return false;
            } else {
                this.matricula = m;
                return true;
            }

        }

    }

    public boolean setCpf(String cpf) {
        if (cpf == null) {
            System.out.println("CPF inválido! \n");
            return false;
        } else {
            String c = cpf.trim();
            if (c.isEmpty()) {
                System.out.println("CPF inválido! \n");
                return false;

            } else {
                if (c.length() != 11) {
                    System.out.println("CPF inválido! \n");
                    return false;
                }
                if (c.matches("[0-9]+")) {
                    this.cpf = c;
                    return true;
                } else {
                    System.out.println("CPF inválido! \n");
                    return false;
                }
            }
        }
    }
}
