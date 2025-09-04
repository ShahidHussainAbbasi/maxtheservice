package maxtheservice.devops.authservice.dto;

import maxtheservice.devops.authservice.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private Role role;
}
