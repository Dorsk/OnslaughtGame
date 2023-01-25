package com.game.onslaught.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.game.onslaught.entities.Item;
import com.game.onslaught.entities.ItemRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ItemRepository repository;

	public DatabaseLoader(ItemRepository repository) {
		this.repository = repository;
	}

    // String nom;
	// String description;
	// String goldValue;
	// String type;
	// String langue;
	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Item("Arc", "Armes à distance", "100", "Deux mains", "FR_FR"));
	}
}