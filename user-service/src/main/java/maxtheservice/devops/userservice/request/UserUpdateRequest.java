package maxtheservice.devops.userservice.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import maxtheservice.devops.userservice.model.UserDetails;

@Data
public class UserUpdateRequest {
    @NotBlank(message = "Id is required")
    private String id;
    private String username;
    private String password;
    private UserDetails userDetails;
}
