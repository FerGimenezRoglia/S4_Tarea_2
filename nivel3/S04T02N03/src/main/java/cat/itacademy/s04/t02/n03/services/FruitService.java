package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.model.Fruit;
import cat.itacademy.s04.t02.n03.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    @Autowired
    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    public Fruit getOneFruit(String id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException(id));
    }

    public Fruit addFruit(Fruit fruit) {
        validateFruit(fruit);
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(String id, Fruit fruitDetails) {
        Objects.requireNonNull(fruitDetails, "The fruit details cannot be null");

        Fruit existingFruit = getOneFruit(id);
        validateFruit(fruitDetails);

        existingFruit.setName(fruitDetails.getName());
        existingFruit.setQuantityKilos(fruitDetails.getQuantityKilos());

        return fruitRepository.save(existingFruit);
    }

    public void deleteFruit(String id) {
        if (!fruitRepository.existsById(id)) {
            throw new FruitNotFoundException(id);
        }
        fruitRepository.deleteById(id);
    }

    private void validateFruit(Fruit fruit) {
        if (fruit.getName() == null || fruit.getName().isBlank()) {
            throw new IllegalArgumentException("The fruit name cannot be empty");
        }
        if (fruit.getQuantityKilos() <= 0) {
            throw new IllegalArgumentException("The quantity must be greater than 0");
        }
    }
}