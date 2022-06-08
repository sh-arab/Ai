import File.ReadFile;
import File.WriteFile;
import Models.ChatBatData;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static ChatBatData chatBatData= new ChatBatData();


    public static void main(String[] args) {
        try {
            ReadFile.read(chatBatData);
            WriteFile.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
