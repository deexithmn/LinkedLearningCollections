/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class BookingService {

    private Map<Room, Guest> bookings = new HashMap<>();

    public boolean book(Room room, Guest guest) {
        if (Objects.isNull(this.bookings.get(room))) {
            this.bookings.put(room, guest);
            return true;
        }
        return false;
    }

    public double totalRevenue() {
        Set<Map.Entry<Room, Guest>> entrySet = this.bookings.entrySet();
        return entrySet.stream().mapToDouble(booking -> booking.getKey().getRate()).sum();
    }
}
