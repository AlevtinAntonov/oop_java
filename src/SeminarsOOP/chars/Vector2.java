package SeminarsOOP.chars;

public class Vector2 {
    int x,y;

    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vector2{" +
               "x=" + x +
               ", y=" + y +
               '}';
    }

    public boolean isEquals(Vector2 opposit){
        if (opposit.y == y && opposit.x == x) return true;
        else return false;
    }
}
