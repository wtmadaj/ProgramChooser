import javax.swing.*;
import java.awt.*;

public class GUI {
        public static void main(String args[]) throws InterruptedException {
            //Creating the Frame
            JFrame frame = new JFrame("UI Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);

            //Creating the MenuBar and adding components
            JMenuBar menuBar = new JMenuBar();
            JMenu m1 = new JMenu("File");
            JMenu m2 = new JMenu("Help");
            menuBar.add(m1);
            menuBar.add(m2);
            JMenuItem m11 = new JMenuItem("Main Menu");
            JMenuItem m22 = new JMenuItem("Other Option");
            m1.add(m11);
            m1.add(m22);

            //Creating the panel at bottom and adding components
            JPanel panel = new JPanel(); // the panel is not visible in output
            JLabel label = new JLabel("Enter Text");
            JTextField textField = new JTextField(10); // accepts upto 10 characters
            JButton send = new JButton("Send");
            JButton reset = new JButton("Reset");
            panel.add(label); // Components Added using Flow Layout
            panel.add(textField);
            panel.add(send);
            panel.add(reset);

            // Text Area at the Center
            JTextArea textArea = new JTextArea();

            //Adding Components to the frame.
            frame.getContentPane().add(BorderLayout.SOUTH, panel);
            frame.getContentPane().add(BorderLayout.NORTH, menuBar);
            frame.getContentPane().add(BorderLayout.CENTER, textArea);
            frame.setVisible(true);

        }
}
/*
Resources
https://www.guru99.com/java-swing-gui.html
https://www.educba.com/java-gui-framework/
https://docs.oracle.com/javase/tutorial/uiswing/index.html

java web app:
https://www.javatpoint.com/how-to-build-a-web-application-using-java


*/
