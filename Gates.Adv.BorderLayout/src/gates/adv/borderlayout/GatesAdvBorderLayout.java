/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gates.adv.borderlayout;

import javax.swing.JFrame;

/**
 *
 * @author garrick
 */
public class GatesAdvBorderLayout 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        BorderLayoutFrame blf = new BorderLayoutFrame();
        blf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blf.setSize(500, 350);
        blf.setVisible(true);
        blf.setLocation(500, 250);
    }
    
}
