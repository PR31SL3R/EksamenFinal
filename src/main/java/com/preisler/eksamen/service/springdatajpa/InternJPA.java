package com.preisler.eksamen.service.springdatajpa;

import com.preisler.eksamen.model.Intern;
import com.preisler.eksamen.service.InternService;

import java.util.List;
import java.util.Optional;


public class InternJPA implements InternService {

    @Override
    public List<Intern> findAll() {
        return null;
    }

    @Override
    public Intern save(Intern object) {
        return null;
    }

    @Override
    public void delete(Intern object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Intern> findById(Long aLong) {
        return Optional.empty();
    }
}
