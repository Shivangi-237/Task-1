import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Class demonstrating file operations
class CreateFile {
    public static void main(String[] args) {
        // Creating a file
        try {
            File f = new File("ABCD.txt");
            if (f.createNewFile()) {
                System.out.println("FILE CREATED SUCCESSFULLY");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Writing to the file
        try {
            FileWriter write = new FileWriter("ABCD.txt");
            write.write("this is my first task\n" + "and i love to code\n");
            write.write("my hobby is to dance");
            write.close();
        } catch (IOException e) {
            System.out.println("Exception occurred while writing");
        }

        // Reading from the file
        try {
            File obj = new File("ABCD.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
            }
            System.err.println("My file name is " + obj.getName());
            System.out.println("My file path is " + obj.getAbsolutePath());
            read.close();
        } catch (Exception e) {
            System.out.println("Exception occurred while reading");
        }

        // Reading file content into a StringBuilder for modification

        File file = new File("ABCD.txt");
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Exception occurred while reading for modification: " + e.getMessage());
        }

        // Modifying file content 
        String modifiedContent = content.toString().replace("i am shivangi sharma hi", "java is so cool");

        // Writing the modified content back to the file
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(modifiedContent);
        } catch (IOException e) {
            System.out.println("Exception occurred while modifying the file");
        }
        System.out.println("File modified successfully!");
    }
}
