import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class fileReader {
    public ArrayList<String> readTextFile(String txt) {
        try {
            File myObj = new File(txt);
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> ar = new ArrayList<String>() {};

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ar.add(data);
            }
            myReader.close();
            return ar;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }
}

