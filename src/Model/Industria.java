package Model;

import DAO.IndustriaDAO;
import Model.*;

public class Industria{

    private int id;
    private String nome;
    private String ramo;
    private String porte;
    private String localização;
    private int InvestidoresID;
    private IndustriaDAO dao = new IndustriaDAO();

    public Industria(String nome, String ramo, String porte, String localização, int InvestidoresID) {
        dao = new IndustriaDAO();
        this.nome = nome;
        this.ramo = ramo;
        this.porte = porte;
        this.localização = localização;
        this.InvestidoresID = InvestidoresID;
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

    public int getInvestidoresID() {
        return InvestidoresID;
    }

    public void setInvestidoresID(int InvestidoresID) {
        this.InvestidoresID = InvestidoresID;
    }

    public IndustriaDAO getDao() {
        return dao;
    }

    public void setDao(IndustriaDAO dao) {
        this.dao = dao;
    }
    
    
    
   
}
