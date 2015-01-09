/*
 * Copyright 2015, BlobCity iSolutions Pvt. Ltd.
 */

package com.infinitumtoday.facade;

import com.infinitumtoday.dao.UserDAO;
import com.infinitumtoday.entity.User;
import com.infinitumtoday.util.AbstractFacade;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Soumya P M <soumya.pm@blobcity.com>
 */
@Repository("userFacade")
public class UserFacade extends AbstractFacade<User> implements UserDAO{

    public UserFacade() {
        super(User.class);
    }
    
}
