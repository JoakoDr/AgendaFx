package Vista;
import application.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import application.Persona;

public class controladorFinal {
	
	private TableView tabla = new TableView();
	private final static ObservableList<Persona> data = FXCollections.observableArrayList();
	final HBox hb = new HBox();
	public static ObservableList<Persona> getData() {
		return data;
	}
	public static void setData(Persona persona,int indx) {
		data.set(indx, persona);
	}

}
