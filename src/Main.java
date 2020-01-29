

public class Main {
    public static void main (String [] args) {
        EaseOfUse ez = new EaseOfUse();
        CheckInput myobj = new CheckInput();
        Calculator calc = new Calculator();
        ez.print("Is the defender monotype or dual type");
        
        String attackType = myobj.getMessage("Enter the type of the attack", "Normal Fighting Flying Poison Ground Rock Bug Ghost Steel Fire Water Grass Electric Psychic Ice Dragon Dark Fairy");

        String type1=  myobj.getMessage("Enter the first type of the defender", "Normal Fighting Flying Poison Ground Rock Bug Ghost Steel Fire Water Grass Electric Psychic Ice Dragon Dark Fairy");
   
        String type2=  myobj.getMessage("Enter the second type of the defender", "Normal Fighting Flying Poison Ground Rock Bug Ghost Steel Fire Water Grass Electric Psychic Ice Dragon Dark Fairy");
        int num1 =calc.getIntFromType(type1), num2 =calc.getIntFromType(type2), num0 =calc.getIntFromType(attackType);
        double mod =calc.modifier(num0,num1, num2);
        ez.print("Your attack damage will be multiplied by:\n"+mod);
    }
}
