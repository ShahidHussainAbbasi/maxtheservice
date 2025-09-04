package maxtheservice.devops.userservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import maxtheservice.devops.userservice.enums.Active;
import maxtheservice.devops.userservice.enums.Role;

@Entity(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {
    
    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false, updatable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Active active;

    @Embedded
    private UserDetails userDetails;
}
