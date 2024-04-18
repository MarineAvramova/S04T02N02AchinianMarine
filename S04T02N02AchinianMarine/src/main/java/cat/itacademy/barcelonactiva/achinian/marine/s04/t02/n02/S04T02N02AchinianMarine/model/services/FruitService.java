package cat.itacademy.barcelonactiva.achinian.marine.s04.t02.n02.S04T02N02AchinianMarine.model.services;

import cat.itacademy.barcelonactiva.achinian.marine.s04.t02.n02.S04T02N02AchinianMarine.model.domain.Fruit;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface FruitService {
    public Fruit add(Fruit fruit);
    public Fruit update(Fruit fruit);
    public void deleteById(long id);
    public Iterable<Fruit> getAll();
    public Optional<Fruit>getOne(Long id);




}
