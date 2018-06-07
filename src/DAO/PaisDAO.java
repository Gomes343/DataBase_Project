package DAO;

import Conexão.Conexao;
import Model.Industria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PaisDAO {

    private Conexao conexao;
    
    public Industria industria;
    
    public PaisDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserir(String nome, String idioma, String localização, String território){
        
        //criar a SQL com variaveis
        String sql = "insert into Pais(nome,localização,territorio,idioma)"
                   + "values('"+nome+"','"+localização+"','"+território+"','"+idioma+"')";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
 
    public boolean atualizarNome(int id, String Nome){
        //criar a SQL com variaveis
        String sql = "UPDATE Pais SET nome = '"+Nome+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarIdioma(int id, String Idioma){
        //criar a SQL com variaveis
        String sql = "UPDATE Pais SET idioma = '"+Idioma+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarLocalização(int id, String Localização){
        //criar a SQL com variaveis
        String sql = "UPDATE Pais SET localização = '"+Localização+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarTerritorio(int id, String Territorio){
        //criar a SQL com variaveis
        String sql = "UPDATE Pais SET territorio = '"+Territorio+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(int id){
        
        String sql = "SET foreign_key_checks = 0";
        
        conexao.conectar();
        
        sql = "DELETE FROM pais WHERE id = "+id;
        
        conexao.conectar();
        
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