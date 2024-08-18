/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GuestService {

    private List<Guest> checkinList = new ArrayList<>();
    public static Collection<Object> filterByFavoriteRoom(List<Guest> guestList, Room room) {
        return guestList.stream().filter(v -> v.getPreferredRooms().contains(room)).collect(Collectors.toList());
    }

    public List<Guest> getCheckInList() {
        return this.checkinList;
    }

    public void checkIn(Guest guest) {
        if (guest.isPreferredCustomer()) {
            for (Guest g : this.checkinList) {
                if (!g.isPreferredCustomer()) {
                    this.checkinList.add(this.checkinList.indexOf(g), guest);
                    break;
                }
            }
        } else {
            this.checkinList.add(this.checkinList.size(), guest);
        }
    }

    public void swapPosition(Guest guest1, Guest guest2) {
        Integer temp = checkinList.indexOf(guest1);
        checkinList.set(checkinList.indexOf(guest2), guest1);
        checkinList.set(temp, guest2);
    }
}
