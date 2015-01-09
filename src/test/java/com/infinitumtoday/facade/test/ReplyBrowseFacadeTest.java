/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade.test;

import com.infinitumtoday.dao.RepliesDAO;
import com.infinitumtoday.dao.ReplyBrowseDAO;
import com.infinitumtoday.entity.Replies;
import com.infinitumtoday.entity.ReplyBrowse;
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
public class ReplyBrowseFacadeTest {

    @Autowired
    private ReplyBrowseDAO replyBrowseFacade;

   

    @Test
    public void executeInsertReplyBrowse()
    {
        ReplyBrowse replyBrowse = new ReplyBrowse();
        replyBrowse.setTwitterId(RandomStringUtils.randomAlphabetic(10));
         List<String> ids=new ArrayList<>();
        ids.add("1");
        ids.add("2");
        replyBrowse.setReplyIdList(ids);
        boolean created =replyBrowseFacade.create(replyBrowse);
        Assert.assertTrue(created);
    }
}