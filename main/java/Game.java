import interfaces.IDamagable;
import rooms.Room;

import java.util.ArrayList;

public class Game {
    String name;
    ArrayList<Room> rooms;
    ArrayList<IDamagable> characters;


    public Game(String name, ArrayList<Room> rooms, ArrayList<IDamagable> characters) {
        this.name = name;
        this.rooms = rooms;
        this.characters = characters;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<IDamagable> getCharacters() {
        return characters;
    }

}


