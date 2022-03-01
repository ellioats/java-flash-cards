// Elliot Currie
// 2/8/22
// Purpose: This object is the window for the flashcards to be displayed. (WOP)

package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class window extends JFrame {
    
        //TODO check string length for each question / answer + split the strings into two lines if the length exceeds a specific value 
            


    // layout mgrs
    //private BoxLayout box = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS); 


    //global vars

    private JPanel panel; 
    private JLabel currentCard = new JLabel("q");
    private JLabel currentAnswer = new JLabel("a");


    public window() {

        this.setSize(1200,300);
        this.setTitle("Flashcards");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(true);
        this.setResizable(true);
        this.setVisible(true);

        panel = new JPanel();
        panel.setSize(250,250);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {               
                int keyCode = e.getKeyCode();

                switch(keyCode) {

                    case (KeyEvent.VK_SPACE):
                        // goto next card
                    break;

                    // add more ctrls later
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();

                switch(keyCode) {

                    case (KeyEvent.VK_SPACE):
                        // goto next card
                    break;

                    // add more ctrls later
                }
            }
        });
    }

    // TODO: dynamically set font size based on argument length

    // for debug only, make a method that can set the question and answer individually 
    public void setCardData(String q, String a) {



        currentCard.setText(q); // sets question text
        currentAnswer.setText(a); // sets answer text

        System.out.println("current question: " + q);

        panel.add(currentCard);
        panel.add(currentAnswer);

        this.getContentPane().add(panel); // adds panel to frame
        this.revalidate(); // revals
        this.repaint(); // repaints panel
    }

    public void setCardVal(String text, boolean choice) {
        // String text is for the data
        // boolean choice is the choice of which (the currentcard or currentanswer) labels to assign the text value to
            // true is for answer
            // false is for question

        if (choice) {
            currentAnswer.setText(text + "\n");
        }
        else {
            currentCard.setText(text + "\n");
        }

        panel.add(currentCard);
        panel.add(currentAnswer);

        this.getContentPane().add(panel); // adds panel to frame
        this.revalidate(); // revals
        this.repaint(); // repaints panel

    }

    public void resetCardVal() {
        currentAnswer.setText("");
        currentCard.setText("");

        panel.add(currentCard);
        panel.add(currentAnswer);

        this.getContentPane().add(panel); // adds panel to frame
        this.revalidate(); // revals
        this.repaint(); // repaints panel
    }
}
