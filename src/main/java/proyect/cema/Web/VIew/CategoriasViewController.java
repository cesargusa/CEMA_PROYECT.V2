package proyect.cema.Web.VIew;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import proyect.cema.Services.Models.CategoriaDTO;
import proyect.cema.Web.API.CategoriaController;

@Controller
public class CategoriasViewController {
    private final CategoriaController categoriaController;

    CategoriasViewController(CategoriaController categoriaController){
        this.categoriaController=categoriaController;
    }

 
}
