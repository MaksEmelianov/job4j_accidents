package ru.job4j.accidents.repository;

import ru.job4j.accidents.model.Accident;

import java.util.Collection;

public interface AccidentRepository {

    void save(Accident accident);
    Collection<Accident> findAll();
}
