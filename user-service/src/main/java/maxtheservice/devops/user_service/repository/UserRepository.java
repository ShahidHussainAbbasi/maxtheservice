package maxtheservice.devops.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import maxtheservice.devops.user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
