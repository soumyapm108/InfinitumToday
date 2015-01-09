/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade.test;

import com.infinitumtoday.dao.CategoriesDAO;
import com.infinitumtoday.dao.CategoryBrowseDAO;
import com.infinitumtoday.entity.Categories;
import com.infinitumtoday.entity.CategoryBrowse;
import java.util.ArrayList;
import java.util.List;
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
public class CategoryBrowseFacadeTest {

    @Autowired
    private CategoryBrowseDAO categoryBrowseFacade;

   

    @Test
    public void executeInsertCategoryBrowse()
    {
        CategoryBrowse categoryBrowse = new CategoryBrowse();
        categoryBrowse.setCategoryName("testName");
        List<String> ids=new ArrayList<>();
        ids.add("1");
        ids.add("2");
        categoryBrowse.setTwitterIdList(ids);
        boolean created =categoryBrowseFacade.create(categoryBrowse);
        Assert.assertTrue(created);
    }
}