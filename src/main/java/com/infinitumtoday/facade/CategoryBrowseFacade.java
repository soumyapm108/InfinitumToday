/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade;

import com.infinitumtoday.dao.CategoryBrowseDAO;
import com.infinitumtoday.entity.CategoryBrowse;
import com.infinitumtoday.util.AbstractFacade;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Repository("categoryBrowseFacade")
public class CategoryBrowseFacade extends AbstractFacade<CategoryBrowse> implements CategoryBrowseDAO{

    public CategoryBrowseFacade() {
        super(CategoryBrowse.class);
    }
    
}
