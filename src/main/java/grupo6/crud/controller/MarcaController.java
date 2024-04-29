package grupo6.crud.controller;

import grupo6.crud.Marca;
import grupo6.crud.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;


/*
Servicio para obtener las todas marcas
Servicio para crear marcas
Servicio para actualizar marcas
Servicio para eliminar marcas (solo borrado lógico)
*/


@RestController
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    /*
    //Servicio Obtener todas las marcas
    @GetMapping("/obtenerTodasMarca")
    public String obtenerTodasMarca(@RequestParam String modelo) {
        return "Lista de todas las marcas" + modelo;
    }
    */
    @GetMapping("/obtenerTodasMarca")
    public ResponseEntity<List<Marca>> obtenerTodasMarca() {
        List<Marca> marcas = marcaService.obtenerTodasMarca();
        return ResponseEntity.ok(marcas);
    }

    //Servicio crear Marca
    @PostMapping("/crearMarca")
    public ResponseEntity<Marca> crearMarca(@RequestBody Marca marca) {
        Marca createdMarca = marcaService.crearMarca(marca);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMarca);
    }



    //Servicio actualizar Marca
    @PutMapping("/actualizarMarca")
    public String actualizarMarca() {
        return "Marca actualizada";
    }
   //Servicio eliminar marca logico

    public String eliminarMarca() {
        return "Marca desactivada";
    }

    @PatchMapping("/eliminarMarca/{id}") // Importante: Método PATCH
    public ResponseEntity<Marca> eliminarMarca(@PathVariable Long id) {
        marcaService.eliminarMarca(id);
        return ResponseEntity.noContent().build();
    }

}