package Controller;

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

/**
 *
 * @author a1700677
 */
public class EconomiaUpdateController implements Initializable {
    
    
    @FXML private Label label01;
    @FXML private TextField textField01;
    @FXML private TextField textField02;
    @FXML private TextField textField03;
    @FXML private TextField textField04;
    @FXML private TextField textField05;
    @FXML private TextField textField06;
    @FXML private Button UpdateCPF;
    @FXML private Button UpdateNome;
    @FXML private Button UpdateRegiao;
    @FXML private Button UpdateNascimento;
    @FXML private Button UpdatePaisID;
    @FXML private Button buttonVoltar;
    @FXML private Button buttonConsultar;
    
    EconomiaDAO dao = new CidadaoDAO();
    
    @FXML private void UpdateCPF(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            if(dao.atualizarCPF(id, textField02.getText()))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
        }
    }
    
    @FXML private void UpdateNome(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            if(dao.atualizarNome(id, textField03.getText()))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
        }
    }

    @FXML private void UpdateRegiao(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            if(dao.atualizarRegiao(id, textField04.getText()))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
        }
    }
    
    
    @FXML private void UpdateNascimento(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            if(dao.atualizarNascimento(id, textField05.getText()))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
        }
    }    
    
    @FXML private void UpdatePaisID(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            int pais = Integer.parseInt(textField06.getText());
            if(dao.atualizarPaisID(id, pais))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
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
