import Factory.*;
import Items.Clothing;

public class Main {

    public static void main(String[] args) throws Exception {
        ClothingFactory generator = new BossFactory();
        Clothing clothing = generator.generate();
        System.out.println(clothing.getDescription() + "\n");

        for (int i = 0; i < 10; i++){
            System.out.println(generator.generate().getDescription() + "\n");
        }
    }
    
}
