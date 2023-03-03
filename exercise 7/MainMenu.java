import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainMenu extends JFrame {

    MainMenu(){
        //Jlabel
        JLabel imageLabel = new JLabel();
        ImageIcon catImage = new ImageIcon("neoncat.png");
        imageLabel.setIcon(catImage);

        //JButton
        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("START GAME", Font.BOLD, 25));
        // Add button to frame
        ActionListener eventHandler = new EventHandler();
        button.addActionListener(eventHandler); 
        this.add(button);
        this.add(imageLabel);
        

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.MAGENTA);
        // lock frame
        this.setResizable(false);
    }

    // Event Handler 
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){

            // open frame game
            new GameFrame();
            // close main menu frame
            dispose();
        }
    }
    
}
