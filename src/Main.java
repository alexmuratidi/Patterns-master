import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Maze maze = new Maze();
            Player player = new Player(maze, 0);
            Room room0 = new Room(0);
            Room room1 = new Room(1, null, null, room0, null);
            Room room2 = new Room(2, null, null, null, room0);
            Room room3 = new Room(3, room0, null, null, null);
            Room room4 = new Room(4, null, room0, null, null);
            room0.setNorth(room1);
            room0.setEast(room2);
            room0.setSouth(room3);
            room0.setWest(room4);
            maze.addRoom(room0);
            maze.addRoom(room1);
            maze.addRoom(room2);
            maze.addRoom(room3);
            maze.addRoom(room4);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.println("What to do?");
                switch(in.next()){
                    case "GE": player.goEast();
                    case "OE": player.openEast();
                    //case "GN": player.goNorth();
                    //case "ON": player.openNorth();
                    case "GW": player.goWest();
                    case "OW": player.openWest();
                    //case "GS": player.goSouth();
                    //case "OS": player.openSouth();
                }
                player.printLocation();
            }
        }
}
