package ObjectOriented;

public class CharacterClass {
    public static void main(String[] args) {
    	Character c=new Character('5');
    	System.out.println(Character.isUpperCase(c));
    	System.out.println(Character.isLowerCase(c));
    	
    	System.out.println(Character.toUpperCase(c));
    	System.out.println(Character.toLowerCase(c));
    	
    	System.out.println(Character.isLetter(c));
    	System.out.println(Character.isDigit(c));
    	
    	
    
    }
}
