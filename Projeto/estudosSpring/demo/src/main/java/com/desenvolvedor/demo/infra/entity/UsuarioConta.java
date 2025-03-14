package com.desenvolvedor.demo.infra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuario")
public class UsuarioConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name= "nome", length = 100)
    private String nome;
    @Column (name= "Email", length = 100)
    private String Email;
    @Column (name= "Senha", length = 10)
    private String senha;

    @OneToMany
    @JoinColumn(name= "usuario_id", referencedColumnName = "id")
    private List<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "usuario_id", referencedColumnName = "id")
    private List<Telefone> telefones;
}
