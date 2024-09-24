import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kgToLbConverterDOTSCalculator {

    public static void main(String[] args) {
        //creating main frame

        JFrame frame = new JFrame("Kg/Lb Converter, Dots Calculator");

        //setting what happens when the user closes the window

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);

        JPanel mainPanel = new JPanel(new CardLayout());

        JPanel menuPanel = new JPanel();

        JButton kgToLbButton = new JButton("Kg to Lb");
        JButton lbToKgButton = new JButton("Lb to Kg");
        JButton dotsButton = new JButton("DOTS Calculator");

        menuPanel.add(kgToLbButton);
        menuPanel.add(lbToKgButton);
        menuPanel.add(dotsButton);

        mainPanel.add(menuPanel, "Menu");

        JPanel kgToLbPanel = kgToLbPanelMaker(mainPanel);
        JPanel lbToKgPanel = lbToKgPanelMaker(mainPanel);
        JPanel dotsPanel = dotsPanelMaker(mainPanel);

        mainPanel.add(kgToLbPanel, "Kg To Lb");
        mainPanel.add(lbToKgPanel, "Lb To Kg");
        mainPanel.add(dotsPanel, "DOTS Calculator");

        kgToLbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(mainPanel, "Kg To Lb");
            }
        });

        lbToKgButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(mainPanel, "Lb To Kg");
            }
        });

        dotsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(mainPanel, "DOTS Calculator");
            }
        });


        frame.add(mainPanel);

        frame.setVisible(true);
    }

    private static JPanel kgToLbPanelMaker(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton menuButton = new JButton("Menu");
        menuButton.setBounds(50, 25, 150, 25);
        panel.add(menuButton);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout)mainPanel.getLayout();
                cardLayout.show(mainPanel, "Menu");
            }
        });

        //creating a label that prompts the user to enter a weight value
        JLabel inputLabel = new JLabel("Enter weight");
        inputLabel.setBounds(285, 25, 150, 25);
        panel.add(inputLabel);

        //creates a text field that allows the user to enter a weight value
        JTextField inputText = new JTextField(20);
        inputText.setBounds(250, 55, 150, 25);
        panel.add(inputText);

        //creates a calculate button
        JButton calculateButton = new JButton ("Calculate");
        calculateButton.setBounds(250, 85, 150, 25);
        panel.add(calculateButton);

        //creates a label for the output
        JLabel outputLabel = new JLabel("");
        outputLabel.setBounds(250, 115, 300, 25);
        outputLabel.setBackground(Color.RED);
        panel.add(outputLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                try {
                    double kg = Double.parseDouble(input);

                    double lbs = kgToLbs(kg);

                    outputLabel.setText(String.format("%.2f kg = %.2f lbs", kg, lbs));
                }

                catch (NumberFormatException error){
                    outputLabel.setText("Please enter a valid number");
                    inputText.setText("");
                }
            }
        });

        return panel;
    }

    private static JPanel lbToKgPanelMaker(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton menuButton = new JButton("Menu");
        menuButton.setBounds(50, 25, 150, 25);
        panel.add(menuButton);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout)mainPanel.getLayout();
                cardLayout.show(mainPanel, "Menu");
            }
        });

        //creating a label that prompts the user to enter a weight value
        JLabel inputLabel = new JLabel("Enter weight");
        inputLabel.setBounds(285, 25, 150, 25);
        panel.add(inputLabel);

        //creates a text field that allows the user to enter a weight value
        JTextField inputText = new JTextField(20);
        inputText.setBounds(250, 55, 150, 25);
        panel.add(inputText);

        //creates a calculate button
        JButton calculateButton = new JButton ("Calculate");
        calculateButton.setBounds(250, 85, 150, 25);
        panel.add(calculateButton);

        //creates a label for the output
        JLabel outputLabel = new JLabel("");
        outputLabel.setBounds(250, 115, 300, 25);
        outputLabel.setBackground(Color.RED);
        panel.add(outputLabel);
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                try {
                    double lbs = Double.parseDouble(input);

                    double kg = lbsToKg(lbs);

                    outputLabel.setText(String.format("%.2f lb = %.2f kg", lbs, kg));
                }

                catch (NumberFormatException error){
                    outputLabel.setText("Please enter a valid number");
                    inputText.setText("");
                }
            }
        });

        return panel;
    }

    private static JPanel dotsPanelMaker(JPanel mainPanel) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton menuButton = new JButton("Menu");
        menuButton.setBounds(50, 25, 150, 25);
        panel.add(menuButton);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout)mainPanel.getLayout();
                cardLayout.show(mainPanel, "Menu");
            }
        });

        JLabel genderLabel = new JLabel("Male or Female?");
        genderLabel.setBounds(250, 25, 150, 25);
        panel.add(genderLabel);

        JTextField genderText = new JTextField(20);
        genderText.setBounds(250, 55, 150, 25);
        panel.add(genderText);

        JLabel bodyweightLabel = new JLabel("Enter bodyweight");
        bodyweightLabel.setBounds(250, 85, 150, 25);
        panel.add(bodyweightLabel);

        JTextField bodyweightText = new JTextField(20);
        bodyweightText.setBounds(250, 115, 150, 25);
        panel.add(bodyweightText);

        JLabel totalLabel = new JLabel("Enter total");
        totalLabel.setBounds(250, 145, 150, 25);
        panel.add(totalLabel);

        JTextField totalText = new JTextField(20);
        totalText.setBounds(250, 175, 150, 25);
        panel.add(totalText);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(250, 205, 150, 25);
        panel.add(calculateButton);

        JLabel outputLabel = new JLabel("");
        outputLabel.setBounds(250, 235, 300, 25);
        panel.add(outputLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (genderText.getText().isEmpty() || bodyweightText.getText().isEmpty() || totalText.getText().isEmpty()) {
                    outputLabel.setText("Please fill in all fields");
                }

                else if (!genderText.getText().equalsIgnoreCase("Male") && !genderText.getText().equalsIgnoreCase("Female")) {
                    outputLabel.setText("Please enter either Male or Female");
                    genderText.setText("");
                }

                else {
                    try {
                        double bodyweight = Double.parseDouble(bodyweightText.getText());
                        double total = Double.parseDouble(totalText.getText());

                        double dots = dotsCalculator(bodyweight, total, genderText.getText());
                        
                        outputLabel.setText(String.format("DOTS Score: %.2f", dots));
                    }

                    catch (NumberFormatException error) {
                        outputLabel.setText("Please enter a valid number");
                        bodyweightText.setText("");
                        totalText.setText("");
                    }
                }
            }
        });

        return panel;
    }

    private static double kgToLbs(double number) {
        return number * 2.2046;
    }

    private static double lbsToKg(double number) {
        return number / 2.2046;
    }

    private static double dotsCalculator(double bodyweight, double total, String gender) {
        double result = 0;

        bodyweight /= 2.2046;
        total /= 2.2046;

        double aMen = -0.000001093;
        double bMen = 0.0007391293;
        double cMen = -0.1918759221;
        double dMen = 24.0900756;
        double eMen = -307.75076;

        double aWomen = -0.0000010706;
        double bWomen = 0.0005158568;
        double cWomen = -0.1126655495;
        double dWomen = 13.6175032;
        double eWomen = -57.96288;

        if (gender.equalsIgnoreCase("Male")) {
            double tempDenominator = (aMen * Math.pow(bodyweight, 4)) + (bMen * Math.pow(bodyweight, 3)) + 
            (cMen * Math.pow(bodyweight, 2)) + (dMen * bodyweight) + eMen;

            result = total * (500 / tempDenominator);
        }

        else if (gender.equalsIgnoreCase("Female")) {
            double tempDenominator = (aWomen * Math.pow(bodyweight, 4)) + (bWomen * Math.pow(bodyweight, 3)) + 
            (cWomen * Math.pow(bodyweight, 2)) + (dWomen * bodyweight) + eWomen;

            result = total * (500/ tempDenominator);
        }

        return result;
    }

}
