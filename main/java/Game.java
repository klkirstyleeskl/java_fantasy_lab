import interfaces.IDamagable;
import rooms.Room;

import java.util.ArrayList;

public class Game {
    String name;
    ArrayList<Room> rooms;
    ArrayList<IDamagable> characters;


    public Game(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.characters = new ArrayList<>();
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

    public void addRoom(Room room){
        this.rooms.add(room);
    }
    public void addCharacter(IDamagable character){
        this.characters.add(character);
    }

}


