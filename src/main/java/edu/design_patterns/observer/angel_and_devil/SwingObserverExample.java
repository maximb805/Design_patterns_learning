package edu.design_patterns.observer.angel_and_devil;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame("Decision");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton = new JButton("Should I do it?");
        jFrame.add(jButton);

        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);

        jFrame.setLocation(2560/2 - 300/2, 1440/2 - 300/2);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

    }
}
