package proyect.cema.Services.Models;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

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

}