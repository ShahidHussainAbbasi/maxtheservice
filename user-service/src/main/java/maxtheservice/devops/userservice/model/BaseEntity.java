package maxtheservice.devops.userservice.model;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
public abstract class BaseEntity implements Serializable {

    @Id
    @UuidGenerator
    private String id;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;

    @UpdateTimestamp
    private LocalDateTime updateTimestamp;
}
