package com.example.GerenciamentoDeTarefas.repository;

import com.example.GerenciamentoDeTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}