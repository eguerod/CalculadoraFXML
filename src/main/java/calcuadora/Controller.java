package calcuadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	@FXML
	private GridPane view;
	@FXML
	private TextField pantallaText;
	@FXML
	private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
			buttonDecimal, buttonAdd, buttonSubstract, buttonMultiply, buttonDivide, buttonEquals, buttonC, buttonCE;

	private Calculadora calculadora;

	public Controller() throws IOException {

		calculadora = new Calculadora();

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		pantallaText.textProperty().bindBidirectional(calculadora.getPantalla());

	}

	@FXML
	private void on0Action(ActionEvent e) {
		calculadora.insertar('0');
	}

	@FXML
	private void on1Action(ActionEvent e) {
		calculadora.insertar('1');
	}

	@FXML
	private void on2Action(ActionEvent e) {
		calculadora.insertar('2');
	}

	@FXML
	private void on3Action(ActionEvent e) {
		calculadora.insertar('3');
	}

	@FXML
	private void on4Action(ActionEvent e) {
		calculadora.insertar('4');
	}

	@FXML
	private void on5Action(ActionEvent e) {
		calculadora.insertar('5');
	}

	@FXML
	private void on6Action(ActionEvent e) {
		calculadora.insertar('6');
	}

	@FXML
	private void on7Action(ActionEvent e) {
		calculadora.insertar('7');
	}

	@FXML
	private void on8Action(ActionEvent e) {
		calculadora.insertar('8');
	}

	@FXML
	private void on9Action(ActionEvent e) {
		calculadora.insertar('9');
	}

	@FXML
	private void onDecimalAction(ActionEvent e) {
		calculadora.insertarComa();
	}

	@FXML
	private void onCEAction(ActionEvent e) {
		calculadora.borrarTodo();
	}

	@FXML
	private void onCAction(ActionEvent e) {
		calculadora.borrar();
	}

	@FXML
	private void onAddAction(ActionEvent e) {
		calculadora.operar(Calculadora.SUMAR);
	}

	@FXML
	private void onSubstractAction(ActionEvent e) {
		calculadora.operar(Calculadora.RESTAR);
	}

	@FXML
	private void onMultiplyAction(ActionEvent e) {
		calculadora.operar(Calculadora.MULTIPLICAR);
	}

	@FXML
	private void onDivideAction(ActionEvent e) {
		calculadora.operar(Calculadora.DIVIDIR);
	}

	@FXML
	private void onEqualsAction(ActionEvent e) {
		calculadora.operar(Calculadora.IGUAL);
	}

	public GridPane getView() {
		return view;
	}

}
