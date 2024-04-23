package com.corhuila.shoppingcar.IRepository;

import com.corhuila.shoppingcar.Document.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends MongoRepository<Categoria, String> {
}
