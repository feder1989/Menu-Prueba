/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menu.prueba.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import menu.prueba.controller.MarcoMenuController;
/**
 *
 * @author Alvaro
 */
public class MarcoMenu extends JFrame{
    private Color valoresColores[] = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private JRadioButtonMenuItem elementosColores[];
    private JRadioButtonMenuItem fuentes[];
    private JCheckBoxMenuItem elementosEstilos[];
    private JLabel mostrarJLabel;
    private ButtonGroup fuentesButtonGroup;
    private ButtonGroup coloresButtonGroup;
    private int estilo;
    
    public MarcoMenu(){
        super("Uso de objetos JMenu");
        JMenu menuArchivo = new JMenu("Archivo");
        menuArchivo.setMnemonic('A');
        
        JMenuItem elementoAcercaDe = new JMenuItem("Acerca de...");
        elementoAcercaDe.setMnemonic('c');
        menuArchivo.add(elementoAcercaDe);
        elementoAcercaDe.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MarcoMenu.this, 
                        "Este es un ejemplo\ndel uso de menus", 
                        "Acerca de",JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        JMenuItem elementoSalir = new JMenuItem("Salir");
        elementoSalir.setMnemonic('S');
        menuArchivo.add(elementoSalir);
        elementoSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(menuArchivo);
        
        JMenu menuFormato = new JMenu("Formato");
        menuFormato.setMnemonic('F');
        
        String colores[] = {"Negro", "Azul", "Rojo", "Verde"};
        JMenu menuColor = new JMenu("Color");
        menuColor.setMnemonic('C');
        
        elementosColores = new JRadioButtonMenuItem[colores.length];
        coloresButtonGroup = new ButtonGroup();
        //ManejadorElementos manejadorElementos = new MarcoMenuController();
        MarcoMenuController manejadorElementos = new MarcoMenuController(this);
        
        
        for (int cuenta = 0; cuenta < colores.length; cuenta++) {
            elementosColores[cuenta] = new JRadioButtonMenuItem(colores[cuenta]);
            menuColor.add(elementosColores[cuenta]);
            coloresButtonGroup.add(elementosColores[cuenta]);
            elementosColores[cuenta].addActionListener(manejadorElementos);
          
            
        }
        elementosColores[0].setSelected(true);
        menuFormato.add(menuColor);
        menuFormato.addSeparator();
        
        String nombresFuentes[] = {"Serif","Monospaced", "SansSerif"};
        JMenu menuFuente = new JMenu("Fuentes");
        menuFuente.setMnemonic('u');
        
        fuentes = new JRadioButtonMenuItem[nombresFuentes.length];
        fuentesButtonGroup = new ButtonGroup();
        
        for (int cuenta = 0; cuenta < fuentes.length; cuenta++) {
            fuentes[cuenta] = new JRadioButtonMenuItem(nombresFuentes[cuenta]);
            menuFuente.add(fuentes[cuenta]);
            fuentesButtonGroup.add(fuentes[cuenta]);
            fuentes[cuenta].addActionListener(manejadorElementos);
                 
            
        }
        
        fuentes[0].setSelected(true);
        menuFuente.addSeparator();
        
        String nombresEstilos[] = {"Negrita", "Cursiva"};
        elementosEstilos = new JCheckBoxMenuItem[nombresEstilos.length];
        //ManejadorEstilos manejadorEstilos = new ManejadorEstilos();
        
        for (int cuenta = 0; cuenta < nombresEstilos.length; cuenta++) {
            elementosEstilos[cuenta] = new JCheckBoxMenuItem(nombresEstilos[cuenta]);
            menuFuente.add(elementosEstilos[cuenta]);
            elementosEstilos[cuenta].addItemListener(manejadorElementos);
        }
        menuFormato.add(menuFuente);
        barra.add(menuFormato);
        
        mostrarJLabel = new JLabel("Texto de ejemplo", SwingConstants.CENTER);
        mostrarJLabel.setForeground(valoresColores[0]);
        mostrarJLabel.setFont(new Font("'Serif'", Font.PLAIN, 72));
        
        getContentPane().setBackground(Color.CYAN);
        add(mostrarJLabel, BorderLayout.CENTER);
        
        
            
    }

    public JRadioButtonMenuItem[] getElementosColores() {
        return elementosColores;
    }

    public void setElementosColores(JRadioButtonMenuItem[] elementosColores) {
        this.elementosColores = elementosColores;
    }

    public JRadioButtonMenuItem[] getFuentes() {
        return fuentes;
    }

    public void setFuentes(JRadioButtonMenuItem[] fuentes) {
        this.fuentes = fuentes;
    }

    public JCheckBoxMenuItem[] getElementosEstilos() {
        return elementosEstilos;
    }

    public void setElementosEstilos(JCheckBoxMenuItem[] elementosEstilos) {
        this.elementosEstilos = elementosEstilos;
    }

    public JLabel getMostrarJLabel() {
        return mostrarJLabel;
    }

    public void setMostrarJLabel(JLabel mostrarJLabel) {
        this.mostrarJLabel = mostrarJLabel;
    }

    public ButtonGroup getFuentesButtonGroup() {
        return fuentesButtonGroup;
    }

    public void setFuentesButtonGroup(ButtonGroup fuentesButtonGroup) {
        this.fuentesButtonGroup = fuentesButtonGroup;
    }

    public ButtonGroup getColoresButtonGroup() {
        return coloresButtonGroup;
    }

    public void setColoresButtonGroup(ButtonGroup coloresButtonGroup) {
        this.coloresButtonGroup = coloresButtonGroup;
    }

    public int getEstilo() {
        return estilo;
    }

    public void setEstilo(int estilo) {
        this.estilo = estilo;
    }

    public Color[] getValoresColores() {
        return valoresColores;
    }

    public void setValoresColores(Color[] valoresColores) {
        this.valoresColores = valoresColores;
    }
    
    
    
}
