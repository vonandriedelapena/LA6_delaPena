package ItemListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener extends JFrame {
    private JPanel pMain;
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JComboBox proficiencyComboBox;
    private JLabel languageLabel;
    private JLabel proficiencyLabel;
    private int ctr;
    private int size = 0;

    public Listener() {
        final int[] flag = {0};
        JCheckBox[] language = new JCheckBox[5];

        cCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                if(cCheckBox.isSelected()) {
                    language[size++] = cCheckBox;
                }else{
                    for(int i = 0; i < size; i++){
                        if(language[i] == cCheckBox){
                            for(int j = i; j < size-1; j++){
                                language[j] = language[j+1];
                            }
                            language[size-1] = null;
                            size--;
                        }
                    }
                }

                for(int i = 0; i < size; i++) {
                    System.out.println(size);
                    if(language[i].isSelected()) {

                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + language[i].getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + language[i].getText());
                        }
                    }
                }
            }
        });

        cppCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                if(cppCheckBox.isSelected()) {
                    language[size++] = cppCheckBox;
                }else{
                    for(int i = 0; i < size; i++){
                        if(language[i] == cppCheckBox){
                            for(int j = i; j < size-1; j++){
                                language[j] = language[j+1];
                            }
                            language[size-1] = null;
                            size--;
                        }
                    }
                }

                for(int i = 0; i < size; i++) {
                    System.out.println(size);
                    if(language[i].isSelected()) {

                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + language[i].getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + language[i].getText());
                        }
                    }
                }
            }
        });

        cSharpCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                if(cSharpCheckBox.isSelected()) {
                    language[size++] = cSharpCheckBox;
                }else{
                    for(int i = 0; i < size; i++){
                        if(language[i] == cSharpCheckBox){
                            for(int j = i; j < size-1; j++){
                                language[j] = language[j+1];
                            }
                            language[size-1] = null;
                            size--;
                        }
                    }
                }

                for(int i = 0; i < size; i++) {
                    System.out.println(size);
                    if(language[i].isSelected()) {

                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + language[i].getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + language[i].getText());
                        }
                    }
                }
            }
        });

        javaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                if(javaCheckBox.isSelected()) {
                    language[size++] = javaCheckBox;
                }else{
                    for(int i = 0; i < size; i++){
                        if(language[i] == javaCheckBox){
                            for(int j = i; j < size-1; j++){
                                language[j] = language[j+1];
                            }
                            language[size-1] = null;
                            size--;
                        }
                    }
                }

                for(int i = 0; i < size; i++) {
                    System.out.println(size);
                    if(language[i].isSelected()) {

                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + language[i].getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + language[i].getText());
                        }
                    }
                }
            }
        });

        pythonCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                if(pythonCheckBox.isSelected()) {
                    language[size++] = pythonCheckBox;
                }else{
                    for(int i = 0; i < size; i++){
                        if(language[i] == pythonCheckBox){
                            for(int j = i; j < size-1; j++){
                                language[j] = language[j+1];
                            }
                            language[size-1] = null;
                            size--;
                        }
                    }
                }

                for(int i = 0; i < size; i++) {
                    System.out.println(size);
                    if(language[i].isSelected()) {

                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + language[i].getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + language[i].getText());
                        }
                    }
                }
            }
        });

        proficiencyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "Proficiency: ";
                switch (proficiencyComboBox.getSelectedIndex()) {
                    case 0 -> proficiencyLabel.setText(currentText + "Low");
                    case 1 -> proficiencyLabel.setText(currentText + "Medium");
                    case 2 -> proficiencyLabel.setText(currentText + "High");
                    default -> {
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Listener s = new Listener();
        s.setContentPane(s.pMain);
        s.setSize(375, 300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Item Listener");
    }
}
