package grupo6.crud.controller;

import grupo6.crud.Marca;
import grupo6.crud.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class MarcaController {
    @Autowired
    private MarcaService marcaService;
    @PatchMapping("/eliminarMarca/{id}") // Importante: Método PATCH
    public ResponseEntity<Marca> eliminarMarca(@PathVariable Long id) {
        marcaService.eliminarMarca(id);
        return ResponseEntity.noContent().build();
    }
}