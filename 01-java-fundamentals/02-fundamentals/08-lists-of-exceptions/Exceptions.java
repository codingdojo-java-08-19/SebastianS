import java.util.ArrayList;

public class Exceptions {
    public void test() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Success! The element was cast as an Integer!");
            } catch (ClassCastException e) {
                System.out.println(e + " -> Error occured at index " + i + " and its value is " + myList.get(i));
            }

        }
    }
}