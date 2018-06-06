package Controller;

import DAO.CidadaoDAO;
import Model.Cidadao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CidadaoInsertController implements Initializable {
    
    @FXML Label label01;
    @FXML TextField field01;
    @FXML TextField field02;
    @FXML TextField field03;
    @FXML TextField field04;
    @FXML TextField field05;
    @FXML Button buttonVoltar;
    @FXML Button buttonCriar;
    @FXML Button buttonConsultar;
    
    
   CidadaoDAO dao = new CidadaoDAO();
   
   private String cpf;
   private String nome;
   private String regiao;
   private String nascimento;
   private int PaisID;
   
   @FXML private void Criar(ActionEvent event){
       
       if(field01.getText() == null || field02.getText() == null || field03.getText() == null || field04.getText() == null || field05.getText() == null)
           label01.setText(("Todos os campos devem ser preenchidos!"));
           
           
       if(field01.getText() != null && field02.getText() != null && field03.getText() != null && field04.getText() != null && field05.getText() != null){ 
           cpf = field01.getText();
           nome = field02.getText();
           regiao = field03.getText();
           nascimento = field04.getText();
           PaisID = Integer.parseInt(field05.getText());
           
       
       if(dao.inserir(cpf, nome, regiao, nascimento, PaisID)){
           label01.setText(("Cadastro realizado com sucesso!"));
       }else{
           label01.setText(("Erro no envio para Banco de Dados!"));
       }   
       }
   }
       

   
   
   
    @FXML private void Voltar(ActionEvent event) throws Exception {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/View/menuInicial.fxml"));
        } catch (IOException ex) {
    
        }
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
