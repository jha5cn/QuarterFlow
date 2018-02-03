package com.jea.QuarterFlow.QuarterFlow.respositories;

import com.jea.QuarterFlow.QuarterFlow.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jahn on 1/29/18.
 */
public interface UserRepository extends CrudRepository<User, String> {
    User getByEmail(String email);
}
