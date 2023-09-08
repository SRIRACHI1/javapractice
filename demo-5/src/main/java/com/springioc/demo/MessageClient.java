package com.springioc.demo;

public class MessageClient {
    private final MessageService messageService;

    public MessageClient(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}
