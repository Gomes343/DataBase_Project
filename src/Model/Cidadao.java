package Model;

import DAO.CidadaoDAO;
import Model.*;

public class Cidadao{


    private String cpf;
    private String nome;
    private String regiao;
    private String nascimento;
    private int PaisID;
        CidadaoDAO dao = new CidadaoDAO();    
    
    //private ClienteDAO dao = new ClienteDAO();// mesmo ele ja inicializado aqui
    //ele ainda nao existe na memoria, ai construtor já cria ele!

    public Cidadao(){
        CidadaoDAO dao = new CidadaoDAO();
    }
    public Cidadao(String cpf, String nome,String regiao, String nascimento, int PaisID){  //inicializando os contrutores
        CidadaoDAO dao = new CidadaoDAO();
        this.nome = nome;
        this.cpf = cpf;
        this.regiao = regiao;
        this.nascimento = nascimento;
        this.PaisID = PaisID;
    }
    
    public boolean enviar(){
        boolean b = dao.inserir(cpf, nome, regiao, nascimento, PaisID);
        return b;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int getPaisID() {
        return PaisID;
    }

    public void setPaisID(int PaisID) {
        this.PaisID = PaisID;
    }
  

}
