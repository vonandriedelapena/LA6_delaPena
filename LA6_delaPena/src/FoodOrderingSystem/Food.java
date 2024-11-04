package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food extends JFrame{
    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    Food(){
        JCheckBox[] cbOrganization = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        JRadioButton[] rbYear = {rbNone, rb5, rb10, rb15};



        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = 0;
                for(JCheckBox cb : cbOrganization){
                    if(cb.isSelected()){
                        if(cb.getText().equals("Pizza")){
                            amount += 100;
                        }else if(cb.getText().equals("Burger")){
                            amount += 80;
                        }else if(cb.getText().equals("Fries")){
                            amount += 65;
                        }else if(cb.getText().equals("Soft Drinks")){
                            amount += 55;
                        }else if(cb.getText().equals("Tea")){
                            amount += 50;
                        }else if(cb.getText().equals("Sundae")){
                            amount += 40;
                        }
                    }
                }

                for(JRadioButton rb : rbYear){
                    if(rb.isSelected()){
                        if(rb.getText().equals("5% Off")){
                            amount -= (amount*.05);
                        }else if(rb.getText().equals("10% Off")){
                            amount -= (amount*.1);
                        }else if(rb.getText().equals("15% Off")){
                            amount -= (amount*.15);
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", amount));
            }
        });
    }

    public static void main(String[] args) {
        Food s = new Food();
        s.setContentPane(s.pMain);
        s.setSize(400,300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Food Ordering System");
    }
}
