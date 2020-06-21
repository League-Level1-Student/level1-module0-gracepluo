package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class num9 {
	
JButton button = new JButton();
JFrame frame = new JFrame();
JLabel alpha = new JLabel();
int count = 0;
	public static void main(String[] args) {
		System.out.println();
		
		
		
		
	}


public void showButton() {
// TODO Auto-generated method stub
playSound("sawing-wood-daniel_simon.wav");
}




private void playSound(String fileName) {
     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
     sound.play();

}


	
}