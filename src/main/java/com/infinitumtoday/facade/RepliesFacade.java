/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade;

import com.infinitumtoday.dao.RepliesDAO;
import com.infinitumtoday.entity.Replies;
import com.infinitumtoday.util.AbstractFacade;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Repository("repliesFacade")
public class RepliesFacade extends AbstractFacade<Replies> implements RepliesDAO{

    public RepliesFacade() {
        super(Replies.class);
    }
    
}
