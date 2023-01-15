import java.util.ArrayList;

public class Point3D {

    //CURRENT OUTLOOK ON HOW POINTS WILL WORK:
    /*
        basically the point will simply be a struct pretty much of 3 values, as well
        as the relative locations of the other points that it has a vector extending to.
     */
    float x;
    float y;
    float z;

    public ArrayList<Integer> pointerList;


    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void addPointer(int point) {
        pointerList.add(point);
    }


}
