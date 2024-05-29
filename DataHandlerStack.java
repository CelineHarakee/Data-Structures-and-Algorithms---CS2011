// 2
//  The purpose of this program is to demonstrate the use of a stack in handling text files.

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;


public class DataHandlerStack {

    public String DataHandler (String fileName) throws FileNotFoundException {
            String originalData = "";
            String reversedData = "";

            Stack<String> stack = new Stack<String>();

            File myFile = new File(fileName);

            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()){
                String line = myScanner.nextLine();
                stack.push(line);
                originalData += line + "\n";
            }
        
            myScanner.close();

            while (!stack.isEmpty()){
                reversedData += stack.pop() + "\n";
            }

            return "Original data: \n" + originalData + "Reversed data: " + reversedData;
        }
    
        public static void main(String[] args) {
            
        DataHandlerStack dh = new DataHandlerStack();
        
        try{
            String data = dh.DataHandler("text.txt");
            System.out.println(data);
        }

        catch(FileNotFoundException e){
            System.out.println("An error occured, file was not found");
        }
    }
}