package view;

import java.util.Scanner;

public class HelloView {
    private Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        System.out.print("Nhap ten cua ban: ");
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}