package File;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void write() throws IOException {

        //Instantiating the CSVWriter class
        CSVWriter writer = new CSVWriter(new FileWriter("data.csv"));

        //Writing data to a csv file
        String line1[] = {"hi", "hello"};
        String line2[] = {"1", "Krishna"};
        String line3[] = {"2", "Vishnu"};
        String line4[] = {"3", "Raja"};

        //Writing data to the csv file
        writer.writeNext(line1);
        writer.writeNext(line2);
        writer.writeNext(line3);
        writer.writeNext(line4);

        //Flushing data from writer to file
        writer.flush();
        System.out.println("Data entered");
    }
}
