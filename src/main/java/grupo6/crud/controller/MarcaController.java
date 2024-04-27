package grupo6.crud.controller;

import grupo6.crud.Marca;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;


/*
Servicio para obtener las todas marcas
Servicio para crear marcas
Servicio para actualizar marcas
Servicio para eliminar marcas (solo borrado lógico)
*/


@RestController
public class MarcaController {


    public Marca marca(){
        Marca marca = new Marca();
        marca.setDescripcion("Adidas");
        marca.setFechabaja(new Date(2025,12,31));
        return marca;
    }

    //Servicio Obtener todas las marcas
    @GetMapping("/obtenerTodasMarca")
    public String obtenerTodasMarca(@RequestParam String modelo) {
        return "Lista de todas las marcas" + modelo;
    }


    //Servicio crear Marca
    @PostMapping("/crearMarca")
    public Marca crearMarca(@RequestBody Marca marca) {
        return marca;
    }

    //Servicio actualizar Marca
    @PutMapping("/actualizarMarca")
    public String actualizarMarca() {
        return "Marca actualizada";
    }
   //Servicio eliminar marca logico
    @DeleteMapping("/eliminarMarca")
    public String eliminarMarca() {
        return "Marca Eliminada";
    }

}