import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorMenu extends JFrame {

    JList colorlist;
    private String[] colorNameArrays = { "BLUE", "WHITE", "MAGENTA", "YELLOW" };
    private Color[] colorsClassArray = { Color.BLUE, Color.WHITE, Color.MAGENTA, Color.YELLOW };

    ColorMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        // JLabel component
        JLabel label = new JLabel();
        label.setText("Choose your favorite color: ");
        label.setFont(new Font("Arial", Font.BOLD, 30));

        // Jlist component
        colorlist = new JList(colorNameArrays);
        colorlist.setFont(new Font("Arial", Font.BOLD, 30));
        colorlist.setVisibleRowCount(2);

        // Sets JList to selection one option at a time
        colorlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandler handler = new EventHandler();
        colorlist.addListSelectionListener(handler);

        // JScrollPane
        JScrollPane scrollPane = new JScrollPane(colorlist);

        // ADd components to frame
        this.add(label);
        this.add(scrollPane);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(500, 500);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(new Color(200, 20, 100));
    }

    // Event handler
    private class EventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {

            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorsClassArray[colorlist.getSelectedIndex()];

            // goes to player menu
            new GameFrame();

            // closes color menu
            dispose();
        }
    }
}
