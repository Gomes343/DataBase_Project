package Model;

import DAO.CidadaoDAO;
import DAO.ComercioDAO;
import Model.*;

public class Comercio{


    private int id;
    private String nome;
    private String ramo;
    private String porte;
    private String localização;
    private int SocioID;
    private ComercioDAO dao = new ComercioDAO();
    
    //private ClienteDAO dao = new ClienteDAO();// mesmo ele ja inicializado aqui
    //ele ainda nao existe na memoria, ai construtor já cria ele!

    public Comercio(String nome, String ramo, String porte, String localização, int SocioID) {
        this.nome = nome;
        this.ramo = ramo;
        this.porte = porte;
        this.localização = localização;
        this.SocioID = SocioID;
        dao = new ComercioDAO();
    }

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
