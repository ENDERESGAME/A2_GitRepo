import java.io.*;
import java.util.Scanner;
public class FileLoader {
    
 public static void main(String[] args) {
    FileLoader.loadMap("MapFile.txt");
}


//It loads a map from map file txt, accepts integers from the file and
// passes the integer value to the map constructor.
     public static Map loadMap(String MapFile){
        int Bottle =0;
        int Bottle1= 0;
        Map Object = new Map(0,0);
       
        try {
        
            Scanner scan = new Scanner(new File(MapFile));
            FileReader fr = new FileReader(MapFile);
            while(scan.hasNextLine()){
              if (scan.hasNextInt()){
                  Bottle = scan.nextInt();
                  Bottle1 = scan.nextInt();

                }
                Object = new Map(Bottle,Bottle1);
            }
            fr.close();
        }
         
        catch (Exception e){
            System.out.println("Sorry Nothing Found");
            System.out.println(e.toString());
            e.printStackTrace(); 
        } 
       
          return Object;
    }
    
}



