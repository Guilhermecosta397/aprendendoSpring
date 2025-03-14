package com.desenvolvedor.demo.business;

import com.desenvolvedor.demo.infra.Exception.conflictException;
import com.desenvolvedor.demo.infra.entity.UsuarioConta;
import com.desenvolvedor.demo.infra.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioConta salvaUsuario(UsuarioConta usuario) {

        try {

            emailExistente(usuario.getEmail());

            //return UsuarioRepository.save(usuario);
            return usuarioRepository.save(usuario);

        } catch (conflictException e) {

            throw new conflictException("Email ja cadastrado", e.getCause());
        }
    }
    public void emailExistente(String Email){
        try {
            boolean existe = verificaEmailExistente(Email);
            if (existe) {
                throw new conflictException("Email já cadastrado" + Email);
            }
        }catch (conflictException e){
            throw new conflictException("Email já cadastrado" + e.getCause());
        }
    }


    public boolean verificaEmailExistente(String Email){
        return usuarioRepository.ExistsByEmail(Email);
    }
}
