package genericsenum;

public class _02_Enum {
    public static void main(String[] args) {
        System.out.println(Direction.EAST);
        System.out.println(Direction2.EAST.name());
        System.out.println(Direction2.EAST.ordinal());

        System.out.println(Direction3.EAST.name()); //EAST 
        System.out.println(Direction3.EAST.ordinal()); //1
        System.out.println(Direction3.EAST.getValue()); //20

        System.out.println(Direction4.EAST.name()); //EAST 
        System.out.println(Direction4.EAST.ordinal()); //1
        System.out.println(Direction4.EAST.getValue()); //20
        System.out.println(Direction4.EAST.getSymbol()); //>
    }   
}

class Direction {
    final static int NORTH = 0;
    final static int EAST = 1;
    final static int SOUTH = 2;
    final static int WEST = 3;
}
enum Direction2 {
    NORTH, EAST, SOUTH, WEST;
}

enum Direction3 {
    NORTH(10), EAST(20), SOUTH(30), WEST(40);
    private final int value;
    Direction3(int value){
        this.value=value;
    }
    public int getValue(){return value;}
}

enum Direction4 {
    NORTH(10,"^"), EAST(20,">"), SOUTH(30,"<"), WEST(40,"v");
    private final int value;
    private final String symbol;
    Direction4(int value, String symbol){
        this.value=value;
        this.symbol=symbol;
    }
    public int getValue(){return value;}
    public String getSymbol(){return symbol;}
}