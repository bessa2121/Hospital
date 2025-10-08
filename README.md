# Hospital
Software do Projeto de Hospital - Aula de Banco de Dados e Desenvolvimento de Sistemas com Davi Villar 

```bash
package Hospital;

public class Paciente {
    private int idPaciente;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String endereco;

    public Paciente() {}

    public Paciente(int idPaciente, String nome, String dataNascimento, String telefone, String endereco) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters
    public int getIdPaciente() { return idPaciente; }
    public void setIdPaciente(int idPaciente) { this.idPaciente = idPaciente; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    @Override
    public String toString() {
        return "Paciente [id=" + idPaciente + ", nome=" + nome + "]";
    }
}
```


# Guia de Trabalho com Branches Git - Projeto Hospital

Este guia explica como cada grupo deve trabalhar com branches Git para evitar conflitos e garantir que a branch `main` só seja alterada no dia do merge final.

---

## 1. Clonar o repositório

Faça o clone do repositório na sua máquina local (apenas uma vez):

```bash
git clone https://github.com/usuario/repositorio-hospital.git
cd repositorio-hospital 
```


## 2. Criar ou mudar para a branch do seu grupo 

Se a branch do seu grupo ainda não existe:
```bash
git checkout -b grupoX-nome-do-grupo
git push -u origin grupoX-nome-do-grupo
```

Se a branch do seu grupo já existe:
```bash
git checkout grupoX-nome-do-grupo
git pull origin grupoX-nome-do-grupo
```

## 3. Trabalhar na sua branch

Edite apenas os arquivos que seu grupo foi designado para modificar.

Depois de editar, faça commit das alterações:
```bash
git add .
git commit -m "Descrição clara das alterações feitas"
```
## 4. Subir as alterações apenas para sua branch
```bash
git push origin grupoX-nome-do-grupo
```

Importante: Isso envia suas alterações apenas para a branch do seu grupo. A branch main não será alterada.

## 5. Atualizar sua branch com as últimas mudanças da main

Periodicamente, para evitar conflitos futuros, atualize sua branch com as mudanças da main:
```bash
git checkout main
git pull origin main
```
```bash
git checkout grupoX-nome-do-grupo
git merge main
```
```bash
git push origin grupoX-nome-do-grupo
```

Nota: Isso não altera a branch main, apenas traz as atualizações dela para a sua branch.

## 6. O que evitar até o dia do merge final

Não fazer merge da sua branch na main.

Não abrir Pull Requests para a main.

Não trabalhar diretamente na branch main.

## 7. Verificar em qual branch você está

Use este comando para garantir que está trabalhando na branch correta:
```bash
git branch
```

A branch ativa aparecerá com um *.
Sempre trabalhe em sua branch de grupo, nunca na main.

## 8. Resumo dos comandos principais
### Clonar repositório (1 vez)
```bash
git clone https://github.com/usuario/repositorio-hospital.git
cd repositorio-hospital
```
### Criar branch do grupo (se não existir)
```bash
git checkout -b grupoX-nome-do-grupo
git push -u origin grupoX-nome-do-grupo
```
### Entrar na branch do grupo (se já existir)
```bash
git checkout grupoX-nome-do-grupo
git pull origin grupoX-nome-do-grupo
```
### Trabalhar, commitar e enviar para a branch do grupo
```bash
git add .
git commit -m "Descrição das alterações"
git push origin grupoX-nome-do-grupo
```
### Atualizar branch do grupo com as mudanças da main (regularmente)
```bash
git checkout main
git pull origin main
git checkout grupoX-nome-do-grupo
git merge main
git push origin grupoX-nome-do-grupo
```
## 9. Divisão dos arquivos por grupo (sugestão)
- Grupo 1	Especialidade_medico.java, Especialidade_enfermeiro.java
- Grupo 2	Estoque_remedio.java, Sala.java
- Grupo 3	Funcionario.java, Cargo.java
- Grupo 4	Remedio.java, Receita.java
- Grupo 5	Consulta.java, Paciente.java
