package application;
	
import java.io.IOException;

import Vista.controlador;
import Vista.controlador1;
import Vista.controladorFinal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	 private static Stage stagePrincipal;
	 private TableView<Persona> tabla = new TableView<Persona>();
	    private AnchorPane rootPane;
		private int indx;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void mostrarVentanaPrincipal1() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Vista/Contacto.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Contacto");
            stagePrincipal.setScene(scene);
            
            
 
            /*
             * 
             * Añadimos las llamadas del main al Controlador y del controlador al main ***/
            controlador controller = loader.getController();
            controller.setProgramaPrincipal(this);

            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepción.
        }
   }


    /* Este método es llamado cuando se presiona el botón de la ventana principal
     * Lo llama el controlador de la vista principal
     */
    public void mostrarVentanaSecundaria() {
        try {
//         	System.out.println(controlador.getTxtNombre().getText()+"Nombre");
//        	System.out.println(controlador.getTxtApellido().getText()+"Apellido");
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../Vista/vistaedicion.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            /* Creamos la segunda ventana como otro stage */
            Stage ventana = new Stage();
            ventana.setTitle("Agenda");

            controladorFinal.getData();
            
      
            /* Le decimos a la ventana quién es la ventana original */
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);

            controlador1 controller2 = loader.getController();
            controller2.setStagePrincipal(ventana);
           // System.out.println(ProgramaPrincipal);
       
//            controladorFinal.setData(new Persona(controlador.getTxtNombre().getText(),controlador.getTxtApellido().getText(),
//            controlador.getTxtTelefono().getText()),indx);

            ventana.show();

        } catch (Exception e) {
            //tratar la excepción
        }
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		extracted(primaryStage);
        mostrarVentanaPrincipal1();
	}
	private Stage extracted(Stage stagePrincipal) {
		return Main.stagePrincipal = stagePrincipal;
	}
	public int getIndx() {
		return indx;
	}
	public void setIndx(int indx) {
		this.indx = indx;
	}
	public TableView<Persona> getTabla() {
		return tabla;
	}
	public void setTabla(TableView<Persona> tabla) {
		this.tabla = tabla;
	}
}
