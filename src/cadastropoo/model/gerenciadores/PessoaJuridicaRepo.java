package cadastropoo.model.gerenciadores;

import cadastropoo.model.PessoaJuridica;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class PessoaJuridicaRepo  {
    
    //Atributo contendo a lista de objetos PessoaJuridica
    private List<PessoaJuridica> pessoaJuridicaList;
    
    //Construtor instanciando o pessoaJuridicaList
    public PessoaJuridicaRepo(){
        pessoaJuridicaList = new ArrayList<>();
    }
    
    //Método de inserir
    public void inserir(PessoaJuridica pessoaJuridica){
        pessoaJuridicaList.add(pessoaJuridica.getId(),pessoaJuridica);
    }
    
    //Método de alterar
    public void alterar(int id,PessoaJuridica pessoaJuridica){
        if(id != pessoaJuridica.getId()){
            throw new IllegalArgumentException("");
        }
        else {
            pessoaJuridicaList.set(id,pessoaJuridica);
        }
    }
    
    //Metodo de excluir
    public void excluir(int id){
       pessoaJuridicaList.remove(id);
    }
    
    //Metodo de obter usando id
    public PessoaJuridica obter(int id){
       return pessoaJuridicaList.get(id);
    }
    
    //Metodo de obter todos usando o forEach
    public void obterTodos(){
        pessoaJuridicaList.forEach(System.out::println);
    }

    //Método de persistência de dados
    public void persistir(String caminho) throws Exception{
        FileOutputStream file = new FileOutputStream(caminho);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(pessoaJuridicaList);
        obj.close();
        System.out.println("Dados de pessoa júridica armazenados.");
    }

    //Método para recuperar os dados
    public void recuperar(String caminho) throws Exception{
        FileInputStream file = new FileInputStream(caminho);
        ObjectInputStream obj = new ObjectInputStream(file);
        pessoaJuridicaList = (List<PessoaJuridica>) obj.readObject();
        System.out.println(pessoaJuridicaList);
        System.out.println("Dados de pessoa júridica recuperados.");
    }
}
