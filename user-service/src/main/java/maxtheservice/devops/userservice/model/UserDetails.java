package maxtheservice.devops.userservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String country;
    private String city;
    private String address;
    private String postalCode;
    private String aboutMe;
    private String profilePicture;
}
