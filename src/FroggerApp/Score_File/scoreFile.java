package FroggerApp.Score_File;

import java.io.*;
import java.util.ArrayList;
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

        int counter = 0;
        File file = new File ("src/FroggerApp/Score_File/scoreOutput.txt");
        BufferedWriter writer = null;
        ArrayList<Integer> lines = new ArrayList<Integer>();
        ArrayList<Integer> linesRd = new ArrayList<Integer>();

        if(file.createNewFile()){
            System.out.println("New File created.");
        }

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextInt()){
                lines.add(scanner.nextInt());
                counter++;
            }
            if(counter<6){
                for(int i=0;i<(6-counter);i++)
                lines.add(0);
            }
            lines.add(point);

            Collections.sort(lines, Collections.reverseOrder());

            for(int data : lines) {
                linesRd.add(data);
            }
            //remove duplicate by gving to another arraylist
//                if (!linesRd.contains(data)) {
//                    linesRd.add(data);
//                }
            if(linesRd.size()>6){
                linesRd.remove(6);
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
