package com.corhuila.shoppingcar.Service;

import com.corhuila.shoppingcar.Document.Categoria;
import com.corhuila.shoppingcar.IRepository.ICategoriaRepository;
import com.corhuila.shoppingcar.IService.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements ICategoriaService {

    //Conectar con los datos - IRepository
    // Inyección de dependencia
    @Autowired
    private ICategoriaRepository repository;


    @Override
    public List<Categoria> findAll() {
       return repository.findAll();
    }

    @Override
    public Optional<Categoria> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public void update(Categoria categoria, String id) {
        //Obtener el objeto detalleFactura y el id
        //Verificar con el id, si exiten los datos
        Optional<Categoria> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){
            Categoria categoria1 = ps.get();
            categoria1.setNombre(categoria.getNombre());
            categoria1.setDescripcion(categoria.getDescripcion());
            //Actualizar el objeto detalleFactura
            repository.save(categoria1);
        }else{
            System.out.println("No existe el detalleFactura");
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
