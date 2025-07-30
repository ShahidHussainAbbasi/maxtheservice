package maxtheservice.devops.user_service.service;


import java.util.List;

import maxtheservice.devops.user_service.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    void deleteUser(Long userId);
}
