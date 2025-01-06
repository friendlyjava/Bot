package org.ilushass.bot.telergam;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bot extends TelegramWebhookBot {
    final TelegramProperties telegramProperties;
    public Bot(TelegramProperties telegramProperties){
        super(telegramProperties.getToken());
        this.telegramProperties = telegramProperties;
    }
    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return null;
    }

    @Override
    public String getBotPath() {
        return telegramProperties.getPath();
    }
    @Override
    public String getBotUsername() {
        return telegramProperties.getUsername();
    }
}
