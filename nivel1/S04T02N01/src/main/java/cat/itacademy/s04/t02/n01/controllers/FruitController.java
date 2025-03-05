package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public ResponseEntity<List<Fruit>> getAllFruits() {
        return ResponseEntity.ok(fruitService.getAllFruits());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable int id) {
        return ResponseEntity.ok(fruitService.getOneFruit(id));
    }

    @PostMapping
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(fruitService.addFruit(fruit));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable int id, @RequestBody Fruit fruitDetails) {
        return ResponseEntity.ok(fruitService.updateFruit(id, fruitDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable int id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }
}