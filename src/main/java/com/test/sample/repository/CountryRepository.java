package com.test.sample.repository;


import com.test.sample.model.Country;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

    @Cacheable("examplecache")
    List<Country> findAll();

    List<Country> findAll(Sort var1);

    List<Country> findAll(Iterable<Integer> var1);

    <S extends Country> List<S> save(Iterable<S> var1);

    void flush();

    <S extends Country> S saveAndFlush(S var1);

    void deleteInBatch(Iterable<Country> var1);

    void deleteAllInBatch();

    Country getOne(Integer var1);
}