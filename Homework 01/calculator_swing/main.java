public class Main {
    public static void main(String[] args) {
        new controller.CalculatorController(
                new model.CalculatorModel(),
                new view.CalculatorView()
        );
    }
}