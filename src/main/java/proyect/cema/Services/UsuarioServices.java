package proyect.cema.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import proyect.cema.Repositories.Entities.UsuarioEntity;
import proyect.cema.Repositories.Interfaces.UsuarioRepository;
import proyect.cema.Services.Models.UsuarioDTO;

public class UsuarioServices {
    @Autowired UsuarioRepository usuarioRepository;
    @Autowired ModelMapper modelMapper;

    public List<UsuarioDTO> GetAll(){
        return usuarioRepository.findAll().stream()
        .map(x -> modelMapper.map(x, UsuarioDTO.class))
        .collect(Collectors.toList());
    }



    public UsuarioDTO add(UsuarioDTO usuario){
        UsuarioEntity entitytoInsert = modelMapper.map(usuario, UsuarioEntity.class);
        UsuarioEntity result = usuarioRepository.save(entitytoInsert);
        return modelMapper.map(result, UsuarioDTO.class);

    }

    public UsuarioDTO update(Long ID, UsuarioDTO usuario) {
        UsuarioEntity entitytoUpdate = modelMapper.map(usuario, UsuarioEntity.class);
        UsuarioEntity result = usuarioRepository.save(entitytoUpdate);
        return modelMapper.map(result, UsuarioDTO.class);
    }

    public void delete(Long ID){
        Optional<UsuarioEntity> entitytoDelete = usuarioRepository.findById(ID);
        if(entitytoDelete.isPresent())
        usuarioRepository.delete(entitytoDelete.get());
    }

    public Optional<UsuarioDTO> findById(Long id){
        Optional<UsuarioEntity> entity = usuarioRepository.findById(id);
        if(entity.isPresent())
        return Optional.of(modelMapper.map(entity.get(), UsuarioDTO.class));
        else
        return Optional.empty();
    }

    public List<UsuarioDTO> getById(Long id){
        return usuarioRepository.findById(id).stream()
        .map(x -> modelMapper.map(x,UsuarioDTO.class)).collect(Collectors.toList());
    }

    public List<UsuarioDTO> findUserEmail(String email, String contrasena){
        return usuarioRepository.findAll().stream()
        .map(x -> modelMapper.map(x, UsuarioDTO.class))
        .collect(Collectors.toList());
    }

    public List<UsuarioDTO> findName(String usuario,String pais,String sexo){
        return usuarioRepository.findByUser(usuario,pais,sexo).stream()
        .map(x -> modelMapper.map(x, UsuarioDTO.class))
        .collect(Collectors.toList());
    }

}
