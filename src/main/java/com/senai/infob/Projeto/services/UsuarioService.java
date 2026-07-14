package com.senai.infob.Projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.models.Usuario;
import com.senai.infob.Projeto.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public String login(String email, String senha) {
        Usuario usuario= usuarioRepository.findByEmail(email);
        if(usuario != null && senha.equals(usuario.getSenha())) {
            return "Login bem-sucedido!";
        }
        return "Falha ao realizar login";
    }

    public Long contarUsuarios() {
        return usuarioRepository.count();
    }

    public Usuario buscarUsuario(@NonNull Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Boolean deletarUsuario(@NonNull Integer id) {
        if(usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Usuario cadastrarUsuario(@NonNull Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(@NonNull Integer id, Usuario usuario) {
        Usuario usuarioRecuperado = buscarUsuario(id);
        if(usuarioRecuperado != null) {
            usuarioRecuperado.setId(id);
            if(usuario.getNome() != null) {
                usuarioRecuperado.setNome(usuario.getNome());
            }
            if (usuario.getPerfil() != null) {
                usuarioRecuperado.setPerfil(usuario.getPerfil());
            }
            return usuarioRepository.save(usuarioRecuperado);
        }
        return null;
    }
}
