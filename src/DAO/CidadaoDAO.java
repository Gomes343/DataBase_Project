package DAO;

import Conexão.Conexao;
import Model.Cidadao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CidadaoDAO {

    private Conexao conexao;
    
    public Cidadao cidadao;
    
    public CidadaoDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserir(String nome, int cpf,String regiao, String nascimento, int PaisID){
        
        //criar a SQL com variaveis
        String sql = "insert into cidadao(nome,cpf,regiao,nascimento,PaisID)"
                   + "values('"+ nome +"','"+cpf+"','"+regiao+"','"+nascimento+"','"+PaisID+")";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarNome(int id, String nome){
        //criar a SQL com variaveis
        String sql = "UPDATE cliente SET nome = '"+nome+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarCPF(int id, String cpf){
        //criar a SQL com variaveis
        String sql = "UPDATE cliente SET cpf = '"+cpf+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(int id){
        //criar a SQL com variaveis
        String sql = "DELETE FROM cliente WHERE id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
            
    }
   
    public boolean apagarCPF(String cpf){
        //criar a SQL com variaveis
        String sql = "DELETE FROM cliente WHERE cpf = "+cpf+";";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
            
    }
 
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
  }

}