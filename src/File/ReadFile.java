package File;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void read() throws IOException {
        //Instantiating the CSVReader class
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        //Reading the contents of the csv file
        StringBuffer buffer = new StringBuffer();
        String line[];
        while ((line = reader.readNext()) != null) {
            for(int i = 0; i<line.length; i++) {
                System.out.print(line[i]+" ");
            }
            System.out.println(" ");
        }
    }
}
