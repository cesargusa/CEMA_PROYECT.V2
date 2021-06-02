package proyect.cema.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import proyect.cema.Repositories.Entities.CategoriaEntity;
import proyect.cema.Repositories.Interfaces.CategoriaRepository;
import proyect.cema.Services.Models.CategoriaDTO;

public class CategoriaService {
    @Autowired CategoriaRepository categoriaRepository;
    @Autowired ModelMapper modelMapper;

    public List<CategoriaDTO> GetAll(){
        return categoriaRepository.findAll().stream()
        .map(x -> modelMapper.map(x, CategoriaDTO.class))
        .collect(Collectors.toList());
    }
    

    public CategoriaDTO add(CategoriaDTO product){
        CategoriaEntity entitytoInsert = modelMapper.map(product, CategoriaEntity.class);
        CategoriaEntity result = categoriaRepository.save(entitytoInsert);
        return modelMapper.map(result, CategoriaDTO.class);

    }

    public CategoriaDTO update(Long ID, CategoriaDTO product) {
        CategoriaEntity entitytoUpdate = modelMapper.map(product, CategoriaEntity.class);
        CategoriaEntity result = categoriaRepository.save(entitytoUpdate);
        return modelMapper.map(result, CategoriaDTO.class);
    }

    public void delete(Long ID){
        Optional<CategoriaEntity> entitytoDelete = categoriaRepository.findById(ID);
        if(entitytoDelete.isPresent())
        categoriaRepository.delete(entitytoDelete.get());
    }
}
