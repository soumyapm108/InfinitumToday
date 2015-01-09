/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade;

import com.infinitumtoday.dao.CategoriesDAO;
import com.infinitumtoday.entity.Categories;
import com.infinitumtoday.util.AbstractFacade;
import javax.validation.ReportAsSingleViolation;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Repository("categoriesFacade")
public class CategoriesFacade extends AbstractFacade<Categories> implements CategoriesDAO{

    public CategoriesFacade() {
        super(Categories.class);
    }
    
}
