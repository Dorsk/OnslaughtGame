package com.game.onslaught.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {

	private @Id @GeneratedValue Long id;
	private String nom;
	private String description;
	private String goldValue;
	private String type;
	private String langue;

	private  Item(){
	}
	
	public Item(String nom, String description, String goldValue, String type, String langue) {
		this.nom = nom;
		this.description = description;
		this.goldValue=goldValue;
		this.type=type;
		this.langue=langue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return Objects.equals(id, item.id) &&
			Objects.equals (nom, item.nom) &&
			Objects.equals(description, item.description) &&
			Objects.equals(goldValue, item.goldValue) &&
			Objects.equals(type, item.type) &&
			Objects.equals(langue, item.langue);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, nom, description, goldValue, type, langue);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return nom;
	}

	public void setName(String nom) {
		this.nom = nom;
	}

	public String getGoldValue() {
		return goldValue;
	}

	public void setGoldValue(String goldValue) {
		this.goldValue = goldValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	@Override
	public String toString() {
		return "Item{" +
			"id=" + id +
			", nom='" + nom + '\'' +
			", description='" + description + '\'' +
			", goldValue='" + goldValue + '\'' +
			", type='" + type + '\'' +
			", langue='" + langue + '\'' +
			'}';
	}
}