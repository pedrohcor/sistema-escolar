# sistema-escolar
Sistema escolar desenvolvido em Java como projeto acadêmico.

Sistema Escolar

1. Descrição do Projeto

O Sistema Escolar é uma aplicação desenvolvida em Java para auxiliar no gerenciamento de alunos, professores e turmas. O sistema permite cadastrar e consultar informações, além de realizar matrículas de alunos em turmas.

O projeto foi desenvolvido como atividade acadêmica da disciplina de programação, com o objetivo de aplicar conceitos de programação orientada a objetos, estruturas de dados, validação de informações e organização de classes.

2. Integrantes

Taynara Ferreira Silva
Pedro Henrique de Oliveira Correia
Luis Fernando Rodrigues Berquo

3. Funcionalidades

O sistema oferece as seguintes funcionalidades:

Cadastro de alunos, com nome, matrícula e CPF.
Listagem dos alunos cadastrados.
Cadastro de professores, com ID, nome e formação.
Listagem dos professores cadastrados.
Cadastro de turmas, com código, disciplina e professor responsável.
Matrícula de alunos em turmas.
Listagem das turmas cadastradas.
Consulta de alunos por matrícula, incluindo as turmas em que estão matriculados.
Validação de informações para evitar cadastros inválidos e duplicados.

4. Tecnologias Utilizadas

Linguagem: Java.
Ambiente de desenvolvimento: Apache NetBeans.
Estruturas de dados: ArrayList.
Entrada e saída: Scanner e terminal.
Controle de versão: Git e GitHub.

5. Organização do Projeto

O projeto está organizado nas seguintes classes principais:

Aluno: representa os alunos cadastrados e contém seus atributos e métodos de acesso e validação.
Professor: representa os professores, armazenando seus dados e informações relacionadas às turmas.
Turma: representa as turmas, incluindo a disciplina, o professor responsável e os alunos matriculados.
SistemaEscolar: contém o método principal e o menu de interação com o usuário, integrando as funcionalidades do sistema.
6. Divisão das Responsabilidades
Taynara Ferreira Silva: desenvolvimento da classe Turma.
Pedro Henrique de Oliveira Correia: desenvolvimento da classe Aluno.
Luis Fernando Rodrigues Berquo: desenvolvimento da classe Professor.

A integração das classes permite que o sistema execute as operações de cadastro, listagem, matrícula e consulta por meio do menu principal.

7. Como Executar o Projeto
Instale o JDK (Java Development Kit) em seu computador.
Instale o Apache NetBeans, caso ainda não esteja instalado.
Baixe ou copie a pasta do projeto para o computador.
Abra o Apache NetBeans.
Selecione a opção para abrir um projeto existente e escolha a pasta do projeto.
Aguarde o carregamento e a identificação das classes.
Execute a classe SistemaEscolar, que contém o método main.
Utilize o menu apresentado no terminal para acessar as funcionalidades.
8. Exemplo de Utilização

Um exemplo de utilização do sistema é o cadastro de um aluno e sua matrícula em uma turma.

O usuário seleciona a opção Cadastrar aluno.
Informa o nome, a matrícula e o CPF.
O sistema valida os dados e realiza o cadastro.
O usuário cadastra um professor responsável.
Em seguida, cadastra uma turma, informando o código, a disciplina e o ID do professor.
O usuário seleciona a opção Matricular aluno, informa o código da turma e a matrícula do aluno.
Por fim, utiliza a opção Consultar aluno para visualizar os dados do aluno e as turmas em que está matriculado.

O sistema apresenta mensagens informando o resultado das operações e os possíveis erros encontrados durante a utilização.
