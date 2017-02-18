package com.apirest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HomeController {

		@RequestMapping
		public String index() {
			return  "olá mundo";
		}
}
