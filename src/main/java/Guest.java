/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Guest {
    String firstName;
    String lastName;
    boolean preferredCustomer;
    List<Room> preferredRooms;

    public Guest(String firstName, String lastName, boolean preferedCustomer){
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredCustomer = preferedCustomer;
        this.preferredRooms = new ArrayList<>();
    }

//    public Collection<Room> getPreferredRooms() {
//    }
}
