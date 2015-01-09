/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade.test;

import com.infinitumtoday.dao.ReplyBrowseDAO;
import com.infinitumtoday.dao.TwitterDAO;
import com.infinitumtoday.entity.ReplyBrowse;
import com.infinitumtoday.entity.Twitter;
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
public class TwitterFacadeTest {

    @Autowired
    private TwitterDAO twitterFacade;

   

    @Test
    public void executeInsertTwitter()
    {
        Twitter twitter = new Twitter();
        twitter.setCategory("testName");
        twitter.setCreatedAt(0);
        twitter.setOriginalSource("testSource");
        twitter.setPublisher("testPublisher");
        twitter.setText("test Text");
        twitter.setTwitterId(RandomStringUtils.randomAlphanumeric(10));
        boolean created =twitterFacade.create(twitter);
        Assert.assertTrue(created);
    }
}
