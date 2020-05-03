package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener{
    
                  public void showButton() {
            	JFrame frame = new JFrame();
            	  JButton button = new JButton();
            	    frame.add(button);
            	    frame.pack();
            	    button.addActionListener(this);
            	    int rand = new Random().nextInt(5);
            	    frame.setVisible(true);
                System.out.println("Button clicked");
           }

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
				}
        
  }
