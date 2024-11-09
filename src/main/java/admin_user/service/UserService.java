package admin_user.service;

import admin_user.dto.UserDto;
import admin_user.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User save(UserDto userDto);
}
