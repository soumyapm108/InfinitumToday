/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.entity;

import com.blobcity.db.CloudStorage;
import com.blobcity.db.annotations.Entity;
import com.blobcity.db.annotations.Primary;
import java.util.List;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Entity
public class CategoryBrowse extends CloudStorage{
    
    @Primary
    private String categoryName;
    private List<String> twitterIdList;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<String> getTwitterIdList() {
        return twitterIdList;
    }

    public void setTwitterIdList(List<String> twitterIdList) {
        this.twitterIdList = twitterIdList;
    }    
    
    
}
