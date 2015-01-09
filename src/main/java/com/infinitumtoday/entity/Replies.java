/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.entity;

import com.blobcity.db.CloudStorage;
import com.blobcity.db.annotations.Entity;
import com.blobcity.db.annotations.Primary;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Entity
public class Replies extends CloudStorage{
    @Primary
    private String replyId;
    private String twitterId;
    private String userId;
    private String text;
    private long  createdAt;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
    
    
}
