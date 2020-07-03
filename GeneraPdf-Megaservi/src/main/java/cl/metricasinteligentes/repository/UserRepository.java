package cl.metricasinteligentes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.metricasinteligentes.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
