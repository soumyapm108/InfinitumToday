/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade;

import com.infinitumtoday.dao.ReplyBrowseDAO;
import com.infinitumtoday.entity.Replies;
import com.infinitumtoday.entity.ReplyBrowse;
import com.infinitumtoday.util.AbstractFacade;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Repository("replyBrowseFacade")
public class ReplyBrowseFacade extends AbstractFacade<ReplyBrowse> implements ReplyBrowseDAO{

    public ReplyBrowseFacade() {
        super(ReplyBrowse.class);
    }
    
}
