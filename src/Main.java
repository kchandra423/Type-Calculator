import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        EaseOfUse ez = new EaseOfUse();
        CheckInput myobj = new CheckInput();
        Calculator calc = new Calculator();
        Scanner kboard = new Scanner(System.in);
        boolean loopchecker=true;
      while(loopchecker) {
        String x= myobj.getMessage("Is the defender monotype or dualtype?", "Mono Monotype Dualtype dual");
        
        String attackType = myobj.getMessage("Enter the type of the attack", "Normal Fighting Flying Poison Ground Rock Bug Ghost Steel Fire Water Grass Electric Psychic Ice Dragon Dark Fairy");
        int num0 =calc.getIntFromType(attackType), num1,num2;
        
        if (x.equalsIgnoreCase("dual")||x.equalsIgnoreCase("dualtype")) {
        String type1=  myobj.getMessage("Enter the first type of the defender", "Normal Fighting Flying Poison Ground Rock Bug Ghost Steel Fire Water Grass Electric Psychic Ice Dragon Dark Fairy");
   
        String type2=  myobj.getMessage("Enter the second type of the defender", "Normal Fighting Flying Poison Ground Rock Bug Ghost Steel Fire Water Grass Electric Psychic Ice Dragon Dark Fairy");
         num1 =calc.getIntFromType(type1);
        		 num2 =calc.getIntFromType(type2);
}
else {
	String defendType = myobj.getMessage("What is the type of the defender", "Normal Fighting Flying Poison Ground Rock Bug Ghost Steel Fire Water Grass Electric Psychic Ice Dragon Dark Fairy");
 num1=calc.getIntFromType(defendType);
		  num2=-1;
	
}
double mod =calc.modifier(num0,num1, num2);
        ez.print("Your attack damage will be multiplied by:\n"+mod);
         ez.print("Do you want to quit the program");
        String z= kboard.next();
        if(z.equalsIgnoreCase("yes")) {
        	loopchecker=false;
        }
      }}
    
}
