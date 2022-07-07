import java.util.ArrayList;

public class resizeArray {
    public static void main(String[] args) {

        //declaring array list
        ArrayList<String> cars = new ArrayList<>();
        cars.add("VOLVO");
        cars.add("TATA");
        cars.add("HONDA");
        cars.add("MAHINDRA");

        System.out.println(cars);

        System.out.println(cars.get(0));
        System.out.println(cars.size());
    }
}
