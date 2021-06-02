package proyect.cema.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ch.qos.logback.core.joran.conditional.ElseAction;
import proyect.cema.Repositories.Entities.ProductEntity;
import proyect.cema.Repositories.Entities.UsuarioEntity;
import proyect.cema.Repositories.Interfaces.ProductRepository;
import proyect.cema.Repositories.Interfaces.UsuarioRepository;
import proyect.cema.Services.Models.ProductDTO;
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

    public List<ProductDTO> getByName(String nombre_producto, String marca, String talla,String sexo,String estado,String color){
        return productRepository.findByName(nombre_producto,marca,talla,sexo,estado,color).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }
    public List<ProductDTO> orderByPrecioDESC(){
        return productRepository.orderPriceDESC().stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }
    public List<ProductDTO> orderByPrecioaASC(){
        return productRepository.orderPriceASC().stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }
    public List<ProductDTO> findByCategory(String nombre_categoria){
        return productRepository.FindByCategory(nombre_categoria).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

  
}