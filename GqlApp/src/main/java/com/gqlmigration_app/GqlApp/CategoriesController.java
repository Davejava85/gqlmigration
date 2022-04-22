/**
 * 
 */
package com.gqlmigration_app.GqlApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {
	
	@GetMapping("/ides")
	public String getId() {
		String id = "ciao";
		return id;
}
}