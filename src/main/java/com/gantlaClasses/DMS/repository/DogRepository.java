package com.gantlaClasses.DMS.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.gantlaClasses.DMS.Models.Dog;
/**
 * 
 * @author S550301
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);
}
