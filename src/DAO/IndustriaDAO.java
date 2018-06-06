package DAO;

import Conexão.Conexao;
import Model.Industria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IndustriaDAO {

    private Conexao conexao;
    
    public Industria industria;
    
    public IndustriaDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserir(String nome, String ramo, String porte, String localização, int InvestidoresID){
        
        //criar a SQL com variaveis
        String sql = "insert into Industria(nome, ramo, porte, localização, InvestidoresID)"
                   + "values('"+nome+"','"+ramo+"','"+porte+"','"+localização+"','"+InvestidoresID+"')";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
 
    public boolean atualizarNome(int id, String Nome){
        //criar a SQL com variaveis
        String sql = "UPDATE Industria SET nome = '"+Nome+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarRamo(int id, String Ramo){
        //criar a SQL com variaveis
        String sql = "UPDATE Industria SET Ramo = '"+Ramo+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarPorte(int id, String Porte){
        //criar a SQL com variaveis
        String sql = "UPDATE Industria SET Porte = '"+Porte+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarLocalização(int id, String Localização){
        //criar a SQL com variaveis
        String sql = "UPDATE Industria SET Localização = '"+Localização+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarInvestidoresID(int id, int InvestidoresID){
        //criar a SQL com variaveis
        String sql = "UPDATE Industria SET InvestidoresID = '"+InvestidoresID+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(String nome){
        //criar a SQL com variaveis
        String sql = "DELETE FROM Industria WHERE nome = "+nome;
        
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