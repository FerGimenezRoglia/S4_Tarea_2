Guía rápida para crear una base de datos en MongoDB desde la terminal

1. **Abrir MongoDB en la terminal**
   ```sh
   mongosh
   ```

2. **Ver bases de datos existentes**
   ```sh
   show databases
   ```

3. **Crear y usar la base de datos "Fruits"**
   ```sh
   use Fruits
   ```

4. **Crear una colección "fruit" (opcional, MongoDB la crea automáticamente cuando insertas datos)**
   ```sh
   db.createCollection("fruit")
   ```

5. **Insertar datos en la colección**
   ```sh
   db.fruit.insertMany([
      { "name": "Manzana", "quantityKilos": 10 },
      { "name": "Banana", "quantityKilos": 20 },
      { "name": "Pera", "quantityKilos": 15 }
   ])
   ```

6. **Ver todos los documentos en la colección**
   ```sh
   db.fruit.find().pretty()
   ```

7. **Actualizar un documento en la colección**
   ```sh
   db.fruit.updateOne(
      { "name": "Manzana" },
      { $set: { "quantityKilos": 12 } }
   )
   ```

8. **Eliminar un documento de la colección**
   ```sh
   db.fruit.deleteOne({ "name": "Pera" })
   ```

9. **Eliminar toda la colección (con precaución)**
   ```sh
   db.fruit.drop()
   ```

10. **Eliminar la base de datos (con precaución)**
    ```sh
    db.dropDatabase()
    ```

¡Listo! Ahora tienes una base de datos en MongoDB creada y gestionada desde la terminal.
