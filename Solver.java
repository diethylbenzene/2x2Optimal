/*
 * Written by Kennan LeJeune and Ethan Vovan
 * Optimal 2x2 Solver v.1.0
 */

class Solver extends JFrame implements ActionListener {
    private final JButton solve, quit;
    private final JTextField scrambletf;
    private final JLabel solutionDisplay, instructions;
    boolean solved;
    private Container c;
    private String scramble, solution;

    private Solver() {
        solved = false;
        this.setTitle("2x2 Solver");
        setSize(400, 280);
        c = getContentPane();
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
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Solver s = new Solver();
                s.setVisible(true);
            }
        });
    }

    private void solverEngine() {
        while (!solved) {

        }

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == solve) {
            //solverEngine();
            //solutionDisplay.setText(scramble);
            solutionDisplay.setText("THIS IS WORKING");
        }

        if (event.getSource() == quit) dispose();

    }

}