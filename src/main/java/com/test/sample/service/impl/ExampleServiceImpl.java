package com.test.sample.service.impl;

import com.test.sample.repository.ExampleDao;
import com.test.sample.model.ExampleModel;
import com.test.sample.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleDao exampleDao;

    public ExampleModel get(String modelId) {
        return exampleDao.findByString("1");

    }
}