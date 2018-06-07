package Conexão;

import Conexão.*;

public class Conexao extends ConexaoAbstract {

    public Conexao() {

    }

    @Override
    public void configurar() {
        this.port = PORT_MYSQL;
        this.className= CLASSNAME_MYSQL;
        this.setConexao(MYSQL, "gtcon073_projeto", "127.0.0.1");
        this.setLogin("root", "aluno123");        
    }

}