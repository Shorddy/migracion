package ni.edu.uam.gestion_productos.controller;

import ni.edu.uam.gestion_productos.entity.Etiqueta;
import ni.edu.uam.gestion_productos.repository.EtiquetaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etiquetas")
public class EtiquetaController {

    private final EtiquetaRepository repository;

    public EtiquetaController(EtiquetaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Etiqueta> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Etiqueta guardar(@RequestBody Etiqueta etiqueta) {
        return repository.save(etiqueta);
    }
}
