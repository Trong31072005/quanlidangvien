/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author lecon
 * 
 */
import java.awt.EventQueue;
import  javaapplication10.LoginController;
import  javaapplication10.loginView;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater( new Runnable(){
            public void run (){
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
               Controlller.showLoginView(); 
            }
        });
     }
  }

    