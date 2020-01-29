import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        EaseOfUse ez = new EaseOfUse();
        Calculator calc = new Calculator();
Scanner kboard = new Scanner(System.in);
        ez.print("Enter the type of the attack");
        String attackType= kboard.next();
ez.print("Enter your first type of the defending pokemon");
        String type1= kboard.next();
        ez.print("Enter your second type of the defending pokemon");
        String type2= kboard.next();
        int num1 =calc.getIntFromType(type1), num2 =calc.getIntFromType(type2), num0 =calc.getIntFromType(attackType);
        double mod =calc.modifier(num0,num1, num2);
        ez.print("Your attack damage will be multiplied by this much\n"+mod);
    }
}
//hhh