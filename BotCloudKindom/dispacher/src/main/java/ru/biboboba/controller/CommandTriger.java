package ru.biboboba.controller;


import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.biboboba.utils.MessageUtils;

@Component
@Log4j
public class CommandTriger {



    private MessageUtils messageUtils;
    private UpdateController updateController;

    public CommandTriger(MessageUtils messageUtils) {
        this.messageUtils = messageUtils;
    }

    public void Triger(Update update){
        var message = update.getMessage();
    }


}
