package com.corhuila.shoppingcar.Controller;

import com.corhuila.shoppingcar.Document.Categoria;
import com.corhuila.shoppingcar.IService.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
    //Inyectar el servicio
    @Autowired
    private ICategoriaService service;

    @GetMapping()
    public List<Categoria> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Categoria save(@RequestBody Categoria categoria) {
        return service.save(categoria);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Categoria categoria, @PathVariable String id) {
        service.update(categoria, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
