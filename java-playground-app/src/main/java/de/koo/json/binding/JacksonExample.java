package de.koo.json.binding;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.koo.model.Dog;

public class JacksonExample {
	private ObjectMapper mapper;
	
    public JacksonExample() {
        mapper = new ObjectMapper();
	}

	public Dog bind(String json) throws JsonMappingException, JsonProcessingException {
        // JSON in Java-Objekt zurückwandeln
        return mapper.readValue(json, Dog.class);
    }
	
	public String unbind(Dog dog) throws JsonProcessingException {        
        // Java-Objekt in JSON umwandeln
        return mapper.writeValueAsString(dog);
    }
}
