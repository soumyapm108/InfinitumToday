/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.entity;

import com.blobcity.db.CloudStorage;
import com.blobcity.db.annotations.Primary;
import java.util.List;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
public class ReplyBrowse extends CloudStorage{
 
    @Primary
    private String twitterId;
    private List<String> replyIdList;

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public List<String> getReplyIdList() {
        return replyIdList;
    }

    public void setReplyIdList(List<String> replyIdList) {
        this.replyIdList = replyIdList;
    }

    
}
