package vn.viettuts.qlsv;

import java.awt.EventQueue;

import vn.viettuts.quanlidangvien.controller.LoginController;
import vn.viettuts.quanlidangvien.view.LoginView;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
                // hiển thị màn hình login
                controller.showLoginView();
            }
        });
    }
}