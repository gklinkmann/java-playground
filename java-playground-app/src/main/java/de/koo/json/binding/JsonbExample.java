package de.koo.json.binding;

import de.koo.model.Dog;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

public class JsonbExample {
	private Jsonb jsonb;
	
    public JsonbExample() {
        jsonb = JsonbBuilder.create();
	}

	public Dog bind(String json) {
        // JSON in Java-Objekt zurückwandeln
        return jsonb.fromJson(json, Dog.class);
    }
	
	public String unbind(Dog dog) {        
        // Java-Objekt in JSON umwandeln
        return jsonb.toJson(dog);
    }
}