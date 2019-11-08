import java.io.File;

public class R02_XP00_J {

    public static void deleteFile() {
        File someFile = new File("deleteFile.txt");
        boolean deleted = someFile.delete();
        
        if (!deleted) {
            System.out.println("inputStream.txt failed to delete");
        }
    }
    
    public static void main(String[] args) {
        deleteFile();
    }

}
