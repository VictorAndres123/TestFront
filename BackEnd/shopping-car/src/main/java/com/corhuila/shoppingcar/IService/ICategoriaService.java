package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Document.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {
    List<Categoria> findAll(); // Devuelve una lista de categorias
    Optional<Categoria> findById(String id); // Devuelve una categoria por su id
    Categoria save(Categoria categoria); // Guarda una categoria
    void update(Categoria categoria, String id); // Actualiza un detalleFactura
    void delete(String id); // Elimina una categoria
}
