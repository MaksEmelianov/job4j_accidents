package ru.job4j.accidents.service;

import org.springframework.stereotype.Service;
import ru.job4j.accidents.model.Accident;
import ru.job4j.accidents.repository.AccidentMem;

import java.util.Collection;

@Service
public class SimpleAccidentService implements AccidentService {

    private final AccidentMem repository;

    public SimpleAccidentService(AccidentMem repository) {
        this.repository = repository;
    }

    public void save(Accident accident) {
        repository.save(accident);
    }

    public Collection<Accident> findAll() {
        return repository.findAll();
    }
}
