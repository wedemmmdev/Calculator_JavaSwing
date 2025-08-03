package main.ScreenCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorScreen {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private double backupTotal = 0.0;
    private boolean ActivatedButtons = true;
    String total = "";

    public char math_operation;

    private JPanel CalculatorScreen;
    private JTextField displayText;
    private JButton btSeven;
    private JButton btZero;
    private JButton btFour;
    private JButton btOne;
    private JButton btTwo;
    private JButton btThree;
    private JButton btFive;
    private JButton btSix;
    private JButton btEight;
    private JButton btNine;
    private JButton btTwoZeros;
    private JButton btDelete;
    private JButton btEquals;
    private JButton btAdd;
    private JButton btSub;
    private JButton btMult;
    private JButton btDiv;
    private JButton btPoint;
    private JButton btPercentage;
    private JPanel display;
    private final JButton [] buttonsNumbers = {btOne, btTwo, btThree, btFour,btFive, btSix, btSeven , btEight, btNine, btZero, btTwoZeros, btPoint};
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorScreen().CalculatorScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
    public CalculatorScreen() {
        Color backgroundColor = new Color(45, 45, 45); // Cinza escuro
        Color buttonColor = new Color(60, 60, 60); // Cinza médio
        Color textColor = Color.WHITE;
        Color operationButtonColor = new Color(255, 159, 67); // Laranja
        Color displayColor = new Color(70, 70, 70);

        CalculatorScreen.setBackground(backgroundColor);

        display.setBackground(displayColor);
        displayText.setBackground(displayColor);
        displayText.setForeground(textColor);
        displayText.setFont(new Font("Arial", Font.BOLD, 24));
        displayText.setHorizontalAlignment(JTextField.RIGHT);
        displayText.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (JButton button : buttonsNumbers) {
            button.setBackground(buttonColor);
            button.setForeground(textColor);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setFocusPainted(false);
            button.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 1));
        }

        JButton[] operationButtons = {btAdd, btSub, btMult, btDiv, btEquals, btPercentage};
        for (JButton button : operationButtons) {
            button.setBackground(operationButtonColor);
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setFocusPainted(false);
            button.setBorder(BorderFactory.createLineBorder(new Color(230, 145, 60), 1));
        }

        btDelete.setBackground(new Color(200, 60, 60)); // Vermelho
        btDelete.setForeground(Color.WHITE);
        btDelete.setFont(new Font("Arial", Font.BOLD, 18));
        btDelete.setFocusPainted(false);
        btDelete.setBorder(BorderFactory.createLineBorder(new Color(180, 50, 50), 1));
        displayText.setEditable(false);
        btOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btoneTxt = displayText.getText() + btOne.getText();
                displayText.setText(btoneTxt);
            }
        });

        btTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btTwo.getText();
                displayText.setText(btTxt);
            }
        });

        btThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btThree.getText();
                displayText.setText(btTxt);
            }
        });

        btFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btFour.getText();
                displayText.setText(btTxt);
            }
        });

        btFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btFive.getText();
                displayText.setText(btTxt);
            }
        });

        btSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btSix.getText();
                displayText.setText(btTxt);
            }
        });

        btSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btSeven.getText();
                displayText.setText(btTxt);
            }
        });

        btEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btEight.getText();
                displayText.setText(btTxt);
            }
        });

        btNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btNine.getText();
                displayText.setText(btTxt);
            }
        });

        btZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btZero.getText();
                displayText.setText(btTxt);
            }
        });

        btTwoZeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btTwoZeros.getText();
                displayText.setText(btTxt);
            }
        });

        btPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!displayText.getText().contains(".")) {
                    String btTxt = displayText.getText() + btPoint.getText();
                    displayText.setText(btTxt);
                }
            }
        });

        btDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ActivatedButtons){
                    for (JButton button : buttonsNumbers) {
                        button.setEnabled(true);
                    }
                    ActivatedButtons = true;
                }
                displayText.setText(null);
                total = "";
                total1 = 0.0;
                total2 = 0.0;
                backupTotal = 0.0;
            }
        });

        btEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JButton button : buttonsNumbers){
                    button.setEnabled(false);
                }
                ActivatedButtons = false;
                if (total1 != 0.0 && total2 == 0.0) {
                    total2 = Double.parseDouble(displayText.getText());
                    switch (math_operation) {
                        case '+' -> {
                            total = Double.toString(total1 + total2);
                            displayText.setText(total);
                            total2 = 0.0;
                            total1 = 0.0;
                        }
                        case '-' -> {
                            total = Double.toString(total1 - total2);
                            displayText.setText(total);
                            total2 = 0.0;
                            total1 = 0.0;
                        }
                        case '*' -> {
                            total = Double.toString(total1 * total2);
                            displayText.setText(total);
                            total2 = 0.0;
                            total1 = 0.0;
                        }
                        case '%' -> {
                            total = Double.toString(total1 % total2);
                            displayText.setText(total);
                            total2 = 0.0;
                            total1 = 0.0;
                        }
                        case '/' -> {
                            if (total2 == 0.0) {
                                JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                                btDelete.doClick();
                            } else {
                                total = Double.toString(total1 / total2);
                                displayText.setText(total);
                                total2 = 0.0;
                                total1 = 0.0;
                            }
                        }
                    }
                }else if (!total.isEmpty() && total1 == 0.0 && total2 == 0.0 && !displayText.getText().isEmpty() && !displayText.getText().equals(total)){
                    switch (math_operation){
                        case '+':
                            total1 = Double.parseDouble(displayText.getText());
                            backupTotal = Double.parseDouble(total) + total1;
                            total = String.valueOf(backupTotal);
                            displayText.setText(total);
                            total1 = 0.0;
                            total2 = 0.0;
                            break;
                        case '-':
                            total1 = Double.parseDouble(displayText.getText());
                            backupTotal = Double.parseDouble(total) - total1;
                            total = String.valueOf(backupTotal);
                            displayText.setText(total);
                            total1 = 0.0;
                            total2 = 0.0;
                            break;
                        case '*':
                            total1 = Double.parseDouble(displayText.getText());
                            backupTotal = Double.parseDouble(total) * total1;
                            total = String.valueOf(backupTotal);
                            displayText.setText(total);
                            total1 = 0.0;
                            total2 = 0.0;
                            break;
                        case '/':
                            total1 = Double.parseDouble(displayText.getText());
                            if (total1 == 0.0) {
                                JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                                btDelete.doClick();
                            }else{
                                backupTotal = Double.parseDouble(total) / total1;
                                total = String.valueOf(backupTotal);
                                displayText.setText(total);
                                total1 = 0.0;
                                total2 = 0.0;
                                break;
                            }

                    }
                }

            }
        });

        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (displayText.getText().isEmpty()){
                    System.out.println("Text in displayText is empty");
                }
                if(!ActivatedButtons){
                    for(JButton button : buttonsNumbers){
                        button.setEnabled(true);
                    }
                    ActivatedButtons = true;
                }
                if (!total.isEmpty() && displayText.getText().equals(total)){
                    displayText.setText(null);
                    math_operation = '+';

                } else if (!total.isEmpty() && !displayText.getText().equals(total)) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    backupTotal = Double.parseDouble(total) + total1;
                    total = String.valueOf(backupTotal);
                    displayText.setText(total);
                    math_operation = '+';
                } else if (!total.isEmpty()){
                    total1 = Double.parseDouble(total);
                    displayText.setText(null);
                    math_operation = '+';
                }else if(total2 == 0.0 && total1 != 0.0) {
                    total1 = total1 + Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '+';
                    System.out.println(math_operation);

                } else if (total2 == 0.0) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '+';
                    System.out.println(math_operation);
                }
            }
        });

        btSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (displayText.getText().isEmpty()){
                    System.out.println("Text in displayText is empty");
                }
                if(!ActivatedButtons){
                    for(JButton button : buttonsNumbers){
                        button.setEnabled(true);
                    }
                    ActivatedButtons = true;
                }
                if (!total.isEmpty() && displayText.getText().equals(total)){
                    displayText.setText(null);
                    math_operation = '-';

                } else if (!total.isEmpty() && !displayText.getText().equals(total)) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    backupTotal = Double.parseDouble(total) - total1;
                    total = String.valueOf(backupTotal);
                    displayText.setText(total);
                    math_operation = '-';
                } else if (!total.isEmpty()){
                    total1 = Double.parseDouble(total);
                    displayText.setText(null);
                    math_operation = '-';
                }else if(total2 == 0.0 && total1 != 0.0) {
                    total1 = total1 - Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '-';
                    System.out.println(math_operation);

                } else if (total2 == 0.0) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '-';
                    System.out.println(math_operation);
                }
            }
        });

        btMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ActivatedButtons){
                    for(JButton button : buttonsNumbers){
                        button.setEnabled(true);
                    }
                    ActivatedButtons = true;
                }
                if (!total.isEmpty() && displayText.getText().equals(total)){
                    displayText.setText(null);
                    math_operation = '*';

                } else if (!total.isEmpty() && !displayText.getText().equals(total)) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    backupTotal = Double.parseDouble(total) - total1;
                    total = String.valueOf(backupTotal);
                    displayText.setText(total);
                    math_operation = '*';
                } else if (!total.isEmpty()){
                    total1 = Double.parseDouble(total);
                    displayText.setText(null);
                    math_operation = '*';
                }else if(total2 == 0.0 && total1 != 0.0) {
                    total1 = total1 - Double.parseDouble(displayText.getText());
                    math_operation = '*';
                    System.out.println(math_operation);
                    displayText.setText(null);

                } else if (total2 == 0.0) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '*';
                    System.out.println(math_operation);
                }
            }
        });

        btDiv.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ActivatedButtons){
                    for(JButton button : buttonsNumbers){
                        button.setEnabled(true);
                    }
                    ActivatedButtons = true;
                }

                if (!total.isEmpty() && displayText.getText().equals(total)){
                    displayText.setText(null);
                    math_operation = '/';
                }
                else if (!total.isEmpty() && !displayText.getText().equals(total)) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    backupTotal = Double.parseDouble(total) / total1;
                    total = String.valueOf(backupTotal);
                    displayText.setText(total);
                    math_operation = '/';
                }
                else if (!total.isEmpty()) {
                    total1 = Double.parseDouble(total);
                    displayText.setText(null);
                    math_operation = '/';
                }
                else if(total2 == 0.0 && total1 != 0.0) {
                    total1 = total1 / Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '/';
                }
                else if (total2 == 0.0) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '/';
                }
            }
        });
        btPercentage.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                if(!ActivatedButtons){
                    for(JButton button : buttonsNumbers){
                        button.setEnabled(true);

                    }
                    ActivatedButtons = true;
                }
                if (!displayText.getText().isEmpty()){
                    backupTotal = Double.parseDouble(displayText.getText()) / 100;
                    displayText.setText(String.valueOf(backupTotal));
                }
            }
        });
    }
}
