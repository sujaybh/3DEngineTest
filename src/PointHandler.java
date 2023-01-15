import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class PointHandler {
    //Point3D point = new Point();
    ArrayList<Point3D> pointArray = new ArrayList<Point3D>() {};

    public PointHandler() {
        //point = new Point3D(x, y);
    }

    public void populatePoints(Point3D p) {
        pointArray.add(p);
        ArrayList<String> rawStringPoints = readVectors();
        ArrayList<String> actualPointString = new ArrayList<String>() {};
        ArrayList<String> vectorPointStrings = new ArrayList<String>() {};

        for(int i = 0; i < rawStringPoints.size(); i++) {
            String[] temp = rawStringPoints.get(i).split("|");
            actualPointString.add(temp[0]);
            vectorPointStrings.add(Arrays.asList(temp[1].split(".")));
        }

    }

    public ArrayList<String> readVectors() {
        fileReader fl = new  fileReader();
        return fl.readTextFile("pointvect.txt");

    }




    public ArrayList<Point3D> splitVectors() {

    }





}
