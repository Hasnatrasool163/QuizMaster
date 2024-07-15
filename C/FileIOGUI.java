package C;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class FileIOGUI extends AbstractConceptsGUI {

    public FileIOGUI() {
        super("File I/O in C");
    }

    @Override
    protected String getTheoryText() {
        return """
               File Input/Output (I/O) in C allows programs to read from and write to files.
               
               Key Concepts:
               1. fopen(), fclose(), fread(), fwrite() functions
               2. File Modes: r, w, a, r+, w+, a+
               3. Error Handling with feof(), ferror() functions
               4. Sequential vs. Random Access
               
               Example of File Handling:
               FILE *fp;
               fp = fopen("file.txt", "w");
               if (fp != NULL) {
                   fprintf(fp, "Hello, World!");
                   fclose(fp);
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <stdio.h>

               int main() {
                   FILE *fp;
                   fp = fopen("file.txt", "w");
                   if (fp != NULL) {
                       fprintf(fp, "Hello, World!");
                       fclose(fp);
                   }
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("File I/O in C allows programs to read from and write to files.", true);
        addQuizQuestion("The 'r+' mode in fopen() function allows both reading and writing to an existing file.", true);
        addQuizQuestion("feof() function in C checks if the end-of-file indicator is set.", true);
        addQuizQuestion("ferror() function in C checks if the file pointer is at the end of the file.", false);
        addQuizQuestion("File handling in C++ involves using open(), close(), read(), and write() functions.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FileIOGUI frame = new FileIOGUI();
            frame.setVisible(true);
        });
    }
}
