/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_p1;

import javax.swing.JFrame;

/**
 *
 * @author Jadja
 */
public class PRJ_P1 {
    
    
    // Values
    
    public static void main(String[] args) {
        JFrame frame = new MasterWindow();
        frame.setVisible(true);
        
        JFrame rules = new WelcomeMessage();
        rules.setVisible(true);
    }
    
    

    
}
