package cadastropoo.model;

import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class PessoaFisica extends Pessoa implements Serializable{
    //Atributos
    private String cpf;
    private int idade;
    
    //Construtor padrão
    public PessoaFisica(){}
    
    //Construtor completo
    public PessoaFisica(int id, String nome, String cpf, int idade){
        super(id,nome);
        this.cpf = cpf;
        this.idade = idade;
    }
    //Métodos Getters
    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    //Métodos setters

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String exibir() {
        return super.exibir(); 
    }

    @Override
    public String toString() {
        return new StringBuffer("id: ").append(this.id)
                .append("\n")
                .append("Nome: ")
                .append(this.nome).append("\n")
                .append("cpf: ")
                .append(this.cpf)
                .append("\n")
                .append("idade: ")
                .append(this.idade).toString();
    }
}
