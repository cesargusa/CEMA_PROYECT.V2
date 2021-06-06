package proyect.cema.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import proyect.cema.Repositories.Entities.UsuarioProductoEntity;
import proyect.cema.Repositories.Interfaces.UsuarioProductoRepository;
import proyect.cema.Services.Models.UsuarioProductoDTO;


public class UsuarioProductoService {
    @Autowired UsuarioProductoRepository usuarioProductoRepository;
    @Autowired ModelMapper modelMapper;

    public List<UsuarioProductoDTO> GetAll(){
        return usuarioProductoRepository.findAll().stream()
        .map(x -> modelMapper.map(x, UsuarioProductoDTO.class))
        .collect(Collectors.toList());
    }

    public UsuarioProductoDTO add(UsuarioProductoDTO product){
        UsuarioProductoEntity entitytoInsert = modelMapper.map(product, UsuarioProductoEntity.class);
        UsuarioProductoEntity result = usuarioProductoRepository.save(entitytoInsert);
        return modelMapper.map(result, UsuarioProductoDTO.class);

    }

    public UsuarioProductoDTO update(Long ID, UsuarioProductoDTO product) {
        UsuarioProductoEntity entitytoUpdate = modelMapper.map(product, UsuarioProductoEntity.class);
        UsuarioProductoEntity result = usuarioProductoRepository.save(entitytoUpdate);
        return modelMapper.map(result, UsuarioProductoDTO.class);
    }

    public void delete(Long ID){
        Optional<UsuarioProductoEntity> entitytoDelete = usuarioProductoRepository.findById(ID);
        if(entitytoDelete.isPresent())
        usuarioProductoRepository.delete(entitytoDelete.get());
    }

    public List<UsuarioProductoDTO> getById(Long id){
        return usuarioProductoRepository.findById(id).stream()
        .map(x -> modelMapper.map(x,UsuarioProductoDTO.class)).collect(Collectors.toList());
        
    }
}
