import Items.Armour;
import Items.Clothing;
import Rarities.Common;

public class Main {

    public static void main(String[] args) {
        Clothing clothing = new Armour();
        clothing = new Common(clothing);

        System.out.println(clothing.getDescription());
    }
    
}
