package Collection_Evaluation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
public static final String PATH = "///home/workspace/Test/src/Collection_Evaluation/Students.csv";
public static final String COPY_PATH1 = "///home/workspace/Test/src/Collection_Evaluation/Copy.txt";
// public static final String COPY_PATH2 = "///home/workspace/Test/src/Collection_Evaluation/Copy2.txt";
// public static final String COPY_PATH3 = "///home/workspace/Test/src/Collection_Evaluation/Copy3.txt";
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(PATH);
        FileWriter writer = new FileWriter(COPY_PATH1);
        int read = 0;
        while ((read = reader.read()) != -1) {
            writer.write(read);
        }
        reader.close();
        writer.close();
    }
}