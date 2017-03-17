package hello.models;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hjing on 3/15/17.
 */
@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

} // class UserDao
