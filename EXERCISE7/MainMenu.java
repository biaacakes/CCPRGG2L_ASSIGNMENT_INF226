import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    MainMenu(){

        JLabel imageLabel= new JLabel();
        ImageIcon snakeImage= new ImageIcon("snakegamegif.gif");
        imageLabel.setIcon(snakeImage);
        this.add(imageLabel);
        
        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Arial", Font.BOLD, 25));
        button.setBackground(new Color(157,192,139));
        // Add button to frame
        this.add(button);
        
        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        // Add button to frame
        this.add(button);

        this.setLayout(new FlowLayout());
        this.setTitle("SnakeGame");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200,850);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(237,241,214));

       

    }
    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            
            // open game frame
            new ColorMenu();
            // Close main menu frame
            dispose();
        }
}
}
