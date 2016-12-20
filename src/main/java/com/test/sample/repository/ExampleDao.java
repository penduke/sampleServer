package com.test.sample.repository;

import com.test.sample.model.ExampleModel;

/**
 * Created by Suhas Nair on 29/11/16.
 */
public interface ExampleDao {

    ExampleModel findByString(String id);
}
