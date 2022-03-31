import Factory.ClothingFactory;
import Factory.EvenFactory;
import Items.Clothing;
import Modifiers.Dexterity;

public class Main {

    public static void main(String[] args) {
        ClothingFactory generator = new EvenFactory();
        Clothing clothing = generator.generate();
        System.out.println(clothing.getDescription());

        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);
        clothing = new Dexterity(clothing);

        System.out.println(clothing.getDescription());
    }
    
}
