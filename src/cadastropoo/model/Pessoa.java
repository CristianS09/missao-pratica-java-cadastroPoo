package cadastropoo.model;

import java.io.Serializable;

/**
 *
 * @author Cristian
 */

public class Pessoa implements Serializable{
    //Atributos
    protected int id;
    protected String nome;
    
    //Construtor padrão
    public Pessoa(){}
    
    //Construtor completo
    public Pessoa(int id,String nome){
        this.id = id;
        this.nome = nome;
    }
    
    //Métodos Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    //Métodos setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String exibir(){
        return toString();
    }

    @Override
    public String toString() {
        return this.nome + " " + this.id;
    } 
}
