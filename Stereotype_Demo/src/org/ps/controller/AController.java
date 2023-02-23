package org.ps.controller;

import org.springframework.stereotype.Controller;

@Controller // annotation specifies that this is Controller in MVC concept.
public class AController {
	public AController() {
		System.out.println("AController Constructor executed.");
	}
}
