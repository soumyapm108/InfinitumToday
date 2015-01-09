/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade;

import com.infinitumtoday.dao.TwitterDAO;
import com.infinitumtoday.entity.Twitter;
import com.infinitumtoday.util.AbstractFacade;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Repository("twitterFacade")
public class TwitterFacade extends AbstractFacade<Twitter> implements TwitterDAO{

    public TwitterFacade() {
        super(Twitter.class);
    }
    
}
