/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menu.prueba.Start;

import javax.swing.JFrame;
import menu.prueba.view.MarcoMenu;

/**
 *
 * @author Alvaro
 */
public class MenuPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoMenu marco = new MarcoMenu();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(600,200);
        marco.setVisible(true);
    }
    
}
