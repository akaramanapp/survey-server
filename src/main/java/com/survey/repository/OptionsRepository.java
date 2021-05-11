package com.survey.repository;

import com.survey.model.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository  extends CrudRepository<Option, Long> {

}
