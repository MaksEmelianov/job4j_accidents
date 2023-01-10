package ru.job4j.accidents.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.accidents.model.Accident;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class AccidentMem implements AccidentRepository {

    private final Map<Integer, Accident> accidents = new ConcurrentHashMap<>();

    private final AtomicInteger nextAId = new AtomicInteger(1);

    public AccidentMem() {
        save(new Accident(0, "Name1", "Text1", "Address1"));
        save(new Accident(0, "Name2", "Text2", "Address3"));
        save(new Accident(0, "Name3", "Text2", "Address3"));
    }

    @Override
    public void save(Accident accident) {
        accidents.put(nextAId.getAndIncrement(), accident);
    }

    @Override
    public Collection<Accident> findAll() {
        return accidents.values();
    }
}
