import Factory.ClothingFactory;
import Factory.EvenFactory;
import Items.Clothing;
import Modifiers.Dexterity;

public class Main {

    public static void main(String[] args) throws Exception {
        ClothingFactory generator = new EvenFactory();
        Clothing clothing = generator.generate();
        System.out.println(clothing.getDescription() + "\n");

        clothing = new Dexterity(clothing);
        System.out.println(clothing.getDescription() + "\n");
    }
    
}
