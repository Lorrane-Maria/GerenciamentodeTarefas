package com.example.GerenciamentoDeTarefas.repository;

import com.example.GerenciamentoDeTarefas.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaMongoRepository extends MongoRepository<Tarefa, String> {

}