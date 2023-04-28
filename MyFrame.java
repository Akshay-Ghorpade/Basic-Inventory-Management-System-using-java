import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    
    public MyFrame() {
        // Set the title of the frame
        setTitle("My Frame");
        
        // Create four buttons
        JButton button1 = new JButton("production details");
        JButton button2 = new JButton("finance details");
        JButton button3 = new JButton("raw material details");
        JButton button4 = new JButton("sales details");
		
		// Set the preferred size of each button
		button1.setPreferredSize(new Dimension(100, 50));
		button2.setPreferredSize(new Dimension(100, 50));
		button3.setPreferredSize(new Dimension(100, 50));
        button4.setPreferredSize(new Dimension(100, 50));
        
        // Set the layout of the frame
        setLayout(new GridLayout(2, 2));
        
        // Add the buttons to the frame
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        
        // Add an ActionListener to each button
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open a new frame with two buttons when button 2 is clicked
                JFrame newFrame = new JFrame();
                newFrame.setTitle("New Frame");
                
                JButton button5 = new JButton("Click to enter data");
                JButton button6 = new JButton("Click to read data");
                
                newFrame.setLayout(new GridLayout(1, 2));
                newFrame.add(button5);
                newFrame.add(button6);
                
                button5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 5 is clicked
                        JFrame enterFrame = new JFrame();
                        enterFrame.setTitle("Enter Data");
                        enterFrame.setSize(300, 200);
                        enterFrame.setVisible(true);
                    }
                });
                
                button6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 6 is clicked
                        JFrame readFrame = new JFrame();
                        readFrame.setTitle("Read Data");
                        readFrame.setSize(300, 200);
                        readFrame.setVisible(true);
                    }
                });
                
                newFrame.setSize(300, 200);
                newFrame.setVisible(true);
            }
        });
		
		
		
		button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open a new frame with two buttons when button 2 is clicked
                JFrame newFrame = new JFrame();
                newFrame.setTitle("New Frame");
                
                JButton button7 = new JButton("Click to enter data");
                JButton button8 = new JButton("Click to read data");
                
                newFrame.setLayout(new GridLayout(1, 2));
                newFrame.add(button7);
                newFrame.add(button8);
                
                button7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 5 is clicked
                        JFrame enterFrame = new JFrame();
                        enterFrame.setTitle("Enter Data");
                        enterFrame.setSize(300, 200);
                        enterFrame.setVisible(true);
                    }
                });
                
                button8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 6 is clicked
                        JFrame readFrame = new JFrame();
                        readFrame.setTitle("Read Data");
                        readFrame.setSize(300, 200);
                        readFrame.setVisible(true);
                    }
                });
                
                newFrame.setSize(300, 200);
                newFrame.setVisible(true);
            }
        });
		
		
		button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open a new frame with two buttons when button 2 is clicked
                JFrame newFrame = new JFrame();
                newFrame.setTitle("New Frame");
                
                JButton button9 = new JButton("Click to enter data");
                JButton button10 = new JButton("Click to read data");
                
                newFrame.setLayout(new GridLayout(1, 2));
                newFrame.add(button9);
                newFrame.add(button10);
                
                button9.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 5 is clicked
                        JFrame enterFrame = new JFrame();
                        enterFrame.setTitle("Enter Data");
                        enterFrame.setSize(300, 200);
                        enterFrame.setVisible(true);
                    }
                });
                
                button10.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 10 is clicked
                        JFrame readFrame = new JFrame();
                        readFrame.setTitle("Read Data");
                        readFrame.setSize(300, 200);
                        readFrame.setVisible(true);
                    }
                });
				
				
		button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open a new frame with two buttons when button 2 is clicked
                JFrame newFrame = new JFrame();
                newFrame.setTitle("New Frame");
                
                JButton button11 = new JButton("Click to enter data");
                JButton button12 = new JButton("Click to read data");
                
                newFrame.setLayout(new GridLayout(1, 2));
                newFrame.add(button11);
                newFrame.add(button12);
                
                button11.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 11 is clicked
                        JFrame enterFrame = new JFrame();
                        enterFrame.setTitle("Enter Data");
                        enterFrame.setSize(300, 200);
                        enterFrame.setVisible(true);
                    }
                });
                
                button12.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Open a new frame when button 12 is clicked
                        JFrame readFrame = new JFrame();
                        readFrame.setTitle("Read Data");
                        readFrame.setSize(300, 200);
                        readFrame.setVisible(true);
                    }
                });
                
                newFrame.setSize(300, 200);
                newFrame.setVisible(true);
            }
        });
                
                newFrame.setSize(300, 200);
                newFrame.setVisible(true);
            }
        });
        
        // Set the size of the frame and make it visible
        setSize(400, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create an instance of the MyFrame class
        MyFrame frame = new MyFrame();
    }
}
