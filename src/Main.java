import javax.swing.JOptionPane;

public class Main {
    public static Number a;
    public static Number b;
    public static enum num_type {
        INTEIRO, DOUBLE
    };
    public static num_type a_numtype;
    public static num_type b_numtype;


    public static void main(String[] args) {

        JOptionPane input = new JOptionPane();


        System.out.println("Bem-vindo à CALCULADORA!");
        JOptionPane.showMessageDialog(null, "Bem-vindo à calculadora!");
        String oper = JOptionPane.showInputDialog("Escolha a operação: +,-,*,/.");
        Calculadora calc = new Calculadora();


        switch (oper)
        {
            case "+":
                getNumber(1);
                getNumber(2);
                if(a_numtype == num_type.INTEIRO){
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "+" + b + " é: " + calc.soma(a.intValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "+" + b + " é: " + calc.soma(a.intValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }

                }
                else if(a_numtype == num_type.DOUBLE)
                {
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "+" + b + " é: " + calc.soma(a.doubleValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "+" + b + " é: " + calc.soma(a.doubleValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Erro!");
                }
                break;



            case "-":
                getNumber(1);
                getNumber(2);
                if(a_numtype == num_type.INTEIRO){
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "-" + b + " é: " + calc.subtrai(a.intValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "-" + b + " é: " + calc.subtrai(a.intValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }

                }
                else if(a_numtype == num_type.DOUBLE)
                {
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "-" + b + " é: " + calc.subtrai(a.doubleValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "-" + b + " é: " + calc.subtrai(a.doubleValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Erro!");
                }
                break;

            case "*":
                getNumber(1);
                getNumber(2);
                if(a_numtype == num_type.INTEIRO){
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "*" + b + " é: " + calc.multiplica(a.intValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "*" + b + " é: " + calc.multiplica(a.intValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }

                }
                else if(a_numtype == num_type.DOUBLE)
                {
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "*" + b + " é: " + calc.multiplica(a.doubleValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "*" + b + " é: " + calc.multiplica(a.doubleValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Erro!");
                }
                break;

            case "/":
                getNumber(1);
                getNumber(2);
                if(a_numtype == num_type.INTEIRO){
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "/" + b + " é: " + calc.divide(a.intValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "/" + b + " é: " + calc.divide(a.intValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }

                }
                else if(a_numtype == num_type.DOUBLE)
                {
                    if(b_numtype == num_type.INTEIRO)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "/" + b + " é: " + calc.divide(a.doubleValue(), b.intValue()));
                    }
                    else if(b_numtype == num_type.DOUBLE)
                    {
                        JOptionPane.showMessageDialog(null, "O resultado da operação " + a + "/" + b + " é: " + calc.divide(a.doubleValue(), b.doubleValue()));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Erro!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Erro!");
                }
                break;

        }

        System.out.println("Fim execução!");


    }

    public static void getNumber(int num)
    {
        if(num == 1) {
            String num_1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            try {
                a_numtype = num_type.INTEIRO;
                a = Integer.parseInt(num_1);
            }
            catch(NumberFormatException e)
            {
                try{
                    a_numtype = num_type.DOUBLE;
                    a = Double.parseDouble(num_1);
                }
                catch(NumberFormatException ee)
                {
                    getNumber(1);
                }
            }
        }
        if(num == 2)
        {
            String num_2 = JOptionPane.showInputDialog("Digite o segundo número:");
            try {
                b_numtype = num_type.INTEIRO;
                b = Integer.parseInt(num_2);
            }
            catch(NumberFormatException e)
            {
                try{
                    b_numtype = num_type.DOUBLE;
                    b = Double.parseDouble(num_2);
                }
                catch(NumberFormatException ee)
                {
                    getNumber(2);
                }
            }
        }
    }


}
