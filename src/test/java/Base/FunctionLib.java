package Base;

/**
 * Created by RSen on 27/03/2017.
 */
        import java.io.File;
        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.nio.channels.FileChannel;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Random;

        import org.apache.commons.io.FileUtils;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import com.google.common.io.Files;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;


public class FunctionLib {
    public static WebDriver driver = null;


    //Function to create multiple local directories path
    public static void createDirectory(File path){
        try{
            // Create multiple directories
            boolean success = (path).mkdirs();
            if (success) {
                System.out.println("Directories: " + path + " created");
            }

        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    //Function to copy file from source to destination
    @SuppressWarnings("resource")
    public static void copyFile(File sourceFile, File destFile) throws IOException{
        if(!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
            //FileUtils.copyDirectory(sourceFile, destFile);
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(source != null) {
                source.close();
            }
            if(destination != null) {
                destination.close();
            }
        }

    }

}
