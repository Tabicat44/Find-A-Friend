package org.launchcode.models.data;

import org.launchcode.models.Inquiry2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface Inquiry2Dao extends CrudRepository<Inquiry2, Integer> {
}
