package com.johnathanmarksmith.savenames.service;

import com.johnathanmarksmith.savenames.model.Message;

import java.util.List;


/**
 * Date:   3/11/13 / 11:44 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 * This is the interface to the DAO for Message Database
 */


public interface MessageService
{
    public List<Message> listMessages();

    public List<Message> searchMessages(String searchString);


    public void SaveMessage(Message message);
}