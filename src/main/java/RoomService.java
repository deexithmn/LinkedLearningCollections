

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


@AllArgsConstructor
@Getter
@NoArgsConstructor
public class RoomService {
// Declare a collect
    Collection<Room> rooms = new ArrayList<>();



    public void createRoom(String name, String type, int capacity, double rate){
        Room tempRoom = new Room(name, type, capacity, rate);
        rooms.add(tempRoom);
    }

    public void createRooms(Room[] rooms){
        this.rooms.addAll(Arrays.asList(rooms));
    }

    public Collection<Room> applyDiscount(double discountRate){
        return this.rooms.stream().peek(v -> v.setRate(v.getRate() - (v.getRate()*discountRate))).collect(Collectors.toList());
    }

    public Collection<Room> getRoomsByCapacity(int capacity){
        return this.rooms.stream().filter(v -> v.getCapacity()>=capacity).collect(Collectors.toList());
    }

    public Collection<Room> getRoomByRateAndType(double rate, String type){
        return this.rooms.stream().filter(room ->
                (room.getRate()<=rate && room.getType().equals(type))
        ).collect(Collectors.toList());
    }



}
