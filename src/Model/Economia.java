package Model;

import Model.*;

public class Economia{


    private int id;
    private String BolsadeValores;
    private Double cotacao;
    private int idComercio;
    private int idIndustria;

    public Economia(int id, String BolsadeValores, Double cotacao, int idComercio) {
        this.id = id;
        this.BolsadeValores = BolsadeValores;
        this.cotacao = cotacao;
        this.idComercio = idComercio;
    }
  
    public Economia(int id, int idIndustria, String BolsadeValores, Double cotacao) {
        this.id = id;
        this.BolsadeValores = BolsadeValores;
        this.cotacao = cotacao;
        this.idIndustria = idIndustria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBolsadeValores() {
        return BolsadeValores;
    }

    public void setBolsadeValores(String BolsadeValores) {
        this.BolsadeValores = BolsadeValores;
    }

    public Double getCotacao() {
        return cotacao;
    }

    public void setCotacao(Double cotacao) {
        this.cotacao = cotacao;
    }

    public int getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(int idComercio) {
        this.idComercio = idComercio;
    }

    public int getIdIndustria() {
        return idIndustria;
    }

    public void setIdIndustria(int idIndustria) {
        this.idIndustria = idIndustria;
    }
    
}
