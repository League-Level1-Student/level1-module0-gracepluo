package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
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
            	    if button.
                System.out.println("Button clicked");
                if (rand == 1){
            System.out.println("Fortune one");
           }
                if (rand == 2){
            System.out.println("Fortune 2");
           }
                if (rand == 3){
            System.out.println("Fortune three");
           }
                if (rand == 4){
            System.out.println("Fortune four");
           }
                if (rand == 5){
            System.out.println("Fortune five");
           }
                  }

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
				}
        
  }
