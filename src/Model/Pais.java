package Model;

import DAO.PaisDAO;
import Model.*;

public class Pais{

    private int id;
    private String nome;
    private String idioma;
    private String localização;
    private String território;
    private PaisDAO dao = new PaisDAO();
    
    //private ClienteDAO dao = new ClienteDAO();// mesmo ele ja inicializado aqui
    //ele ainda nao existe na memoria, ai construtor já cria ele!

    public Pais(String nome, String idioma, String localização, String território){  //inicializando os contrutores
        dao = new PaisDAO();
        
        this.nome = nome;
        this.idioma = idioma;
        this.localização = localização;
        this.território = território;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public String getTerritório() {
        return território;
    }

    public void setTerritório(String território) {
        this.território = território;
    }
  
}
