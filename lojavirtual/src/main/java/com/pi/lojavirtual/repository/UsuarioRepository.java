package com.pi.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pi.lojavirtual.model.Usuario;
 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario  findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByCpf(String cpf);
}   
