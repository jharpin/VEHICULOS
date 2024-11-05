package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ReservaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> tbcTotal;

    @FXML
    private TableColumn<?, ?> tbcVehiculo;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnActualzar;

    @FXML
    private ComboBox<?> txtListapersonas;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableView<?> tblReservas;

    @FXML
    private TableColumn<?, ?> tbcDias;

    @FXML
    private TextField txtTotal;

    @FXML
    private ComboBox<?> txtListaVehiculos;

    @FXML
    private Button btnEliminar;

    @FXML
    private TableColumn<?, ?> tbcCliente;

    @FXML
    private TextField txtDias;

    @FXML
    void onActualizar(ActionEvent event) {

    }

    @FXML
    void onLimpiar(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tbcTotal != null : "fx:id=\"tbcTotal\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert tbcVehiculo != null : "fx:id=\"tbcVehiculo\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert btnActualzar != null : "fx:id=\"btnActualzar\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert txtListapersonas != null : "fx:id=\"txtListapersonas\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert tblReservas != null : "fx:id=\"tblReservas\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert tbcDias != null : "fx:id=\"tbcDias\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert txtTotal != null : "fx:id=\"txtTotal\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert txtListaVehiculos != null : "fx:id=\"txtListaVehiculos\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert btnEliminar != null : "fx:id=\"btnEliminar\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert tbcCliente != null : "fx:id=\"tbcCliente\" was not injected: check your FXML file 'crudReserva.fxml'.";
        assert txtDias != null : "fx:id=\"txtDias\" was not injected: check your FXML file 'crudReserva.fxml'.";

    }
}
