/*
    Para ejecutar este script en MongoDB, usa el siguiente comando en la terminal:

    mongosh < ruta/del/archivo/mongodb_init.js

    Esto se asegurará de que la base de datos "Fruits" y la colección "fruit"
    estén creadas correctamente sin duplicar datos y puedas probar hacer peticiones a partir de estos datos.
*/

db = db.getSiblingDB("Fruits");

if (!db.getCollectionNames().includes("fruit")) {
    db.createCollection("fruit");
}

db.fruit.updateOne(
    { name: "Manzana" },
    { $setOnInsert: { name: "Manzana", quantityKilos: 10 } },
    { upsert: true }
);

db.fruit.updateOne(
    { name: "Banana" },
    { $setOnInsert: { name: "Banana", quantityKilos: 20 } },
    { upsert: true }
);

db.fruit.updateOne(
    { name: "Pera" },
    { $setOnInsert: { name: "Pera", quantityKilos: 15 } },
    { upsert: true }
);
