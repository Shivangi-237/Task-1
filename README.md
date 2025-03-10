# FILE HANDLING UTILITY

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: SHIVANGI SHARMA

*INTERN ID*: CT08RVQ

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# This Java program demonstrates essential file-handling operations, including creating, writing, reading, and modifying a text file named **"ABCD.txt"**. It begins by checking whether the file already exists in the directory using the **File** class. If the file does not exist, it creates a new one and displays a success message. Otherwise, it acknowledges the file’s presence, preventing unnecessary duplication. The program then proceeds to write predefined content into the file using the **FileWriter** class. It writes three lines of text: *"this is my first task"*, *"and I love to code"*, and *"my hobby is to dance"*. The **write()** method ensures that the content is stored properly, and the file is closed to prevent data loss and free system resources. If any exceptions occur during the writing process, a corresponding error message is displayed.After writing, the program reads the file’s contents using the **Scanner** class. It iterates through each line using a **while** loop and prints the content to the console. Additionally, it retrieves and displays the file’s metadata, including its name and absolute path, using **getName()** and **getAbsolutePath()** methods. Interestingly, the program prints the file name using **System.err.println()**, which is typically used for error messages, though this does not impact functionality. Once the reading operation is complete, the program prepares to modify the file’s content by reading it into a **StringBuilder** using the **BufferedReader** class. This approach allows efficient text manipulation, as **StringBuilder** is mutable and prevents unnecessary object creation.For modification, the program attempts to replace the phrase *"i am shivangi sharma hi"* with *"java is so cool"* using the **replace()** method. However, since the original phrase does not exist in the file, no actual changes occur. This highlights a logical flaw in the program, as modifications are ineffective without verifying the presence of the target text beforehand. After attempting modification, the program writes the (potentially unchanged) content back into the file using **FileWriter**. Since it does not use append mode, the entire file is overwritten with the modified content, ensuring that any alterations are saved. Finally, the program prints *"File modified successfully!"*, even though no real modifications were made due to the missing target phrase.This program effectively demonstrates Java’s file-handling capabilities, including file creation, writing, reading, and modification. However, a few improvements could enhance its functionality. Before performing text replacement, the program should first check whether the target phrase exists to ensure meaningful modifications. Additionally, rather than overwriting the file completely, an **append mode** could be introduced to retain existing data while adding new content. Another minor improvement would be replacing **System.err.println()** with **System.out.println()** for non-error messages, ensuring better readability. Despite these minor flaws, the program provides a strong foundation for understanding Java’s file I/O operations. Its structured approach ensures that each step—from file creation to modification—is executed systematically while handling potential exceptions to prevent crashes.

OUTPUT

![Image](https://github.com/user-attachments/assets/d1130062-84aa-40a9-b18f-71ee6885254e)
