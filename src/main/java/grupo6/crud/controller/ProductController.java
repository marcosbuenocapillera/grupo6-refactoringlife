package grupo6.crud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //Servicio Obtener productos
    @GetMapping("/obtenerProductos")
    public String obtenerProductos(){
        return "Obtengo la lista de productos";
    }


    //Servicio crear productos
    @PostMapping("/crearProductos")
    public String crearProductos(){
        return "Creo  producto";
    }


}
