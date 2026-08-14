import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Elephant");
        animals.addLast("Lion");
        animals.add(2, "Tiger");

        System.out.println("Initial List: " + animals);
        String first = animals.getFirst();
        String last = animals.getLast();
        String specific = animals.get(2);

        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        System.out.println("Element at index 2: " + specific);
        animals.set(1, "Puppy");
        System.out.println("After update: " + animals);

        System.out.println("List size: " + animals.size());
        System.out.println("Contains 'Cat'?: " + animals.contains("Cat"));
        animals.removeFirst();
        animals.removeLast();
        animals.remove(1);
        animals.remove("Cat");

        System.out.println("Final List after removals: " + animals);
        animals.clear();
        System.out.println("Is list empty?: " + animals.isEmpty());
    }
}

