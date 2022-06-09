package UI;

import File.WriteFile;
import Models.ChatBatData;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;

public class Bot extends TelegramLongPollingBot {

    String lastAnswer=null;
    ChatBatData chatBatData;

    public Bot(ChatBatData chatBatData) {
        this.chatBatData=chatBatData;

    }

    @Override
    public String getBotUsername() {
        return "ProjectHosh_Bot";
    }

    @Override
    public String getBotToken() {
        return "5377602285:AAHhoOd77c3Kloo_jtQ8GnXhQ5qA6N78g78";
    }

    @Override
    public void onUpdateReceived(Update update) {

        String question=update.getMessage().getText();
        SendMessage sendMessage = new SendMessage();

        if (lastAnswer!=null && !lastAnswer.equals("میشه یه بار دیگه سوالتو بپرسی متوجه نشدم"))
            chatBatData.addQuestien(lastAnswer, new String[]{question});
        String answer=chatBatData.getAnswer(question);
        if (!answer.equals("میشه یه بار دیگه سوالتو بپرسی متوجه نشدم"))
            chatBatData.addQuestien(question, new String[]{answer});
        lastAnswer=answer;
        sendMessage.setText(answer);


        sendMessage.setChatId(String.valueOf(update.getMessage().getChatId()));

        try {
            execute(sendMessage);
            WriteFile.write();
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }

    }
}
