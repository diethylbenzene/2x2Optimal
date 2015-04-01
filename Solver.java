/*
 * Written by Kennan LeJeune and Ethan Vovan
 * Optimal 2x2 Solver v.1.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Solver implements ActionListener {
    private final JButton solve, quit;
    private final JTextField scrambletf;
    private final JLabel solutionDisplay, instructions;
    private JFrame f;
    private Container c;
    private String scramble, solution;
    boolean solved;
    private Solver() {
        solved = false;
        f = new JFrame("2x2 Solver");
        f.setSize(400, 280);
        c = f.getContentPane();
        JPanel p = new JPanel();
        solutionDisplay = new JLabel("");
        instructions = new JLabel("Input a scramble, then press solve.");
        solve = new JButton("Solve");
        solve.addActionListener(this);
        quit = new JButton("Quit");
        quit.addActionListener(this);
        scrambletf = new JTextField(25);
        p.add(instructions);
        p.add(scrambletf);
        p.add(solutionDisplay);
        p.add(solve);
        p.add(quit);
        c.add(p);
    }

    public static void main(String[] args) {
        Solver s = new Solver();
        s.f.setVisible(true);
    }

    private void solverEngine() {
        while (!solved) {

        }

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == solve) {
            //solverEngine();
            //solutionDisplay.setText(scramble);
            solutionDisplay.setText("THIS IS FUCKING WORKING");
        }

        if (event.getSource() == quit) f.dispose();

    }

}