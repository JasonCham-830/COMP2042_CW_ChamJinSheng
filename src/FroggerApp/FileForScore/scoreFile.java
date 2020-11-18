package FroggerApp.FileForScore;

import javafx.scene.control.Label;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class scoreFile {


    public static ArrayList sortFile(int point) {

        BufferedReader reader = null;
        BufferedWriter writer = null;
        ArrayList<Integer> lines = new ArrayList<Integer>();
        ArrayList<Integer> linesRd = new ArrayList<Integer>();

        try {
            Scanner scanner = new Scanner(new File("src/FroggerApp/FileForScore/scoreOutput.txt"));
            System.out.println(point);

            while(scanner.hasNextInt()){
                lines.add(scanner.nextInt());
            }
            lines.add(point);

            Collections.sort(lines, Collections.reverseOrder());

            //remove duplicate by gving to another arraylist
            for(int data : lines){
                if (!linesRd.contains(data)){
                    linesRd.add(data);
                }
            }

            writer = new BufferedWriter(new FileWriter("src/FroggerApp/FileForScore/scoreOutput.txt"));

            for (int line : linesRd) {
                System.out.println(line);
                writer.write(Integer.toString(line));
                writer.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try
            {
                if (reader != null)
                {
                    reader.close();
                }

                if(writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        return linesRd;
        }


}
