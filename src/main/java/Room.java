import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
public class Room implements Comparable<Room> {

    public static Comparator<Room> RATE_COMPARATOR = Comparator.comparing(Room::getRate)
                                                            .thenComparing(Room::getName)
            .thenComparing(Room::getCapacity);

    private String name;

    private String type;

    private int capacity;

    private double rate;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Room o1) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
