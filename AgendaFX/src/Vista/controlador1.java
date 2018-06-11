package Vista;

import java.net.URL;
import java.util.ResourceBundle;
import application.Persona;

import application.Persona;
import Vista.controlador;
//import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controlador1 implements Initializable {
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnBorrar;
   
   

    private Stage ventana;
	//private int indx;

	public void setStagePrincipal(Stage ventana) {
		// TODO Auto-generated method stub
		
		
		this.ventana = ventana;
	}

	public void closeWindow(){
		this.ventana.close();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}