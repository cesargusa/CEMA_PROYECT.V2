package proyect.cema.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import proyect.cema.Repositories.Entities.ProductoCategoriaEntity;
import proyect.cema.Repositories.Interfaces.ProductoCategoriaRepository;
import proyect.cema.Services.Models.ProductoCategoriaDTO;

public class ProductoCategoriaService {
    @Autowired ProductoCategoriaRepository productoCategoriaRepository;
    @Autowired ModelMapper modelMapper;

    public List<ProductoCategoriaDTO> GetAll(){
        return productoCategoriaRepository.findAll().stream()
        .map(x -> modelMapper.map(x, ProductoCategoriaDTO.class))
        .collect(Collectors.toList());
    }

    public ProductoCategoriaDTO add(ProductoCategoriaDTO product){
        ProductoCategoriaEntity entitytoInsert = modelMapper.map(product, ProductoCategoriaEntity.class);
        ProductoCategoriaEntity result = productoCategoriaRepository.save(entitytoInsert);
        return modelMapper.map(result, ProductoCategoriaDTO.class);

    }

    public ProductoCategoriaDTO update(Long ID, ProductoCategoriaDTO product) {
        ProductoCategoriaEntity entitytoUpdate = modelMapper.map(product, ProductoCategoriaEntity.class);
        ProductoCategoriaEntity result = productoCategoriaRepository.save(entitytoUpdate);
        return modelMapper.map(result, ProductoCategoriaDTO.class);
    }

    public void delete(Long ID){
        Optional<ProductoCategoriaEntity> entitytoDelete = productoCategoriaRepository.findById(ID);
        if(entitytoDelete.isPresent())
        productoCategoriaRepository.delete(entitytoDelete.get());
    }

    public List<ProductoCategoriaDTO> getById(Long id){
        return productoCategoriaRepository.findById(id).stream()
        .map(x -> modelMapper.map(x,ProductoCategoriaDTO.class)).collect(Collectors.toList());
        
    }
  
}
