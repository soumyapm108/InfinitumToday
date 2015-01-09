/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade.test;

import com.infinitumtoday.dao.CategoriesDAO;
import com.infinitumtoday.entity.Categories;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "dev")
@ContextConfiguration(locations = {"classpath:inifitum-facade-context.xml"})
public class CategoriesFacadeTest {

    @Autowired
    private CategoriesDAO categoriesFacade;

   

    @Test
    public void executeInsertCategories()
    {
        Categories categories  = new Categories();
        categories.setCategoryName("testName");
        categories.setPhotoIcon("testIcon");
        boolean created =categoriesFacade.create(categories);
        Assert.assertTrue(created);
    }
}
   

