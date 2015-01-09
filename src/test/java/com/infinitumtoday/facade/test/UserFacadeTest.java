/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade.test;

import com.infinitumtoday.dao.TwitterDAO;
import com.infinitumtoday.dao.UserDAO;
import com.infinitumtoday.entity.Twitter;
import com.infinitumtoday.entity.User;
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
public class UserFacadeTest {
    @Autowired
    private UserDAO userFacade;

   

    @Test
    public void executeInsertUser()
    {
        User user = new User();
        user.setEmail("test@test.com");
        user.setPassword("pwd");
        user.setUserName("test");
        boolean created =userFacade.create(user);
        Assert.assertTrue(created);
    }
    
}
