// Elliot Currie
// 2/8/22
// Purpose: This object is the window for the flashcards to be displayed. (WOP)

package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class window extends JFrame {
    
    // layout mgrs
    private BoxLayout box = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS); 


    //global vars

    private JPanel panel; 
    private JLabel currentCard = new JLabel("q");
    private JLabel currentAnswer = new JLabel("a");


    public window() {

        this.setSize(300,300);
        this.setTitle("Flashcards");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(true);
        this.setResizable(true);
        this.setVisible(true);

        panel = new JPanel();
        panel.setLayout(box); 
        panel.setSize(250,250);
        





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

    // dynamically set font size based on argument length
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



}
