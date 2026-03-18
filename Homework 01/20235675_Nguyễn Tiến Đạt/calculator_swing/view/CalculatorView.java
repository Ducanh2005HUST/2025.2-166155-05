package view;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    public JTextField txtA = new JTextField(10);
    public JTextField txtB = new JTextField(10);
    public JTextField txtResult = new JTextField(15);

    public JButton btnAdd = new JButton("+");
    public JButton btnSub = new JButton("-");
    public JButton btnMul = new JButton("*");
    public JButton btnDiv = new JButton("/");

    public CalculatorView() {
        setTitle("Calculator - MVC - Swing");
        setLayout(new FlowLayout());

        add(new JLabel("A:"));
        add(txtA);
        add(new JLabel("B:"));
        add(txtB);

        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);

        add(new JLabel("Result:"));
        add(txtResult);

        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}