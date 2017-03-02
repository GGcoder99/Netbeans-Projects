/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gates.adv.borderlayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author garrick
 */
//  a class born a JFrame but is its own event handler
public class BorderLayoutFrame extends JFrame implements ActionListener
{
    private final JButton[] buttons;
    private static final String[] names = {"hide North", "hide South", "hide East", "hide West", "hide Center"};
    private final BorderLayout layout;
    
    
    public BorderLayoutFrame()
    {
        super("Super");
        
        // creating a layout
        layout = new BorderLayout(5, 5);
        setLayout(layout);
        
        // 
        buttons = new JButton[names.length];
        
        // creating buttons with a for loop
        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }
        // assigning the buttons
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }
    // lets the compiler know that this method is gonna be overridden may increase run time
    @Override //  ActionEvent is a class because of first Capital Letter
    public void actionPerformed(ActionEvent event)
    {
        // this is a for each loop button
        for (JButton button : buttons)
        {
            // asking which button is pressed
            if (event.getSource() == button)
            {
                // hides the button that is true
                button.setVisible(false);               
            }
            else
            {
                button.setVisible(true);
            }
            
            // refreshing the container screen to show changes
            layout.layoutContainer(getContentPane());
            
        }
    }
}
