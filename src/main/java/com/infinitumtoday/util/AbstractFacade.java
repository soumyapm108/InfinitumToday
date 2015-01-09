/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package com.infinitumtoday.util;
import com.blobcity.db.CloudStorage;
import com.blobcity.db.search.Query;
import com.blobcity.db.search.SearchParam;
import java.util.Collections;
import java.util.List;

/**
 * Abstract Facade for all CRUD operations on Infinitum
 *
 * @author Akshay Kadu <akshay.kadu@blobcity.com>
 * @param <T>
 */
 public abstract class AbstractFacade<T extends CloudStorage> {

    private final Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public T load(Object id) {
        return CloudStorage.newLoadedInstance(entityClass, id);
    }

    public List<String> findAll() {
        return CloudStorage.selectAll(entityClass, String.class);
    }

    public boolean create(T entity) {
        return entity.insert();
    }

    public void update(T entity) {
        entity.save();
    }

    public void delete(T entity) {
        entity.remove();
    }

    public void remove(Object id) {
        CloudStorage.remove(entityClass, id);
    }

    public List<T> search(SearchParam searchParam) {
        List<T> list = CloudStorage.search(Query.select().from(entityClass).where(searchParam));
        return list == null || list.isEmpty() ? Collections.EMPTY_LIST : list;
        }
}