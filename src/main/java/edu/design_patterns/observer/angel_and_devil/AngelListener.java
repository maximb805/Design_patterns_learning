package edu.design_patterns.observer.angel_and_devil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("No, don't do it! You might regret that!");
    }
}
