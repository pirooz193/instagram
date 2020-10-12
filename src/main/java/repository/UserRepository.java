package repository;

import domains.user.User;

public interface UserRepository {

    User userLogIn(String username , String password);
    User getUserByUsername(String username);
}
