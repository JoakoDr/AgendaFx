package Vista;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.Persona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controlador implements Initializable {

    private  Main ProgramaPrincipal;

    @FXML
    private Button btnok;
    @FXML
    private Button btncancel;

	private int indx;

	private String nombre;

	private String apellido;
    @FXML
    private static TextField txtNombre;
    @FXML
    private static TextField txtApellido;
    @FXML
    private static TextField txtTelefono;


    public void setProgramaPrincipal(Main ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /* Cuando se pulsa el botón tendrá que abrir ventana nueva
     * para eso llama al método del main */
    @FXML
    private void nuevaVentana() {
    	
//    	if(!(getTxtNombre().getText().equals("") && getTxtTelefono().getText().equals("") && getTxtApellido().getText().equals("")) )
//    	{
//    	controladorFinal.setData(new Persona(getTxtNombre().getText(),getTxtApellido().getText(),
//	            getTxtTelefono().getText()),indx);
       	this.ProgramaPrincipal.mostrarVentanaSecundaria();
//    	}
//    	else 
//    	{
//    		System.out.println("No ha podido ser");
//    	}
      }

	public static TextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(TextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public static TextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(TextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public static TextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(TextField txtNombre) {
		this.txtNombre = txtNombre;
	}
}
