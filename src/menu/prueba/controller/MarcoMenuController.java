/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menu.prueba.controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import menu.prueba.view.MarcoMenu;
import menu.prueba.Start.MenuPrueba;

/**
 *
 * @author Alvaro
 */
public class MarcoMenuController implements ActionListener, ItemListener{
    private MarcoMenu menu;
    
    
    public MarcoMenuController(MarcoMenu menu){
        this.menu = menu;
    }
    public void actionPerformed(ActionEvent evento){
        for (int cuenta = 0; cuenta < menu.getElementosColores().length; cuenta++) {
            if (menu.getElementosColores()[cuenta].isSelected()){
                menu.getMostrarJLabel().setForeground(menu.getValoresColores()[cuenta]);
                break;
            }
        }
        
        for (int cuenta = 0; cuenta < menu.getFuentes().length; cuenta++) {
            if(evento.getSource() == menu.getFuentes()[cuenta]){
                menu.getMostrarJLabel().setFont(new Font(menu.getFuentes()[cuenta].getText(), menu.getEstilo(), 72));
            }
            
        }
        menu.repaint();
    }
    
    public void itemStateChanged(ItemEvent e){
        menu.setEstilo(0);
        
        if (menu.getElementosEstilos()[0].isSelected()){
            menu.setEstilo(menu.getEstilo() + Font.BOLD);
            
        }
        
        if (menu.getElementosEstilos()[1].isSelected()){
            menu.setEstilo(menu.getEstilo() + Font.ITALIC);
        }
        
        menu.getMostrarJLabel().setFont(new Font(menu.getFont().getName(), menu.getEstilo(), 72));
        menu.repaint();
    }
}


