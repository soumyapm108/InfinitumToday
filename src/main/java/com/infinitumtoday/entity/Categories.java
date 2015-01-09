/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
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
public class Categories extends CloudStorage{
    
    @Primary
    private String categoryName;
    private String photoIcon;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }    

    public String getPhotoIcon() {
        return photoIcon;
    }

    public void setPhotoIcon(String photoIcon) {
        this.photoIcon = photoIcon;
    }            
}
