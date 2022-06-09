import File.ReadFile;
import File.WriteFile;
import Models.ChatBatData;
import UI.Bot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static ChatBatData chatBatData= new ChatBatData();


    public static void main(String[] args) {

        try {
            ReadFile.read(chatBatData);
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Bot(chatBatData));
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }

    }
}
