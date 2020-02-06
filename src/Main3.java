import java.util.ArrayList;
import java.util.List;

public class Main3 {

    // что-то явно пошло не так, не могу понять - что (((((
    public static void main(String[] args) {
        int result;

        Box box1 = new Box();
        box1.addFruitToBox(new Apple());
        box1.addFruitToBox(new Apple());
        box1.addFruitToBox(new Apple());

        Box box2 = new Box();
        box2.addFruitToBox(new Orange());
        box2.addFruitToBox(new Orange());
        box2.addFruitToBox(new Orange());

        box1.getWeight();
        box2.getWeight();
    }
}

class Box <T>{
    List <T> capacity;

    public Box (){
        capacity = new ArrayList<T>();
    }

    public void addFruitToBox (T fruit) {
        capacity.add(fruit);
    }

    public <T> void getWeight() {
        System.out.println(capacity.<Apple>size()*1f);
        System.out.println(capacity.<Orange>size()*1.5f);
    }

}

abstract class Fruit {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}
