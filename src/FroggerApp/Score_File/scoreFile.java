package FroggerApp.Score_File;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * ScoreFile class
 */
public class scoreFile {

    /**
     * sortFile method to sort the scores in text file in descending order
     * @param point Point after user end game
     * @return linesRd - New ArrayList after sorted and remove duplicates
     */
    public static ArrayList sortFile(int point) throws IOException {

        File file = new File ("src/FroggerApp/Score_File/scoreOutput.txt");
        BufferedWriter writer = null;
        ArrayList<Integer> lines = new ArrayList<Integer>();
        ArrayList<Integer> linesRd = new ArrayList<Integer>();

        if(file.createNewFile()){
            System.out.println("File has been created");
            BufferedWriter writeNewFile = new BufferedWriter(new FileWriter(file));
            for (int i=1; i<=5; i++) {
                writeNewFile.write(i + "0");
                writeNewFile.newLine();
            }
            writeNewFile.close();
        }

        try {
            Scanner scanner = new Scanner(file);

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

            writer = new BufferedWriter(new FileWriter(file));

            for (int line : linesRd) {
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
