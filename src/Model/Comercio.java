package Model;

import Model.*;

public class Comercio{


    private int id;
    private String nome;
    private String ramo;
    private String porte;
    private String localização;
    private int SocioID;
    
    //private ClienteDAO dao = new ClienteDAO();// mesmo ele ja inicializado aqui
    //ele ainda nao existe na memoria, ai construtor já cria ele!

    public Comercio(int id, String nome, String ramo, String porte, String localização, int SocioID) {
        this.id = id;
        this.nome = nome;
        this.ramo = ramo;
        this.porte = porte;
        this.localização = localização;
        this.SocioID = SocioID;
    }
  
    //public boolean enviar(){
       // boolean b = dao.inserir(this.getNome(),this.getCpf());
       // return b;
    //}

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

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public int getSocioID() {
        return SocioID;
    }

    public void setSocioID(int SocioID) {
        this.SocioID = SocioID;
    }

}
