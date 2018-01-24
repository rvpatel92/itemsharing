package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * Created by ravipatel on 1/23/18.
 */

@RestController
@RequestMapping("/v1/user")
public class UserController
{

    @Autowired
    private UserService userService;

    @RequestMapping("/{username}")
    public User getUserByUsername(@PathVariable String username)
    {
        return userService.getUserByUsername(username);
    }
}
