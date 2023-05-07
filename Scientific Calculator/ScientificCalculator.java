import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculator implements ActionListener{
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] funcButtons = new JButton[25];
    JButton addButton,subButton,multButton,divButton;
    JButton eqButton,clrButton,decButton,delButton;
    JButton sinButton,cosButton,tanButton,sinhButton,coshButton,tanhButton;
    JButton sqButton,cubeButton,powButton,facButton,logButton,expButton;
    JButton modButton,sqrtButton,cubertButton,onebyButton,negButton;
    JPanel panel;


    Font myFont = new Font("Arial Narrow", Font.BOLD, 30);
    Font buttonFont = new Font("Times New Roman", Font.BOLD, 15);

    double num1=0, num2=0, result=0;
    char operator;


    //constructor
    ScientificCalculator(){

        frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 650);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(15, 25, 365, 75);
        textfield.setBackground(Color.GRAY);
        textfield.setFont(myFont);
        textfield.setHorizontalAlignment(JTextField.RIGHT);
        textfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        logButton = new JButton("log");
        expButton = new JButton("exp");
        facButton = new JButton("n!");
        powButton = new JButton("x^y");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        sinhButton = new JButton("sinh");
        coshButton = new JButton("cosh");
        tanhButton = new JButton("tanh");
        sqButton = new JButton("x^2");
        cubeButton = new JButton("x^3");
        sqrtButton = new JButton("√x");
        cubertButton = new JButton("3√x");
        modButton = new JButton("%");
        onebyButton = new JButton("1/x");
        negButton = new JButton("(-)");

        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = multButton;
        funcButtons[3] = divButton;
        funcButtons[4] = decButton;
        funcButtons[5] = eqButton;
        funcButtons[6] = delButton;
        funcButtons[7] = clrButton;
        funcButtons[8] = logButton;
        funcButtons[9] = expButton;
        funcButtons[10] = facButton;
        funcButtons[11] = powButton;
        funcButtons[12] = sinButton;
        funcButtons[13] = cosButton;
        funcButtons[14] = tanButton;
        funcButtons[15] = sinhButton;
        funcButtons[16] = coshButton;
        funcButtons[17] = tanhButton;
        funcButtons[18] = sqButton;
        funcButtons[19] = cubeButton;
        funcButtons[20] = sqrtButton;
        funcButtons[21] = cubertButton;
        funcButtons[22] = modButton;
        funcButtons[23] = onebyButton;
        funcButtons[24] = negButton;

        for(int i=0; i<25; ++i)
        {
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFont(buttonFont);
            funcButtons[i].setFocusable(false);
        }

        for(int i=0; i<10; ++i)
        {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(buttonFont);
            numberButtons[i].setFocusable(false);
        }



        //1st row
        logButton.setBounds(15, 120, 65, 50);
        sqButton.setBounds(90, 120, 65, 50);
        cubeButton.setBounds(165, 120, 65, 50);
        sqrtButton.setBounds(240, 120, 65, 50);
        cubertButton.setBounds(315, 120, 65, 50);

        //2nd row
        powButton.setBounds(15, 190, 65, 50);
        facButton.setBounds(90, 190, 65, 50);
        sinButton.setBounds(165, 190, 65, 50);
        cosButton.setBounds(240, 190, 65, 50);
        tanButton.setBounds(315, 190, 65, 50);

        //3rd row
        modButton.setBounds(15, 260, 65, 50);
        onebyButton.setBounds(90, 260, 65, 50);
        sinhButton.setBounds(165, 260, 65, 50);
        coshButton.setBounds(240, 260, 65, 50);
        tanhButton.setBounds(315, 260, 65, 50);

        //4th row
        numberButtons[7].setBounds(15, 330, 65, 50);
        numberButtons[8].setBounds(90, 330, 65, 50);
        numberButtons[9].setBounds(165, 330, 65, 50);
        delButton.setBounds(240, 330, 65, 50);
        clrButton.setBounds(315, 330, 65, 50);

        //5th row
        numberButtons[4].setBounds(15, 400, 65, 50);
        numberButtons[5].setBounds(90, 400, 65, 50);
        numberButtons[6].setBounds(165, 400, 65, 50);
        multButton.setBounds(240, 400, 65, 50);
        divButton.setBounds(315, 400, 65, 50);

        //6th row
        numberButtons[1].setBounds(15, 470, 65, 50);
        numberButtons[2].setBounds(90, 470, 65, 50);
        numberButtons[3].setBounds(165, 470, 65, 50);
        addButton.setBounds(240, 470, 65, 50);
        subButton.setBounds(315, 470, 65, 50);

        //7th row
        expButton.setBounds(15, 540, 65, 50);
        numberButtons[0].setBounds(90, 540, 65, 50);
        decButton.setBounds(165, 540, 65, 50);
        negButton.setBounds(240, 540, 65, 50);
        eqButton.setBounds(315, 540, 65, 50);

        panel = new JPanel();
        

        frame.add(logButton);
        frame.add(sqButton);
        frame.add(cubeButton);
        frame.add(sqrtButton);
        frame.add(cubertButton);
        frame.add(powButton);
        frame.add(facButton);
        frame.add(sinButton);
        frame.add(cosButton);
        frame.add(tanButton);
        frame.add(sinhButton);
        frame.add(coshButton);
        frame.add(tanhButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(multButton);
        frame.add(divButton);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(modButton);
        frame.add(onebyButton);
        frame.add(eqButton);
        frame.add(expButton);
        frame.add(decButton);
        frame.add(negButton);

        frame.add(numberButtons[0]);
        frame.add(numberButtons[1]);
        frame.add(numberButtons[2]);
        frame.add(numberButtons[3]);
        frame.add(numberButtons[4]);
        frame.add(numberButtons[5]);
        frame.add(numberButtons[6]);
        frame.add(numberButtons[7]);
        frame.add(numberButtons[8]);
        frame.add(numberButtons[9]);

        frame.add(textfield);
        frame.setVisible(true);

    }


    public static void main(String[] args){

        ScientificCalculator sc = new ScientificCalculator();

    }

    @Override
    public void actionPerformed(ActionEvent e){

        //enter number on textfield
        for(int i=0; i<10; ++i){

            if(e.getSource() == numberButtons[i])
            {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == decButton){
            textfield.setText(textfield.getText().concat("."));
        } 

        if(e.getSource() == addButton){
           num1 = Double.parseDouble(textfield.getText());
           operator = '+';
           textfield.setText(""); 
        }

        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText(""); 
        }

        if(e.getSource() == multButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText(""); 
        }

        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText(""); 
        }

        if(e.getSource() == modButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '%';
            textfield.setText(""); 
        }

        if(e.getSource() == powButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '^';
            textfield.setText(""); 
        }

        

        if(e.getSource() == eqButton)
        {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1+num2;
                    break;
                
                case '-':
                    result = num1-num2;
                    break;  
                
                case '*':
                    result = num1*num2;
                    break; 
                
                case '/':
                    result = num1/num2;
                    break; 
                    
                case '%':
                    result = num1%num2;
                    break;
                    
                case '^':    
                    result = Math.pow(num1, num2);
                    break;
                default:
                    break;
            }

            textfield.setText(String.valueOf(result));
            num1 = result;
        }

        if(e.getSource() == clrButton)
            textfield.setText("");
        
        if(e.getSource() == delButton)
        {
            String str = textfield.getText();
            textfield.setText("");
            for(int i=0; i<str.length()-1; ++i){
                textfield.setText(textfield.getText()+str.charAt(i));
            }
        }

        if(e.getSource() == negButton)
        {
            double temp = Double.parseDouble(textfield.getText());
            temp*=-1;
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == sinButton)
        {
            double temp = Math.sin(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == cosButton)
        {
            double temp = Math.cos(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == tanButton)
        {
            double temp = Math.tan(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == sinhButton)
        {
            double temp = Math.sinh(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == coshButton)
        {
            double temp = Math.cosh(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == tanhButton)
        {
            double temp = Math.tanh(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == expButton)
        {
            double temp = Math.exp(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == sqrtButton)
        {
            double temp = Math.sqrt(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == onebyButton)
        {
            double temp = 1/(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == logButton)
        {
            double temp = Math.log(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == cubertButton)
        {
            double temp = Math.cbrt(Double.parseDouble(textfield.getText()));
            
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == sqButton)
        {
            double temp = Double.parseDouble(textfield.getText());
            temp=temp*temp;
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == cubeButton)
        {
            double temp = Double.parseDouble(textfield.getText());
            temp=temp*temp*temp;
            textfield.setText("");
            textfield.setText(String.valueOf(temp));
        }

        if(e.getSource() == facButton)
        {
            double t = Double.parseDouble(textfield.getText());
            
            double fact=1;
            while(t!=0)
            {
                fact=t*fact;
                --t;
            }
            textfield.setText("");
            textfield.setText(String.valueOf(fact));
        }
    }
}