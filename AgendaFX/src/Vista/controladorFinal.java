package Vista;
import application.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;

public class controladorFinal {
	
	private TableView<Persona> tabla = new TableView<Persona>();
	final static ObservableList<String> data = FXCollections.observableArrayList();
	final HBox hb = new HBox();
	public static ObservableList<String> getData() {
		return data;
	}
	public static int setData(String persona,int indx) {
		data.set(indx, persona);
		return indx;
	}
	public TableView<Persona> getTabla() {
		return tabla;
	}
	public void setTabla(TableView<Persona> tabla) {
		this.tabla = tabla;
	}

}
