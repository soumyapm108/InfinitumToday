/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade.test;

import com.blobcity.db.CloudStorage;
import com.blobcity.db.config.Credentials;
import com.infinitumtoday.dao.CategoriesDAO;
import com.infinitumtoday.entity.Categories;
import java.util.List;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
public class TestInsert {
    
    public static void main(String[] args) {
        
        Credentials.init("db3.blobcity.com", "infinitum", "today", "infinitum-today");
        
        Categories categories  = new Categories();
        categories.setCategoryName("testName");
        categories.setPhotoIcon("testIcon");
        if(categories.insert());
        {
            System.out.println("created");
        }
        
        
    }
}

