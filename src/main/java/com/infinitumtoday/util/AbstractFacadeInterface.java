/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package com.infinitumtoday.util;

import com.blobcity.db.CloudStorage;
import java.util.List;

/**
 *
 * @author Akshay Kadu <akshay.kadu@blobcity.com>
 * @param <T>
 */
public interface AbstractFacadeInterface<T extends CloudStorage> {

    public T load(Object id);

    public List<String> findAll();

    public boolean create(T entity);

    public void update(T entity);

    public void delete(T entity);

    public void remove(Object id);
}
