package cl.metricasinteligentes.service;

import cl.metricasinteligentes.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
