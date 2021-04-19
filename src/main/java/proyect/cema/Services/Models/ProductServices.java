package proyect.cema.Services.Models;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import ch.qos.logback.core.joran.conditional.ElseAction;
import proyect.cema.Repositories.Entities.ProductEntity;
import proyect.cema.Repositories.Entities.UsuarioEntity;
import proyect.cema.Repositories.Interfaces.ProductRepository;
import proyect.cema.Repositories.Interfaces.UsuarioRepository;
import proyect.cema.Services.Models.UsuarioDTO;

public class ProductServices {
    @Autowired ProductRepository productRepository;
    @Autowired ModelMapper modelMapper;

    public List<ProductDTO> GetAll(){
        return productRepository.findAll().stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

    public ProductDTO add(ProductDTO product){
        ProductEntity entitytoInsert = modelMapper.map(product, ProductEntity.class);
        ProductEntity result = productRepository.save(entitytoInsert);
        return modelMapper.map(result, ProductDTO.class);

    }

    public ProductDTO update(Long ID, ProductDTO product) {
        ProductEntity entitytoUpdate = modelMapper.map(product, ProductEntity.class);
        ProductEntity result = productRepository.save(entitytoUpdate);
        return modelMapper.map(result, ProductDTO.class);
    }

    public void delete(Long ID){
        Optional<ProductEntity> entitytoDelete = productRepository.findById(ID);
        if(entitytoDelete.isPresent())
        productRepository.delete(entitytoDelete.get());
    }

    public Optional<ProductDTO> findById(Long id){
        Optional<ProductEntity> entity = productRepository.findById(id);
        if(entity.isPresent())
        return Optional.of(modelMapper.map(entity.get(), ProductDTO.class));
        else
        return Optional.empty();
    }

    public List<ProductDTO> getById(Long id){
        return productRepository.findById(id).stream()
        .map(x -> modelMapper.map(x,ProductDTO.class)).collect(Collectors.toList());
    }

    public List<ProductDTO> getByName(String nombre_producto){
        return productRepository.findByName(nombre_producto).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

    public List<ProductDTO> getByPrice(Long precio ){
        return productRepository.findByPrice(precio).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

    public List<ProductDTO> getByTalla(String talla ){
        return productRepository.findByTalla(talla).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

    public List<ProductDTO> getByMarca(String marca ){
        return productRepository.findByMarca(marca).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

}