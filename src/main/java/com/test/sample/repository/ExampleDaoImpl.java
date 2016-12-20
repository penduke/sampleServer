package com.test.sample.repository;

import com.test.sample.model.ExampleModel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * Created by Suhas Nair on 29/11/16.
 */
@Repository("ExampleDao")
public class ExampleDaoImpl implements ExampleDao {

    @Cacheable("examplecache")
    public ExampleModel findByString(String id) {
        System.out.println("findByString is starting...");
        slowQuery(2000);
        System.out.println("findByString is running...");
        return new ExampleModel("Some Text", 1);
    }

    private void slowQuery(long seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }


}
