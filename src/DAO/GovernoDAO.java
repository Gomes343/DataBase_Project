package DAO;

import Conexão.Conexao;
import Model.Governo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GovernoDAO {

    private Conexao conexao;
    
    public Governo governo;
    
    public GovernoDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserir(String partido, String ideologia, String cargos, int PaisID){
        
        //criar a SQL com variaveis
        String sql = "insert into Governo(partido, ideologia, cargos, PaisID)"
                   + "values('"+partido+"','"+ideologia+"','"+cargos+"','"+PaisID+")";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
 
    public boolean atualizarPartido(int id, String Partido){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET partido = '"+Partido+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarIdeologia(int id, String Ideologia){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET ideologia = '"+Ideologia+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarCargos(int id, String Cargos){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET Cargos = '"+Cargos+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarPaisID(int id, int PaisID){
        //criar a SQL com variaveis
        String sql = "UPDATE Economia SET PaisID = '"+PaisID+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(String partido){
        //criar a SQL com variaveis
        String sql = "DELETE FROM Governo WHERE partido = "+partido;
        
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