/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package gbsg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author gautam
 */
public class Gbsg {

    /**
     * @param args the command line arguments
     */
    private static void create_gui() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception ex) {
            Logger.getLogger(Gbsg.class.getName()).log(Level.SEVERE, null, ex);
        }
        gbsg.gui.mainWindow mw = new gbsg.gui.mainWindow();
        mw.setTitle("Gnome Background slideshow Generator (crebs Java version)");

        mw.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        create_gui();

    }
}
