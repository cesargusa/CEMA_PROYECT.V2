package proyect.cema.Web.VIew;


import org.springframework.stereotype.Controller;

import proyect.cema.Web.API.CategoriaController;

@Controller
public class CategoriasViewController {
    private final CategoriaController categoriaController;

    CategoriasViewController(CategoriaController categoriaController){
        this.categoriaController=categoriaController;
    }

 
}
