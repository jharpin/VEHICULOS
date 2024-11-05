package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MenuViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button txtEiminar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableColumn<?, ?> tbcApellido;

    @FXML
    private TableColumn<?, ?> tbcCedula;

    @FXML
    private Button btnAgregar;

    @FXML
    private TextField txtCedula;

    @FXML
    private TableView<?> tblListClientes;

    @FXML
    private TableColumn<?, ?> tbcTelefono;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TableColumn<?, ?> tbcNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private Button btnActualizar;

    @FXML
    void onAgregarCliente(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void onLimpiar(ActionEvent event) {

    }

    @FXML
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtEiminar != null : "fx:id=\"txtEiminar\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert tbcApellido != null : "fx:id=\"tbcApellido\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert tbcCedula != null : "fx:id=\"tbcCedula\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert tblListClientes != null : "fx:id=\"tblListClientes\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert tbcTelefono != null : "fx:id=\"tbcTelefono\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert tbcNombre != null : "fx:id=\"tbcNombre\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'crudMenu.fxml'.";
        assert btnActualizar != null : "fx:id=\"btnActualizar\" was not injected: check your FXML file 'crudMenu.fxml'.";

    }
}

