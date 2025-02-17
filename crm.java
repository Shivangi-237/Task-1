import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IO;
import java.io.IOException;
import java.util.Scanner;
public class createFile{
    public static void main(String[] args) {
        //create
        try{
        File Obj =  new File("abc.txt");
        if(Obj.createNewFile()){
            System.out.println("file created successfully" +   Obj.getName());
        }
        else{
            System.out.println("File already exist");
        }
    }
       catch(IOException e){
            System.out.println("error occured" + e.getMessage());
       }


       //write
       try {
        FileWriter Obj1 = new FileWriter("abc.txt");
        Obj1.write("hi this my first program hey hello\n");
        Obj1.write( "B.Tech \n");
        Obj1.write("Graphic Era University");
        Obj1.close();
        
       } catch (IOException e) {
        System.out.println("error");
       }

       //read
       try{
        File obj = new File("abc.txt");
        Scanner Read = new Scanner(obj);
        while(Read.hasNextLine()){
            String data = Read.nextLine();
            System.out.println(data);
        }
        Read.close();
       }
        catch (IOException e) {
          System.out.println("error" + e.getMessage());
       }
       




        File file = new File("abc.txt");
        StringBuilder content = new StringBuilder();

        // Step 1: Read the file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n"); // Store file content
            }
        } catch (IOException e) {
             System.out.println("error");
        }

        // Step 2: Modify the content
        String modifiedContent = content.toString().replace("program", "shivangi");

        // Step 3: Write back to the file
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(modifiedContent);
        }
         catch (IOException e) {
            System.out.println("error");
        }

        System.out.println("File modified successfully!");
    }
}
