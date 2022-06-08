import File.ReadFile;
import File.WriteFile;

import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        try {
            ReadFile.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// ...