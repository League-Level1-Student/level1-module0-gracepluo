package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String imageUrl = "https://www.nps.gov/chis/learn/nature/images/960-0M9B4594_1.jpg?maxwidth=650&autorotate=false";
		// 2. create a variable of type "Component" that will hold your image
Component c = createImage(imageUrl);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(c);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String input = JOptionPane.showInputDialog("what is this bird");
		// 7. print "CORRECT" if the user gave the right answer
if(input.equalsIgnoreCase("Raven")) {
	System.out.println("Correct");label.setIcon(loadImage());
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	System.out.println("No. This is raven");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line
		// of code)
String imageURL2 = "https://media.mnn.com/assets/images/2019/10/american-crow-nova-scotia-leaves.jpg.838x0_q80.jpg";
Component c2 = createImage(imageURL2);
		// 11. add the second image to the quiz window
quizWindow.add(c2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String input1 = JOptionPane.showInputDialog("what is this bird");
if(input1.equalsIgnoreCase("crow")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is crow");
}
		// 14+ check answer, say if correct or incorrect, etc.

//1
quizWindow.remove(c2);
String imageURL3 = "https://live.staticflickr.com/4517/38653816952_0b3ba03c40_b.jpg";
Component c3 = createImage(imageURL3);
quizWindow.add(c3);
quizWindow.pack();
String input2 = JOptionPane.showInputDialog("what is this bird");
if(input2.equalsIgnoreCase("crow")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is crow");
}
//2
quizWindow.remove(c3);
String imageURL4 = "https://i.pinimg.com/originals/39/6f/1f/396f1faaeef78d19ceb2e226ce72ecb3.jpg";
Component c4 = createImage(imageURL4);
quizWindow.add(c4);
quizWindow.pack();
String input3 = JOptionPane.showInputDialog("what is this bird");
if(input3.equalsIgnoreCase("raven")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is raven");
}
//3
quizWindow.remove(c4);
String imageURL5 = "https://images.earthtouchnews.com/media/734913/tawny-eagle-and-cape-crow.jpg?width=500&height=300";
Component c5 = createImage(imageURL5);
quizWindow.add(c5);
quizWindow.pack();
String input4 = JOptionPane.showInputDialog("what is this bird");
if(input4.equalsIgnoreCase("crow")) {
	System.out.println("Correct");
}
else if(input4.equalsIgnoreCase("eagle")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is crow");
}
//4
quizWindow.remove(c5);
String imageURL6 = "https://i.pinimg.com/originals/81/cd/c6/81cdc6fed542b3f1fdcf6a983e7d53a4.jpg";
Component c6 = createImage(imageURL6);
quizWindow.add(c6);
quizWindow.pack();
String input5 = JOptionPane.showInputDialog("what is this bird");
if(input5.equalsIgnoreCase("crow")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is crow");
}
//5
quizWindow.remove(c6);
String imageURL7 = "https://images.squarespace-cdn.com/content/v1/51b3dc8ee4b051b96ceb10de/1562190674245-BMHFTP1XNXQP6PZ98CXQ/ke17ZwdGBToddI8pDm48kNvT88LknE-K9M4pGNO0Iqd7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1USOFn4xF8vTWDNAUBm5ducQhX-V3oVjSmr829Rco4W2Uo49ZdOtO_QXox0_W7i2zEA/qrow.jpg?format=1500w";
Component c7 = createImage(imageURL7);
quizWindow.add(c7);
quizWindow.pack();
String input6 = JOptionPane.showInputDialog("what is this bird");
if(input6.equalsIgnoreCase("Qrow")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is Qrow");
}
//6
quizWindow.remove(c7);
String imageURL8 = "https://pm1.narvii.com/6728/3b0ff1e870989ed1da45dfac0ffb140c39b57702v2_hq.jpg";
Component c8 = createImage(imageURL8);
quizWindow.add(c8);
quizWindow.pack();
String input7 = JOptionPane.showInputDialog("what is this bird");
if(input7.equalsIgnoreCase("raven")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is raven");
}
//7
quizWindow.remove(c8);
String imageURL9 = "https://i.chzbgr.com/full/8588471808/h817E35AD/";
Component c9 = createImage(imageURL9);
quizWindow.add(c9);
quizWindow.pack();
String input8 = JOptionPane.showInputDialog("what is this bird");
if(input8.equalsIgnoreCase("raven")) {
	System.out.println("Correct");
}
else {
	System.out.println("No. This is raven");
}


	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
	

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
