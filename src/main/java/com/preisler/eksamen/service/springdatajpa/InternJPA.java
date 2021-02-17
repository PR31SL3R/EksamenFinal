package com.preisler.eksamen.service.springdatajpa;

import com.preisler.eksamen.model.Intern;
import com.preisler.eksamen.repositories.InterRepository;
import com.preisler.eksamen.service.InternService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InternJPA implements InternService {
    private final InterRepository interRepository;

    public InternJPA(InterRepository interRepository){
        this.interRepository = interRepository;
    }

    @Override
    public List<Intern> findAll() {
        List<Intern> list = new ArrayList<>();
        interRepository.findAll().forEach(list::add);
        return list;

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
