

package com.desenvolvedor.demo.infra.repository;

import com.desenvolvedor.demo.infra.entity.UsuarioConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository < UsuarioConta, Long> {

    boolean ExistsByEmail(String Email);
}