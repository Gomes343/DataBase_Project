package Model;

import Model.*;

public class Industria{


    private int id;
    private String nome;
    private String cpf;
    //private ClienteDAO dao = new ClienteDAO();// mesmo ele ja inicializado aqui
    //ele ainda nao existe na memoria, ai construtor já cria ele!

    public Industria(String nome, String cpf){  //inicializando os contrutores
        //dao = new ClienteDAO();
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public boolean verificar(){
        if(cpf.length()!=11){
            return false;
        }else{
        if(nome.length() < 5 ){
            return false;
        }
        }
        return true;
    }
    
    //public boolean enviar(){
       // boolean b = dao.inserir(this.getNome(),this.getCpf());
       // return b;
    //}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /*
    public void inserir(String nome, String cpf){
        dao.inserir(nome, cpf);
    }               //metodo feio mas funfa
    
    
    public static void main(String[]args){
        Cliente cliente = new Cliente("Jose","12345678911");
        cliente.setNome("José");
        cliente.setCpf("12345678911");
        ClienteDAO dao = new ClienteDAO();
        
        boolean b = dao.inserir(cliente.getNome(),cliente.getCpf());
        
        if(b){
            System.out.println("Inserido com Sucesso");
        }else{
            System.out.println("Erro");
        }
        
        
        
    }*/

}
