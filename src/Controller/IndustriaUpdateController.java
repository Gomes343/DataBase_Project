package Controller;

import DAO.IndustriaDAO;
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
public class IndustriaUpdateController implements Initializable {
    
    
    @FXML private Label label01;
    @FXML private TextField textField01;
    @FXML private TextField textField02;
    @FXML private TextField textField03;
    @FXML private TextField textField04;
    @FXML private TextField textField05;
    @FXML private TextField textField06;
    @FXML private Button UpdateNome;
    @FXML private Button UpdateRamo;
    @FXML private Button UpdatePorte;
    @FXML private Button UpdateLocalização;
    @FXML private Button UpdateInvestID;
    @FXML private Button buttonVoltar;
    @FXML private Button buttonConsultar;
    
    IndustriaDAO dao = new IndustriaDAO();
    
    @FXML private void UpdateNome(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            if(dao.atualizarNome(id, textField02.getText()))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
        }
    }
    
    @FXML private void UpdateRamo(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            if(dao.atualizarRamo(id, textField03.getText()))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
        }
    }

    @FXML private void UpdatePorte(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            if(dao.atualizarPorte(id, textField04.getText()))            
                label01.setText(("Cadastro Atualizado com sucesso!"));
        }else{
            label01.setText(("ID invalido!"));
        }
    }

    
    @FXML private void UpdateInvestID(ActionEvent event) {
        if(textField01.getText() != null){
            int id = Integer.parseInt(textField01.getText());
            int pais = Integer.parseInt(textField06.getText());
            if(dao.atualizarInvestidoresID(id, pais))            
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
