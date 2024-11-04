package KeyEventActivity;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Key extends JFrame {
    private JPanel pMain;
    private JTextArea editableTextArea;
    private JTextArea nonEditableTextArea;

    public Key() {
        editableTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(Character.isAlphabetic(e.getKeyChar()) || Character.isWhitespace(e.getKeyChar())) {
                    char c = e.getKeyChar();
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        nonEditableTextArea.append(Character.toString(Character.toUpperCase(c)));
                    } else {
                        nonEditableTextArea.append(Character.toString(Character.toLowerCase(c)));
                    }
                }

                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE && !(nonEditableTextArea.getText()).isEmpty()) {
                    int size = ((nonEditableTextArea.getText()).length())-1;
                    nonEditableTextArea.setText((nonEditableTextArea.getText()).substring(0, size));
                }
            }
        });
    }

    public static void main(String[] args) {
        Key s = new Key();
        s.setContentPane(s.pMain);
        s.setSize(400, 200);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Key Event Class");
    }
}
