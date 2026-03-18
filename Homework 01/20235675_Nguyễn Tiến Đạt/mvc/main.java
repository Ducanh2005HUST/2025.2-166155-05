import controller.HelloController;
import model.HelloModel;
import view.HelloView;

public class main {
    public static void main(String[] args) {
        HelloModel model = new HelloModel();
        HelloView view = new HelloView();
        HelloController controller = new HelloController(model, view);
        controller.run();
    }
}