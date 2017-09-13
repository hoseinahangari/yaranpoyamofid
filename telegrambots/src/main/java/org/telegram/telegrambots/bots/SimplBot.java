package org.telegram.telegrambots.bots;


import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class SimplBot extends TelegramLongPollingBot{
    public void onUpdateReceived(Update update) {
        SendMessage sm = new SendMessage();
        sm.setChatId( update.getMessage().getChatId() );
        sm.setText( update.getMessage().getText() );
        try {
            sendMessage( sm );
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "yaranpoyamofid_bot";
    }

    public String getBotToken() {
        return "423708409:AAHD1sfmbG4PDSoFro92hqgIFoeIIyBfI2w";
    }
}
