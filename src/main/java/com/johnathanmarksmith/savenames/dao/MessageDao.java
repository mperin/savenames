package com.johnathanmarksmith.savenames.dao;


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


public interface MessageDao
{
    public List<Message> listMessages();

    public List<Message> searchMessages(String searchString);

    public void SaveOrUpdateMessage(Message message);

}