package controller;

import model.CalculatorModel;
import view.CalculatorView;

import java.awt.event.ActionListener;

public class CalculatorController {
    public CalculatorController(CalculatorModel model, CalculatorView view) {

        ActionListener listener = e -> {
            try {
                double a = Double.parseDouble(view.txtA.getText());
                double b = Double.parseDouble(view.txtB.getText());
                double result = 0;

                if (e.getSource() == view.btnAdd)
                    result = model.add(a,b);
                else if (e.getSource() == view.btnSub)
                    result = model.sub(a,b);
                else if (e.getSource() == view.btnMul)
                    result = model.mul(a,b);
                else if (e.getSource() == view.btnDiv)
                    result = model.div(a,b);

                view.txtResult.setText(String.valueOf(result));
            } catch (Exception ex) {
                view.txtResult.setText("Error");
            }
        };

        view.btnAdd.addActionListener(listener);
        view.btnSub.addActionListener(listener);
        view.btnMul.addActionListener(listener);
        view.btnDiv.addActionListener(listener);
    }
}