import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissors {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RockPaperScissors");
        frame.setContentPane(new RockPaperScissors().RockPaperScissors);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300,150);
        frame.setResizable(false);
    }

    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JPanel RockPaperScissors;

    public RockPaperScissors() {
    rockButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int bot = (int)(Math.random()*3) +1 ;

            if (bot == 1){
                JOptionPane.showMessageDialog(null, "bot choose rock. Draw!");
            } else if (bot == 2) {
                JOptionPane.showMessageDialog(null,"Bot choose paper. You lose...");
            }else {
                JOptionPane.showMessageDialog(null,"Bot choose scissors. You win!");
            }
        }
    });
        paperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int bot = (int)(Math.random()*3) +1 ;
                if (bot == 1){
                    JOptionPane.showMessageDialog(null, "bot choose rock. You win!");
                } else if (bot == 2) {
                        JOptionPane.showMessageDialog(null,"Bot choose paper. Draw!");
                }else {
                        JOptionPane.showMessageDialog(null,"Bot choose scissors. You lose...");
                }
            }
        });
        scissorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int bot = (int)(Math.random()*3) +1 ;
                if (bot == 1){
                    JOptionPane.showMessageDialog(null, "bot choose rock. You lose...");
                } else if (bot == 2) {
                    JOptionPane.showMessageDialog(null,"Bot choose paper. You win!!");
                }else {
                    JOptionPane.showMessageDialog(null,"Bot choose scissors. Draw!");
                }
            }
        });
    }
}
