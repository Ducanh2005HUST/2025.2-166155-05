package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.CalculatorModel;

public class CalculatorController {

    @FXML private TextField txtA;
    @FXML private TextField txtB;
    @FXML private TextField txtResult;

    private CalculatorModel model = new CalculatorModel();

    @FXML
    private void handleAdd() {
        calculate("add");
    }

    @FXML
    private void handleSub() {
        calculate("sub");
    }

    @FXML
    private void handleMul() {
        calculate("mul");
    }

    @FXML
    private void handleDiv() {
        calculate("div");
    }

    private void calculate(String op) {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double result = 0;

            switch (op) {
                case "add": result = model.add(a, b); break;
                case "sub": result = model.sub(a, b); break;
                case "mul": result = model.mul(a, b); break;
                case "div": result = model.div(a, b); break;
            }

            txtResult.setText(String.valueOf(result));

        } catch (NumberFormatException e) {
            txtResult.setText("Invalid input");
        } catch (ArithmeticException e) {
            txtResult.setText("Cannot divide by 0");
        }
    }
}