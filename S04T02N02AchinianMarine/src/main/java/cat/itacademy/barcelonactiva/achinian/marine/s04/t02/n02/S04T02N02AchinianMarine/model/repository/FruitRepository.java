package cat.itacademy.barcelonactiva.achinian.marine.s04.t02.n02.S04T02N02AchinianMarine.model.repository;

import cat.itacademy.barcelonactiva.achinian.marine.s04.t02.n02.S04T02N02AchinianMarine.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
//    List<Fruit> findByID(long id);
//    List<Fruit> findByName(String name);
}
