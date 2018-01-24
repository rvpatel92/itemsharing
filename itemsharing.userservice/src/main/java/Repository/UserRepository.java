package Repository;

import model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ravipatel on 1/24/18.
 */
public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
