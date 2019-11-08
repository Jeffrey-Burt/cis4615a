
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class R13_FIO03_J {
    
  public static void main(String[] args) {
    Path tempFile = null;
    try {
      tempFile = Files.createTempFile("tempnam", ".tmp");
      try (BufferedWriter writer =
          Files.newBufferedWriter(tempFile, Charset.forName("UTF8"),
                                  StandardOpenOption.DELETE_ON_CLOSE)) {
      }
      System.out.println("Temporary file write done, file erased to ensure of no memory leaks.");
    } catch (FileAlreadyExistsException x) {
      System.err.println("File exists: " + tempFile);
    } catch (IOException x) {
      System.err.println("Error creating temporary file: " + x);
    }
  }
}