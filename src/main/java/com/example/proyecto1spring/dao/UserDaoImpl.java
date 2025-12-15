package com.example.proyecto1spring.dao;

import com.example.proyecto1spring.entity.Usuario;
import com.example.proyecto1spring.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Usuario> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        java.util.Objects.requireNonNull(id, "id no puede ser nulo");
        return userRepository.findById(id);
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public boolean existsByRut(String rut) {
        return userRepository.existsByRut(rut);
    }

    @Override
    public Usuario save(Usuario usuario) {
        java.util.Objects.requireNonNull(usuario, "usuario no puede ser nulo");
        return userRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        java.util.Objects.requireNonNull(id, "id no puede ser nulo");
        userRepository.deleteById(id);
    }
}
