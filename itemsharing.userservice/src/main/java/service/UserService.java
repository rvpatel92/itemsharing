package service;

import model.User;

/**
 * Created by ravipatel on 1/24/18.
 */
public interface UserService
{
    User createUser(User user);

    User getUserByUsername(String username);
}
