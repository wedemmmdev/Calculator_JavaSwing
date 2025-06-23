package main.ScreenCalculator;

import javax.swing.*;
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
    private JButton btThreeZeros;
    private JButton btDelete;
    private JButton btEquals;
    private JButton btAdd;
    private JButton btSub;
    private JButton btMult;
    private JButton btDiv;
    private JButton [] buttons = {btOne, btTwo, btThree, btFour,btFive, btSix, btSeven , btEight, btNine, btZero, btThreeZeros};

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorScreen().CalculatorScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CalculatorScreen() {
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

        btThreeZeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTxt = displayText.getText() + btThreeZeros.getText();
                displayText.setText(btTxt);
            }
        });

        btDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                for(JButton button : buttons){
                    button.setEnabled(false);
                }
                ActivatedButtons = false;
                if (total1 != 0.0 && total2 == 0.0) {
                    total2 = Double.parseDouble(displayText.getText());
                    switch (math_operation){
                        case '+':
                            total = Double.toString(total1+total2);
                            displayText.setText(total);
                            total2 = 0.0;
                            total1 = 0.0;

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
                if(!ActivatedButtons){
                    for(JButton button : buttons){
                        button.setEnabled(true);
                    }
                    ActivatedButtons = true;
                }
                if (!total.isEmpty() && total1 == 0.0 && displayText.getText().isEmpty()){
                    displayText.setText(null);
                    math_operation = '+';

                } else if (!total.isEmpty() && displayText.getText().equals(total)){
                    displayText.setText(null);

                } else if (!total.isEmpty() && !displayText.getText().equals(total)) {
                    total1 = Double.parseDouble(displayText.getText());
                    backupTotal = Double.parseDouble(total) + total1;
                    total = String.valueOf(backupTotal);
                    displayText.setText(total);
                    System.out.println("Backup "+backupTotal);
                    System.out.println("Totalzin: " + total);
                    System.out.println("Tota1: " + total1);
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
                    System.out.println("Total1 " + total1);
                    System.out.println("Total2 " + total2);
                    System.out.println("Total " + total);

                } else if (total2 == 0.0) {
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '+';
                    System.out.println(math_operation);
                    System.out.println("Total1 " + total1);
                    System.out.println("Total2 " + total2);
                    System.out.println("Total " + total);
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
                    System.out.println("if 2");
                    displayText.setText(null);
                    math_operation = '-';

                } else if (!total.isEmpty() && !displayText.getText().equals(total)) {
                    System.out.println("if 3");
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    backupTotal = Double.parseDouble(total) - total1;
                    total = String.valueOf(backupTotal);
                    System.out.println("Total sub" + total);
                    displayText.setText(total);
                    System.out.println("Backup "+backupTotal);
                    System.out.println("Tota1: " + total1);
                    System.out.println("Tota2:" + total1);
                    math_operation = '-';
                } else if (!total.isEmpty()){
                    System.out.println("if 4");
                    total1 = Double.parseDouble(total);
                    System.out.println("Total sub" + total);
                    displayText.setText(null);
                    math_operation = '-';
                }else if(total2 == 0.0 && total1 != 0.0) {
                    System.out.println("if 5");
                    total1 = total1 - Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '-';
                    System.out.println(math_operation);
                    System.out.println("Total1 " + total1);
                    System.out.println("Total2 " + total2);
                    System.out.println("Total " + total);

                } else if (total2 == 0.0) {
                    System.out.println("if 6");
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '-';
                    System.out.println(math_operation);
                    System.out.println("Total1 " + total1);
                    System.out.println("Total2 " + total2);
                    System.out.println("Total " + total);
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
                    System.out.println("if 2");
                    displayText.setText(null);
                    math_operation = '*';

                } else if (!total.isEmpty() && !displayText.getText().equals(total)) {
                    System.out.println("if 3");
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    backupTotal = Double.parseDouble(total) - total1;
                    total = String.valueOf(backupTotal);
                    System.out.println("Total sub" + total);
                    displayText.setText(total);
                    System.out.println("Backup "+backupTotal);
                    System.out.println("Tota1: " + total1);
                    System.out.println("Tota2:" + total1);
                    math_operation = '*';
                } else if (!total.isEmpty()){
                    System.out.println("if 4");
                    total1 = Double.parseDouble(total);
                    System.out.println("Total sub" + total);
                    displayText.setText(null);
                    math_operation = '-';
                }else if(total2 == 0.0 && total1 != 0.0) {
                    System.out.println("if 5");
                    total1 = total1 - Double.parseDouble(displayText.getText());

                    math_operation = '-';
                    System.out.println(math_operation);
                    System.out.println("Total1 " + total1);
                    System.out.println("Total2 " + total2);
                    System.out.println("Total " + total);
                    displayText.setText(null);

                } else if (total2 == 0.0) {
                    System.out.println("if 6");
                    total1 = Double.parseDouble(displayText.getText());
                    displayText.setText(null);
                    math_operation = '-';
                    System.out.println(math_operation);
                    System.out.println("Total1 " + total1);
                    System.out.println("Total2 " + total2);
                    System.out.println("Total " + total);
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

                System.out.println("Operação: " + math_operation);
                System.out.println("Total1: " + total1);
                System.out.println("Total2: " + total2);
                System.out.println("Total: " + total);
            }
        });


    }
}
