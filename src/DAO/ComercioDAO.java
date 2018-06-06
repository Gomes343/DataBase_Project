package DAO;

import Conexão.Conexao;
import Model.Comercio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComercioDAO {

    private Conexao conexao;
    
    public Comercio comercio;
    
    public ComercioDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserir(String nome, String ramo, String porte, String localização, int SocioID){
        
        //criar a SQL com variaveis
        String sql = "insert into comercio(nome,cpf,regiao,nascimento,PaisID)"
                   + "values('"+ nome +"','"+ramo+"','"+porte+"','"+localização+"','"+SocioID+"')";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarNome(int id, String nome){
        //criar a SQL com variaveis
        String sql = "UPDATE Comercio SET nome = '"+nome+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarRamo(int id, String ramo){
        //criar a SQL com variaveis
        String sql = "UPDATE Comercio SET ramo = '"+ramo+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarPorte(int id, String porte){
        //criar a SQL com variaveis
        String sql = "UPDATE Comercio SET porte = '"+porte+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarLocalização(int id, String Localização){
        //criar a SQL com variaveis
        String sql = "UPDATE Comercio SET Localização = '"+Localização+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarSocioID(int id, int SocioID){
        //criar a SQL com variaveis
        String sql = "UPDATE Comercio SET SocioID = '"+SocioID+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(String nome){
        //criar a SQL com variaveis
        String sql = "DELETE FROM Comercio WHERE nome = "+nome;
        
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