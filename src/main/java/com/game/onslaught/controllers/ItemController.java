package com.game.onslaught.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

	@RequestMapping(value = "/items")
	public String index() {
		return "items";
	}

}