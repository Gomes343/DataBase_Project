/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CidadaoDAO;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CidadaoDeleteController implements Initializable {
    
    @FXML private Label label01;
    @FXML private TextField textField01;
    @FXML private Button buttonDeletar;
    @FXML private Button buttonVoltar;
    @FXML private Button buttonConsultar;
    
    
    
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
    
    @FXML private void Apagar(ActionEvent event) {
        String cpf = textField01.getText();
        CidadaoDAO dao = new CidadaoDAO();
        
        
        if(dao.apagar(cpf)){
            label01.setText("CPF encontrado e apagado com Sucesso!");
        }else{
            label01.setText("CPF Inexistente ou incorreto!");
            textField01.setText("");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
