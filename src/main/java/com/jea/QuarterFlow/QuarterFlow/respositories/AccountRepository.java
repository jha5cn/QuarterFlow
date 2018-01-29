package com.jea.QuarterFlow.QuarterFlow.respositories;

import com.jea.QuarterFlow.QuarterFlow.domain.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jahn on 1/29/18.
 */
public interface AccountRepository extends CrudRepository<Account, String> {
}
