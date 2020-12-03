import javax.swing.*;
import java.awt.*;

/**
 * it makes the GUI of the calculator
 * @author Mobina Hadavifar
 * @version 1.0
 */
public class CalculatorGUI {

    JFrame jFrame;
    JPanel panel;
    JPanel standard;
    JPanel scientific;
    JTabbedPane jTabbedPane;
    //Buttons
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton openParenthesis = new JButton("(");
    JButton closeParenthesis = new JButton(")");
    JButton rem = new JButton("%");
    JButton clear = new JButton("C");
    JButton div = new JButton("/");
    JButton mul = new JButton("*");
    JButton subtract = new JButton("-");
    JButton dot = new JButton(".");
    JButton equal = new JButton("=");
    JButton sum = new JButton("+");
    JButton one2 = new JButton("1");
    JButton two2 = new JButton("2");
    JButton three2 = new JButton("3");
    JButton four2 = new JButton("4");
    JButton five2 = new JButton("5");
    JButton six2 = new JButton("6");
    JButton seven2 = new JButton("7");
    JButton eight2 = new JButton("8");
    JButton nine2 = new JButton("9");
    JButton zero2 = new JButton("0");
    JButton openParenthesis2 = new JButton("(");
    JButton closeParenthesis2 = new JButton(")");
    JButton rem2 = new JButton("%");
    JButton clear2 = new JButton("C");
    JButton div2 = new JButton("/");
    JButton mul2 = new JButton("*");
    JButton subtract2 = new JButton("-");
    JButton dot2 = new JButton(".");
    JButton equal2 = new JButton("=");
    JButton sum2 = new JButton("+");
    JButton e = new JButton("e");
    JButton p = new JButton("π");
    JButton shift = new JButton("Shift");
    JButton sinOrCos = new JButton("sin-cos");
    JButton tanOrCot = new JButton("tan-cot");
    JButton expOrLog = new JButton("exp-log");

    /**
     * makes the gui of the calculator
     */
    public CalculatorGUI (){
        jFrame = new JFrame();
        jFrame.setTitle("AUT Calculator");
        jFrame.setSize(430, 570);
        jFrame.setLocation(100, 200);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        panel = new JPanel();
        panel.setLayout(null);
        jFrame.setContentPane(panel);
        draw();
    }

    /**
     * draws the calculator
     */
    private void draw(){
        drawScreen();
        drawSimpleKeyboard();
        drawScientificKeyboard();
        drawTabs();
    }

    /**
     * draws the text part
     */
    private void drawScreen (){
        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        JScrollPane jsp = new JScrollPane(jTextArea);
        jsp.setSize(400,100);
        jsp.setLocation(10,10);

        for (int i = 0 ; i<20 ; i++){
            jTextArea.append("I = " + i + " ");
        }
        panel.add(jsp);
    }

    /**
     * draws the simple calculator's keyboard
     */
    private void drawSimpleKeyboard (){
        standard = new JPanel();
        standard.setSize(400,400);
//        standard.setLocation(10, 150);
        standard.setLayout(new GridLayout(5,4));
//        jFrame.add(keyboardPanel);
        standard.add(one);
        standard.add(two);
        standard.add(three);
        standard.add(sum);
        standard.add(four);
        standard.add(five);
        standard.add(six);
        standard.add(subtract);
        standard.add(seven);
        standard.add(eight);
        standard.add(nine);
        standard.add(mul);
        standard.add(div);
        standard.add(zero);
        standard.add(rem);
        standard.add(equal);
        standard.add(openParenthesis);
        standard.add(closeParenthesis);
        standard.add(dot);
        standard.add(clear);
    }

    /**
     * draws the scientific calculator's keyboard
     */
    private void drawScientificKeyboard (){
        scientific = new JPanel();
        scientific.setSize(400,400);
        scientific.setLayout(new GridLayout(9,3));
        scientific.add(one2);
        scientific.add(two2);
        scientific.add(three2);
        scientific.add(four2);
        scientific.add(five2);
        scientific.add(six2);
        scientific.add(seven2);
        scientific.add(eight2);
        scientific.add(nine2);
        scientific.add(sum2);
        scientific.add(zero2);
        scientific.add(subtract2);
        scientific.add(mul2);
        scientific.add(div2);
        scientific.add(rem2);
        scientific.add(equal2);
        scientific.add(openParenthesis2);
        scientific.add(closeParenthesis2);
        scientific.add(dot2);
        scientific.add(clear2);
        scientific.add(e);
        scientific.add(p);
        scientific.add(expOrLog);
        scientific.add(sinOrCos);
        scientific.add(tanOrCot);
        scientific.add(shift);
    }

    /**
     * draws the tabs (of simple or scientific keyboards)
     */
    private void drawTabs (){
        jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Standard",standard );
        jTabbedPane.addTab("Scientific", scientific);
        jTabbedPane.setSize(400,400);
        jTabbedPane.setLocation(10,120);
        panel.add(jTabbedPane);

    }

    /**
     * shows the calculator
     */
    public void showGUI (){
        jFrame.setVisible(true);
    }

}
