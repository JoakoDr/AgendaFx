package Vista;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.table.TableColumn;

import application.Persona;
import javafx.event.ActionEvent;
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
    @FXML
    private TableView <Persona> tabla;
    @FXML
    private TableColumn Nombre;
    @FXML
    private TableColumn Apellidos;
    @FXML
    private TableColumn Telefono;
   

    private Stage ventana;
	//private int indx;

	public void setStagePrincipal(Stage ventana) {
		// TODO Auto-generated method stub
		
		
		this.ventana = ventana;
	}

	public void closeWindow(){
		this.ventana.close();
	}
	public void BorrarBot(ActionEvent event)
	{
	int selectdIndex = controladorFinal.setData("lol", 0);
    //borramos el objeto obtenido de la fila
    controladorFinal.getData().remove(selectdIndex);
	}
	public void EditarBot(ActionEvent event)
	{
		tabla.setEditable(true);
	}
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}