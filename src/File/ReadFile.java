package File;

import Models.ChatBatData;
import com.opencsv.CSVReader;
import com.sun.tools.javac.Main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {

    public static void read(ChatBatData chatBatData) throws IOException {

        //Instantiating the CSVReader class
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        //Reading the contents of the csv file
        StringBuffer buffer = new StringBuffer();
        String line[];
        while ((line = reader.readNext()) != null) {
            chatBatData.addQuestien(line[0],line);
        }
    }
}
