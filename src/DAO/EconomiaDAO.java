package DAO;

import Conexão.Conexao;
import Model.Economia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EconomiaDAO {

    private Conexao conexao;
    
    public Economia economia;
    
    public EconomiaDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserirC(String BolsadeValores, Double cotacao, int idComercio){
        
        //criar a SQL com variaveis
        String sql = "insert into comercio(BolsadeValores, cotacao, idComercio)"
                   + "values('"+ BolsadeValores +"','"+cotacao+"','"+idComercio+"')";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean inserirI(String BolsadeValores, Double cotacao, int idIndustria){
        
        //criar a SQL com variaveis
        String sql = "insert into comercio(BolsadeValores, cotacao, idIndustria)"
                   + "values('"+ BolsadeValores +"','"+cotacao+"','"+idIndustria+")";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarBolsadeValores(int id, String BolsadeValores){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET BolsadeValores = '"+BolsadeValores+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarCotacao(int id, Double Cotacao){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET Cotacao = '"+Cotacao+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarIdComercio(int id, int IdComercio){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET IdComercio = '"+IdComercio+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarIdIndustria(int id, int IdIndustria){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET IdIndustria = '"+IdIndustria+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(int id){
        //criar a SQL com variaveis
        String sql = "DELETE FROM Economia WHERE id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
            
    }
   /*
    public  ArrayList<Cidadao> pesquisa() throws SQLException{


      String sql = "SELECT * FROM cliente"; 
      ArrayList<Cidadao> lista = new ArrayList<>();
      conexao.conectar();



          try (ResultSet rs = conexao.pegarResultadoSQL(sql)) {        
              while(rs.next()){
                  Cidadao cidadao = new Cidadao();

                  cidadao.setCpf(rs.getInt("cpf"));
                  cidadao.setNome(rs.getString("nome"));
                  cidadao.setRegiao(rs.getString("regiao"));
                  cidadao.setNascimento(rs.getString("nascimento"));
                  cidadao.setPaisID(rs.getInt("telefone"));
                 

                  lista.add(cidadao);

              }
              rs.close();  
          }

      return lista;
  }*/

}