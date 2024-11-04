package co.edu.uniquindio.poo.viewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class ClienteviewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tableCliente;

    @FXML
    private TableColumn<?, ?> tcNombre;

    @FXML
    private TextField txtNombre;

    @FXML
    private TableColumn<?, ?> tcCedula;

    @FXML
    private TableColumn<?, ?> tcVehiculo;

    @FXML
    private TableColumn<?, ?> tcCostetotal;

    @FXML
    private TextField txtTipo_vehiculo;

    @FXML
    private TableColumn<?, ?> tcEdad;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtCedula;

    @FXML
    void initialize() {
        assert tableCliente != null : "fx:id=\"tableCliente\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert tcNombre != null : "fx:id=\"tcNombre\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert tcCedula != null : "fx:id=\"tcCedula\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert tcVehiculo != null : "fx:id=\"tcVehiculo\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert tcCostetotal != null : "fx:id=\"tcCostetotal\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert txtTipo_vehiculo != null : "fx:id=\"txtTipo_vehiculo\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert tcEdad != null : "fx:id=\"tcEdad\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'crudVehiculos.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'crudVehiculos.fxml'.";

    }
}


