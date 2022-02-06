import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Bible {
    public static void main(String [] args) {
        /* To do:
            if(line.charAt(1) != ':') {
                File.write(line.concat("1:"))
            }

            Then also a Python bs.(http://sacredbible.org/studybible/NT-04_John.htm)
        */ 
        
        System.out.println("Choose a language: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        input = "E";
        System.out.println();

        HashMap<Integer, String> bibEngMap = new HashMap<Integer, String>();
        ArrayList<Integer> bibkeys = new ArrayList<Integer>();

        

        //Enter English Main
        if(input == "E") {
            try{
                in = new BufferedReader(new FileReader("BibleText.txt"));
                line = in.readLine();
                
                int iterate = 1;

                //
                while(line != null && Character.isDigit(line.charAt(0))) {
                    
                    bibEngMap.put(iterate, line);
                    bibkeys.add(iterate);
                    System.out.println(iterate + " + " + line);
                    iterate++;
                    line = in.readLine();

                }

                System.out.println("Choose a random number from 1-10.");



            }
            catch(Exception e) {
                System.out.println("English Translation is unavailable");
            }
            

            System.out.println();
            System.out.println();


        }
    }

    public static ArrayList<Integer,String> getEnglishTranslation() {
        
        BufferedReader in = new BufferedReader(new FileReader("BibleText.txt"));
        String line = in.readLine();

        HashMap<Integer, String> bibEngMap = new HashMap<Integer, String>();

        int iterate = 1;

        //
        while(line != null) {

            if(Character.isDigit(line.charAt(0))) {
                bibEngMap.put(iterate, line);
                iterate++;
                line = in.readLine();
            }
            else if(Character.isUpperCase(line.charAt(0))) {
                
            }
            
            

        }
    }
}
