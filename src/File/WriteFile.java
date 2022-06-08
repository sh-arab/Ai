package File;

import Models.ChatBatData;
import Models.Questien;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void write() throws IOException {

        //Instantiating the CSVWriter class
        CSVWriter writer = new CSVWriter(new FileWriter("data.csv"));

        for (Questien questien:ChatBatData.questiens)
            writer.writeNext(questien.write());


        //Flushing data from writer to file
        writer.flush();
    }
}
