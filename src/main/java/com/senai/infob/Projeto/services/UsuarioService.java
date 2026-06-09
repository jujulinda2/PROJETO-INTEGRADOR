package com.senai.infob.Projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.Projeto.models.Usuario;
import com.senai.infob.Projeto.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Long contarUsuarios() {
        return usuarioRepository.count();
    }

    public Usuario buscarUsuario(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Boolean deletarUsuario(Integer id) {
        if(usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Integer id, Usuario usuario) {
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
