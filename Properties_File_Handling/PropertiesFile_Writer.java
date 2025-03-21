package Properties_File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile_Writer {
    public static final String path = "file:///home/workspace/Test/src/Properties_File_Handling/Employee.properties";
	public static void main(String[] args) throws IOException {

        Properties propertyObject = new Properties();
        
        
        propertyObject.setProperty("2001", "Surendhar");
        propertyObject.setProperty("2002", "Sathish");
        propertyObject.setProperty("2003", "Gnanaguru");
        propertyObject.setProperty("2004", "Sakthi Venkatesh");
        propertyObject.setProperty("2005", "Paris Jayaraj");

        File file = new File(path);

        FileOutputStream outputStream = new FileOutputStream(file);
        propertyObject.store(outputStream, "My Properties File");
        System.out.println("Succussfully Writed.....");
    }
}