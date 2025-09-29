package com.ProjetoFinal.app;

import org.springframework.data.repository.CrudRepository;
import com.ProjetoFinal.app.models.Pessoa;

public interface CruidRepository extends CrudRepository<Pessoa, Long> {
}

