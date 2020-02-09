import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class CalculatorUI {
    CalculatorMath math = new CalculatorMath();
    String operation;
    String valueString;
    ArrayList<String> values;
    JFrame frame = new JFrame("JCalculator");
    JMenuBar menuBar = new JMenuBar();
    JMenu applicationMenu = new JMenu("Application");
    JMenu viewMenu = new JMenu("View");
    JMenuItem exitItem = new JMenuItem("Exit");
    JMenuItem colorItem = new JMenuItem("Color");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonStar = new JButton("*");
    JButton buttonForSlash = new JButton("/");
    JButton buttonEquals = new JButton("=");
    JButton buttonClear = new JButton("Cl");
    JTextArea textArea = new JTextArea();
    JPanel digitPanel = new JPanel();
    JPanel windowPanel = new JPanel();

    public CalculatorUI(){
        values = new ArrayList<String>();
        operation = "";
        valueString = "";
        frame.setSize(250,275);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        //MenuBar
        menuBar.add(applicationMenu);
        menuBar.add(viewMenu);
        //Menus
        applicationMenu.add(exitItem);
        viewMenu.add(colorItem);
        //exitItem
        exitItem.addActionListener(e -> {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
        //colorItem
        colorItem.addActionListener(e -> {
            frame.setBackground(Color.red);
        });
        frame.add(windowPanel);
        textArea.setColumns(15);
        textArea.setRows(3);
        windowPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.1;
        c.weighty = 0.1;
        c.anchor = GridBagConstraints.NORTH;
        windowPanel.add(textArea,c);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.1;
        c.weighty = 0.1;
        windowPanel.add(digitPanel,c);
        digitPanel.setLayout(new GridBagLayout());

        c.insets = new Insets(1,1,1,1);
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.1;
        c.weighty = 0.1;

        button1.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button1, c);

        c.gridx = 1;
        c.gridx = 1;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button2.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button2,c);

        c.gridx = 2;
        c.gridy = 0;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button3.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button3,c);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button4.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button4,c);

        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button5.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button5,c);

        c.gridx = 2;
        c.gridy = 1;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button6.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button6,c);

        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button7.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button7,c);

        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button8.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button8,c);

        c.gridx = 2;
        c.gridy = 2;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button9.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button9,c);

        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 0.1;
        c.weighty = 0.1;
        button0.setPreferredSize(new Dimension(50,30));
        digitPanel.add(button0,c);

        c.gridx = 3;
        c.gridy = 0;
        c.weightx = 0.1;
        c.weighty = 0.1;
        buttonPlus.setPreferredSize(new Dimension(50,30));
        digitPanel.add(buttonPlus,c);

        c.gridx = 3;
        c.gridy = 1;
        c.weightx = 0.1;
        c.weighty = 0.1;
        buttonMinus.setPreferredSize(new Dimension(50,30));
        digitPanel.add(buttonMinus,c);

        c.gridx = 3;
        c.gridy = 2;
        c.weightx = 0.1;
        c.weighty = 0.1;
        buttonStar.setPreferredSize(new Dimension(50,30));
        digitPanel.add(buttonStar,c);

        c.gridx = 3;
        c.gridy = 3;
        c.weightx = 0.1;
        c.weighty = 0.1;
        buttonForSlash.setPreferredSize(new Dimension(50,30));
        digitPanel.add(buttonForSlash,c);

        c.gridx = 2;
        c.gridy = 3;
        c.weightx = 0.1;
        c.weighty = 0.1;
        buttonEquals.setPreferredSize(new Dimension(50,30));
        digitPanel.add(buttonEquals,c);

        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.1;
        c.weighty = 0.1;
        buttonEquals.setPreferredSize(new Dimension(50,30));
        digitPanel.add(buttonClear,c);

        addButtonListeners();

    }

    private void addToValues(String value){
        values.add(value);
    }

    private void addToStringValue(String value){
        valueString += value;
    }

    private void addButtonListeners(){
        button1.addActionListener(e ->{
            String value = "1";
            addToStringValue(value);
            textArea.append(value);
        });
        button2.addActionListener(e ->{
            String value = "2";
            addToStringValue(value);
            textArea.append(value);
        });
        button3.addActionListener(e ->{
            String value = "3";
            addToStringValue(value);
            textArea.append(value);
        });
        button4.addActionListener(e ->{
            String value = "4";
            addToStringValue(value);
            textArea.append(value);
        });
        button5.addActionListener(e ->{
            String value = "5";
            addToStringValue(value);
            textArea.append(value);
        });
        button6.addActionListener(e ->{
            String value = "6";
            addToStringValue(value);
            textArea.append(value);
        });
        button7.addActionListener(e ->{
            String value = "7";
            addToStringValue(value);
            textArea.append(value);
        });
        button8.addActionListener(e ->{
            String value = "8";
            addToStringValue(value);
            textArea.append(value);
        });
        button9.addActionListener(e ->{
            String value = "9";
            addToStringValue(value);
            textArea.append(value);
        });
        button0.addActionListener(e ->{
            String value = "0";
            addToStringValue(value);
            textArea.append(value);
        });
        buttonPlus.addActionListener(e ->{
            String value = "+";
            operation = value;
            addToValues(valueString); //Adds the current value entered into the value list and sets up the next value.
            valueString = "";
            textArea.append(value);
        });
        buttonMinus.addActionListener(e ->{
            String value = "-";
            operation = value;
            addToValues(valueString); //Adds the current value entered into the value list and sets up the next value.
            valueString = "";
            textArea.append(value);
        });
        buttonStar.addActionListener(e ->{
            String value = "*";
            operation = value;
            addToValues(valueString); //Adds the current value entered into the value list and sets up the next value.
            valueString = "";
            textArea.append(value);
        });
        buttonForSlash.addActionListener(e ->{
            String value = "/";
            operation = value;
            addToValues(valueString); //Adds the current value entered into the value list and sets up the next value.
            valueString = "";
            textArea.append(value);
        });
        buttonClear.addActionListener(e ->{
            String value = "";
            values.removeAll(values);
            valueString = "";
            textArea.append(value);
        });
        buttonEquals.addActionListener(e ->{
            String value = "=";
            String total = "";
            addToValues(valueString); //Adds the current value entered into the value list and sets up the next value.
            textArea.setText("");
            switch(operation){
                case "+":
                    total = math.addValue(values.get(0),values.get(1));
                    break;
                case "-":
                    total = math.subtractValue(values.get(0),values.get(1));
                    break;
                case "*":
                    total = math.multiplyValue(values.get(0),values.get(1));
                    break;
                case "/":
                    total = math.divideValue(values.get(0),values.get(1));
                    break;
            }
            operation = "";
            textArea.append(value + " " + total);
        });
    }
}
