package Controller;




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

/**
 *
 * @author a1700677
 */
public class MenuInicialController implements Initializable {
    private String caminho = "";
    boolean choice = false;
    
    @FXML private Button buttonInsert;
    @FXML private Button buttonDelete;
    @FXML private Button buttonUpdate;
    @FXML private MenuBar menubar;
    @FXML private MenuItem Pais;
    @FXML private MenuItem Governo;
    @FXML private MenuItem Cidadão;
    @FXML private MenuItem Comercio;
    @FXML private MenuItem Industria;
    @FXML private MenuItem Economia;
    @FXML private Text textChoice;
    
    @FXML private void ModuloPais(ActionEvent event) {
        textChoice.setText("Pais");
        caminho = "/View/Pais";
        choice = true;
    }
    
    @FXML private void ModuloGoverno(ActionEvent event) {
        textChoice.setText("Governo");
        caminho = "/View/Governo";
        choice = true;
    }
    @FXML private void ModuloCidadão(ActionEvent event) {
        textChoice.setText("Cidadão");
        caminho = "/View/Cidadao";
        choice = true;
    }
    @FXML private void ModuloComercio(ActionEvent event) {
        textChoice.setText("Comercio");
        caminho = "/View/Comercio";
        choice = true;
    }
    @FXML private void ModuloIndustria(ActionEvent event) {
        textChoice.setText("Industria");
        caminho = "/View/Industria";
        choice = true;
    }
    @FXML private void ModuloEconomia(ActionEvent event) {
        textChoice.setText("Economia");
        caminho = "/View/Economia";
        choice = true;
    }
    
    @FXML private void buttonInsert(ActionEvent event) {
        if(choice == false){
            textChoice.setText("Escolha na aba!");
        }else{        
        caminho = caminho.concat("InsertView.fxml");
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(caminho));
        } catch (IOException ex) {
    
        }
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }
  
    @FXML private void buttonDelete(ActionEvent event) {
        if(choice == false){
            textChoice.setText("Escolha na aba!");
        }else{    
        caminho = caminho.concat("DeleteView.fxml");
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(caminho));
        } catch (IOException ex) {
    
        }
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }
    
    @FXML private void buttonUpdate(ActionEvent event) {
        if(choice == false){
            textChoice.setText("Escolha na aba!");
        }else{    
        caminho = caminho.concat("UpdateView.fxml");
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(caminho));
        } catch (IOException ex) {
    
        }
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
