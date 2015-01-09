/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package com.infinitumtoday.startup;
import com.blobcity.db.config.Credentials;
import com.infinitumtoday.constants.Constants;
import org.apache.log4j.Logger;

/**
 * This is startup bean for connecting with Infinitum 
 * 
 * @author Akshay Kadu <akshay.kadu@blobcity.com>
 */
public class StartupBean {
    
    private static final Logger logger = Logger.getLogger(StartupBean.class);
    
    /**
     * This method is called from {@code webthara-facade-context.xml} file
     */
    public void init() {
        logger.info("***************BlobCity Infinitum****************");
        Credentials.init(Constants.SERVER, Constants.USERNAME, Constants.PASSWORD, Constants.APP_ID);
    }
}