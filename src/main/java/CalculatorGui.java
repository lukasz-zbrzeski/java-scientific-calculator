import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalculatorGui extends JFrame implements ActionListener {
    private JTextField textField;
    private double temp, temp1, result, a;
    private static double m1, m2;
    private int k = 1, x = 0, y = 0, z = 0;
    private char ch;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bClear,
                    bPow2, bPow3, bExp, bFac, bPlus, bMin, bDiv, bLog, bRec,
                    bMul, bEq, bAddSub, bDot, bMr, bMc, bMp, bMm, bSqrt,
                    bSin, bCos, bTan;
    private Container container;
    private JPanel textPanel, buttonPanel;

    CalculatorGui() {
        container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel textPanel = new JPanel();
        textField = new JTextField(25);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    e.consume();
                }
            }
        });
        textPanel.add(textField);
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(8,4, 2, 2));
        boolean t = true;
        //
        bMr = new JButton("MR");
        buttonPanel.add(bMr);
        bMr.addActionListener(this);
        //
        bMc = new JButton("MC");
        buttonPanel.add(bMc);
        bMc.addActionListener(this);
        //
        bMp = new JButton("M+");
        buttonPanel.add(bMp);
        bMp.addActionListener(this);
        //
        bMm = new JButton("M-");
        buttonPanel.add(bMm);
        bMm.addActionListener(this);
        //
        b1 = new JButton("1");
        buttonPanel.add(b1);
        b1.addActionListener(this);
        //
        b2 = new JButton("2");
        buttonPanel.add(b2);
        b2.addActionListener(this);
        //
        b3 = new JButton("3");
        buttonPanel.add(b3);
        b3.addActionListener(this);
        //
        b4 = new JButton("4");
        buttonPanel.add(b4);
        b4.addActionListener(this);
        //
        b5 = new JButton("5");
        buttonPanel.add(b5);
        b5.addActionListener(this);
        //
        b6 = new JButton("6");
        buttonPanel.add(b6);
        b6.addActionListener(this);
        //
        b7 = new JButton("7");
        buttonPanel.add(b7);
        b7.addActionListener(this);
        //
        b8 = new JButton("8");
        buttonPanel.add(b8);
        b8.addActionListener(this);
        //
        b9 = new JButton("9");
        buttonPanel.add(b9);
        b9.addActionListener(this);
        //
        b0 = new JButton("0");
        buttonPanel.add(b0);
        b0.addActionListener(this);
        //
        bPlus = new JButton("+");
        buttonPanel.add(bPlus);
        bPlus.addActionListener(this);
        //
        bMin = new JButton("-");
        buttonPanel.add(bMin);
        bMin.addActionListener(this);
        //
        bMul = new JButton("*");
        buttonPanel.add(bMul);
        bMul.addActionListener(this);
        //
        bDiv = new JButton("/");
        buttonPanel.add(bDiv);
        bDiv.addActionListener(this);
        //
        bAddSub = new JButton("+/-");
        buttonPanel.add(bAddSub);
        bAddSub.addActionListener(this);
        //
        bDot = new JButton(".");
        buttonPanel.add(bDot);
        bDot.addActionListener(this);
        //
        bEq = new JButton("=");
        buttonPanel.add(bEq);
        bEq.addActionListener(this);
        //
        bRec = new JButton("1/x");
        buttonPanel.add(bRec);
        bRec.addActionListener(this);
        //
        bSqrt = new JButton("Sqrt");
        buttonPanel.add(bSqrt);
        bSqrt.addActionListener(this);
        //
        bLog = new JButton("Log");
        buttonPanel.add(bLog);
        bLog.addActionListener(this);
        //
        bSin = new JButton("SIN");
        buttonPanel.add(bSin);
        bSin.addActionListener(this);
        //
        bCos = new JButton("COS");
        buttonPanel.add(bCos);
        bCos.addActionListener(this);
        //
        bTan = new JButton("TAN");
        buttonPanel.add(bTan);
        bTan.addActionListener(this);
        //
        bPow2 = new JButton("x^2");
        buttonPanel.add(bPow2);
        bPow2.addActionListener(this);
        //
        bPow3 = new JButton("x^3");
        buttonPanel.add(bPow3);
        bPow3.addActionListener(this);
        //
        bExp = new JButton("Exp");
        buttonPanel.add(bExp);
        bExp.addActionListener(this);
        //
        bFac = new JButton("n!");
        buttonPanel.add(bFac);
        bFac.addActionListener(this);
        //
        bClear = new JButton("AC");
        buttonPanel.add(bClear);
        bClear.addActionListener(this);
        //
        container.add("Center", buttonPanel);
        container.add("North", textPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("1")) {
            if (z == 0) {
                textField.setText(textField.getText() + "1");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                textField.setText(textField.getText() + "2");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                textField.setText(textField.getText() + "3");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                textField.setText(textField.getText() + "4");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                textField.setText(textField.getText() + "5");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                textField.setText(textField.getText() + "6");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                textField.setText(textField.getText() + "7");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                textField.setText(textField.getText() + "8");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                textField.setText(textField.getText() + "9");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                textField.setText(textField.getText() + "0");
            } else {
                textField.setText("");
                textField.setText(textField.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("AC")) {
            textField.setText("");
            x = 0;
            y = 0;
            z = 0;
        }
        if (s.equals("log")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.log(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("1/x")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = 1 / Double.parseDouble(textField.getText());
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("Exp")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.exp(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("x^2")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.pow(Double.parseDouble(textField.getText()), 2);
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("x^3")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.pow(Double.parseDouble(textField.getText()), 3);
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("+/-")) {
            if (x == 0) {
                textField.setText("-" + textField.getText());
                x = 1;
            } else {
                textField.setText(textField.getText());
            }
        }
        if (s.equals(".")) {
            if (y == 0) {
                textField.setText(textField.getText() + ".");
                y = 1;
            } else {
                textField.setText(textField.getText());
            }
        }
        if (s.equals("+")) {
            if (textField.getText().equals("")) {
                textField.setText("");
                temp = 0;
                ch = '+';
            } else {
                temp = Double.parseDouble(textField.getText());
                textField.setText("");
                ch = '+';
                y = 0;
                x = 0;
            }
            textField.requestFocus();
        }
        if (s.equals("-")) {
            if (textField.getText().equals("")) {
                textField.setText("");
                temp = 0;
                ch = '-';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(textField.getText());
                textField.setText("");
                ch = '-';
            }
            textField.requestFocus();
        }
        if (s.equals("/")) {
            if (textField.getText().equals("")) {
                textField.setText("");
                temp = 1;
                ch = '/';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(textField.getText());
                ch = '/';
                textField.setText("");
            }
            textField.requestFocus();
        }
        if (s.equals("*")) {
            if (textField.getText().equals("")) {
                textField.setText("");
                temp = 1;
                ch = '*';
            } else {
                x = 0;
                y = 0;
                temp = Double.parseDouble(textField.getText());
                ch = '*';
                textField.setText("");
            }
            textField.requestFocus();
        }
        if (s.equals("MC")) {
            m1 = 0;
            textField.setText("");
        }
        if (s.equals("MR")) {
            textField.setText("");
            textField.setText(textField.getText() + m1);
        }
        if (s.equals("M+")) {
            if (k == 1) {
                m1 = Double.parseDouble(textField.getText());
                k++;
            } else {
                m1 += Double.parseDouble(textField.getText());
                textField.setText("" + m1);
            }
        }
        if (s.equals("M-")) {
            if (k == 1) {
                m1 = Double.parseDouble(textField.getText());
                k++;
            } else {
                m1 -= Double.parseDouble(textField.getText());
                textField.setText("" + m1);
            }
        }
        if (s.equals("Sqrt")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("SIN")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.sin(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("COS")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.cos(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("TAN")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = Math.tan(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        if (s.equals("=")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                temp1 = Double.parseDouble(textField.getText());
                switch (ch) {
                    case '+':
                        result = temp + temp1;
                        break;
                    case '-':
                        result = temp - temp1;
                        break;
                    case '/':
                        result = temp / temp1;
                        break;
                    case '*':
                        result = temp * temp1;
                        break;
                }
                textField.setText("");
                textField.setText(textField.getText() + result);
                z = 1;
            }
        }
        if (s.equals("n!")) {
            if (textField.getText().equals("")) {
                textField.setText("");
            } else {
                a = fact(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        }
        textField.requestFocus();
    }

    double fact(double x) {
        int er = 0;
        if (x < 0) {
            er = 20;
            return 9;
        }
        double s = 1;
        for (int i = 2; i <= x; i+= 1.0) {
            s *= i;
        }
        return s;
    }

    public static void main(String[] args) {
        CalculatorGui calculatorGui = new CalculatorGui();
        calculatorGui.setTitle("Scientific Calculator");
        calculatorGui.pack();
        calculatorGui.setVisible(true);
    }
}
