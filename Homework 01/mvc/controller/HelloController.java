package controller;

import model.HelloModel;
import view.HelloView;

public class HelloController {
    private HelloModel model;
    private HelloView view;

    public HelloController(HelloModel model, HelloView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        String name = view.getUserInput();
        model.setName(name);
        view.showMessage(model.getGreeting());
    }
}