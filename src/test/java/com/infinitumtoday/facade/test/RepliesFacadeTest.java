/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade.test;

import com.infinitumtoday.dao.CategoryBrowseDAO;
import com.infinitumtoday.dao.RepliesDAO;
import com.infinitumtoday.entity.CategoryBrowse;
import com.infinitumtoday.entity.Replies;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
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
public class RepliesFacadeTest {

    @Autowired
    private RepliesDAO repliesFacade;

   

    @Test
    public void executeInsertReplies()
    {
        Replies replies = new Replies();
        replies.setCreatedAt(0);
        replies.setReplyId(RandomStringUtils.random(10));
        replies.setText("test text");
        replies.setTwitterId(RandomStringUtils.random(10));
        replies.setUserId(RandomStringUtils.random(10));
        boolean created =repliesFacade.create(replies);
        Assert.assertTrue(created);
    }
}