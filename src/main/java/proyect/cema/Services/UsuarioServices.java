package proyect.cema.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

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

}
