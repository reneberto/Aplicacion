package cl.metricasinteligentes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.metricasinteligentes.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
