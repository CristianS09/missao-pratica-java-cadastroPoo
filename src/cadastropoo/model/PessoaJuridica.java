package cadastropoo.model;

import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class PessoaJuridica extends Pessoa implements Serializable{
    //Atributos
    private String cnpj;
    
    //Construtor padrão
    public PessoaJuridica(){}
    
    //Construtor Completo
    public PessoaJuridica(int id, String nome,String cnpj){
        super(id,nome);
        this.cnpj = cnpj;
    }

    //Métodos Getters
    public String getCnpj() {
        return cnpj;
    }
    //Métodos setters
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
                .append("cnpj: ")
                .append(this.cnpj).toString();
    }
}
