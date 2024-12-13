package TICTACTOE;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GME extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GME frame = new GME();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    public void resetButtons() {
        for (int i = 0; i < contentPane.getComponentCount(); i++) {
            if (contentPane.getComponent(i) instanceof JButton) {
                ((JButton) contentPane.getComponent(i)).setText(" ");
            }
        }
    }

    public void winnerdisplay() {
        String winner = Tictactoe.checkWinner();
        if (winner != null) {
            JOptionPane.showMessageDialog(null, "Player " + winner + " wins");
            Tictactoe.reset();
            resetButtons(); // Reset UI after a win
        } else if (Tictactoe.isDraw()) {
            JOptionPane.showMessageDialog(null, "It's a draw!");
            Tictactoe.reset();
            resetButtons(); // Reset UI after a draw
        }
    }

   
    public GME() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton box1 = new JButton(" ");
        box1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box1.getText().equals(" ")) { // Ensure no overwriting moves
                    box1.setText(Tictactoe.turn());
                    Tictactoe.addMove(1);
                    winnerdisplay();
                }
            }
        });
        box1.setBounds(28, 10, 80, 80);
        contentPane.add(box1);

        JButton box2 = new JButton(" ");
        box2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box2.getText().equals(" ")) {
                    box2.setText(Tictactoe.turn());
                    Tictactoe.addMove(2);
                    winnerdisplay();
                }
            }
        });
        box2.setBounds(137, 10, 80, 80);
        contentPane.add(box2);

        JButton box3 = new JButton(" ");
        box3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box3.getText().equals(" ")) {
                    box3.setText(Tictactoe.turn());
                    Tictactoe.addMove(3);
                    winnerdisplay();
                }
            }
        });
        box3.setBounds(252, 10, 80, 80);
        contentPane.add(box3);

        JButton box4 = new JButton(" ");
        box4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box4.getText().equals(" ")) {
                    box4.setText(Tictactoe.turn());
                    Tictactoe.addMove(4);
                    winnerdisplay();
                }
            }
        });
        box4.setBounds(28, 92, 80, 80);
        contentPane.add(box4);

        JButton box5 = new JButton(" ");
        box5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box5.getText().equals(" ")) {
                    box5.setText(Tictactoe.turn());
                    Tictactoe.addMove(5);
                    winnerdisplay();
                }
            }
        });
        box5.setBounds(137, 92, 80, 80);
        contentPane.add(box5);

        JButton box6 = new JButton(" ");
        box6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box6.getText().equals(" ")) {
                    box6.setText(Tictactoe.turn());
                    Tictactoe.addMove(6);
                    winnerdisplay();
                }
            }
        });
        box6.setBounds(252, 92, 80, 80);
        contentPane.add(box6);

        JButton box7 = new JButton(" ");
        box7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box7.getText().equals(" ")) {
                    box7.setText(Tictactoe.turn());
                    Tictactoe.addMove(7);
                    winnerdisplay();
                }
            }
        });
        box7.setBounds(28, 174, 80, 80);
        contentPane.add(box7);

        JButton box8 = new JButton(" ");
        box8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box8.getText().equals(" ")) {
                    box8.setText(Tictactoe.turn());
                    Tictactoe.addMove(8);
                    winnerdisplay();
                }
            }
        });
        box8.setBounds(137, 174, 80, 80);
        contentPane.add(box8);

        JButton box9 = new JButton(" ");
        box9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (box9.getText().equals(" ")) {
                    box9.setText(Tictactoe.turn());
                    Tictactoe.addMove(9);
                    winnerdisplay();
                }
            }
        });
        box9.setBounds(252, 174, 80, 80);
        contentPane.add(box9);
    }
}