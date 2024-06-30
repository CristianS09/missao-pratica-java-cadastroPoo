package cadastropoo.model.gerenciadores;

import cadastropoo.model.Pessoa;
import cadastropoo.model.PessoaFisica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class PessoaFisicaRepo implements Serializable {

    //Atributo contendo a lista de objetos PessoaFisica
    private List<PessoaFisica> pessoaFisicaList;
    
    //Construtor instanciando o pessoaFisicaList
    public PessoaFisicaRepo(){
        pessoaFisicaList = new ArrayList<>();
    }
    
    //Método de inserir
    public void inserir(PessoaFisica pessoaFisica){
        pessoaFisicaList.add(pessoaFisica.getId(),pessoaFisica);
    }
    
    //Método de alterar
    public void alterar(int id,PessoaFisica pessoaFisica){
        if(id != pessoaFisica.getId()){
            throw new IllegalArgumentException("Id inválido");
        }
        else {
            pessoaFisicaList.set(id,pessoaFisica);
        }
    }
    
    //Metodo de excluir
    public void excluir(int id){
       pessoaFisicaList.remove(id);
    }
    
    //Metodo de obter usando id
    public PessoaFisica obter(int id){
        return pessoaFisicaList.get(id);
    }

    //Metodo de obter todos usando o forEach
    public void obterTodos(){
        pessoaFisicaList.forEach(System.out::println);
    }

    //Método de persistência de dados
    public void persistir(String caminho) throws Exception{
        FileOutputStream file = new FileOutputStream(caminho);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(pessoaFisicaList);
        obj.close();
        System.out.println("Dados de pessoa física armazenados.");
    }

    //Método para recuperar os dados
    public void recuperar(String caminho) throws Exception{
        FileInputStream file = new FileInputStream(caminho);
        ObjectInputStream obj = new ObjectInputStream(file);
        pessoaFisicaList = (List<PessoaFisica>) obj.readObject();
        System.out.println(pessoaFisicaList);
        System.out.println("Dados de pessoa física recuperados.");
    }

}
