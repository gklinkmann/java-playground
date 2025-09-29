package de.koo.json

import org.junit.jupiter.api.Test

import de.koo.json.binding.JacksonExample
import de.koo.json.binding.JsonbExample
import de.koo.model.Dog

class JsonDataBindingTest {

	@Test
	void withJackson() {
		JacksonExample je = new JacksonExample();
		String json=je.unbind(new Dog("Falco",4,false))
		println json
		
		Dog dog=je.bind(json)
		assert dog.name=="Falco"
	}

	@Test
	void withJsonb() {
		JsonbExample jb = new JsonbExample();
		String json=jb.unbind(new Dog("Falco",4,false))
		println json
		
		Dog dog=jb.bind(json)
		assert dog.name=="Falco"
	}
}
