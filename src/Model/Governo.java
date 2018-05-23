package Model;

import Model.*;

public class Governo{

    private int id;
    private String partido;
    private String ideologia;
    private String cargos;
    private int PaisID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(String ideologia) {
        this.ideologia = ideologia;
    }

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    public int getPaisID() {
        return PaisID;
    }

    public void setPaisID(int PaisID) {
        this.PaisID = PaisID;
    }
    
    
    //private ClienteDAO dao = new ClienteDAO();// mesmo ele ja inicializado aqui
    //ele ainda nao existe na memoria, ai construtor já cria ele!

    public Governo(String partido, String ideologia, String cargos, int PaisID) {
        this.id = id;
        this.partido = partido;
        this.ideologia = ideologia;
        this.cargos = cargos;
        this.PaisID = PaisID;
    }


}
