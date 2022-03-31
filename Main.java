import Factory.ClothingFactory;
import Factory.EvenFactory;

public class Main {

    public static void main(String[] args) {
        ClothingFactory generator = new EvenFactory();
        System.out.println(generator.generate().getDescription());
    }
    
}
