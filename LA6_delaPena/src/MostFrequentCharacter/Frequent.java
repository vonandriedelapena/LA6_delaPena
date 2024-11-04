package MostFrequentCharacter;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frequent extends JFrame {
    private JTextArea textArea;
    private JPanel pMain;
    private JLabel frequentCharLabel;

    Frequent() {

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                    int[] frequency = new int[256];

                    for (char c : textArea.getText().toLowerCase().toCharArray()) {
                        if(c != ' ') {
                            frequency[c]++;
                        }
                    }

                    char mostFrequentChar = ' ';
                    int maxFrequency = 0;
                    for (int i = 0; i < frequency.length; i++) {
                        if (frequency[i] > maxFrequency) {
                            mostFrequentChar = (char) i;
                            maxFrequency = frequency[i];
                        }
                    }
                    frequentCharLabel.setText("The most frequent character is: " + mostFrequentChar);
            }
        });
    }

    public static void main(String[] args) {
        Frequent s = new Frequent();
        s.setContentPane(s.pMain);
        s.setSize(300, 200);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Most Frequent Character");
    }
}
