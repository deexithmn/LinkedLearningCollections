import java.util.*;


public class Application {

    public static void main(String[] args) {

        Room room1 = new Room("Room1","Suite", 2, 500.0);
        Room room2 = new Room("Room2", "Queens", 10, 250);
        Room room3 = new Room("Room3", "Suite", 10, 150);
        Room room4 = new Room("Room4", "Queens", 10, 50);
        Room room5 = new Room("Room5", "Queens", 10, 25);
        List<Room> rooms  = Arrays.asList(room1, room2, room3, room4, room5 );

        System.out.println("========Adding all the rooms=========");
        rooms.forEach(v-> System.out.println(v.getName()));

        System.out.println("========After Sorting the rooms=========");
        rooms.stream().sorted(Room.RATE_COMPARATOR).forEach(v-> System.out.println(v.getName()));

        System.out.println(Collections.binarySearch(rooms, room1, Room.RATE_COMPARATOR));

        Collection<String> c = new ArrayList<>();
        c.add("Test");

        c.stream().map(String::toUpperCase).forEach(System.out::println);

        HashMap<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        entrySet.stream().forEach(set-> System.out.println(set.getKey() + "----" + set.getValue()));

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(15,84,78,99,1,-1,10));
        treeSet.stream().forEach(System.out::println);
        System.out.println(treeSet.subSet(60, 79));

        Deque<String> stack = new ArrayDeque<>();
        stack.push("Message 1");
        stack.push("Message 1");
        stack.push("Message 1");
        stack.push("Message 1");
        stack.forEach(System.out::println);
        stack.addFirst("first message");
        stack.addLast("last message");
        stack.forEach(System.out::println);
        stack.removeFirstOccurrence("Message 1");
        stack.forEach(System.out::println);

    }

    private static double revenue(Collection<Room> list){
        return list.stream()
                .mapToDouble(Room::getRate)
                .sum();
    }
}
