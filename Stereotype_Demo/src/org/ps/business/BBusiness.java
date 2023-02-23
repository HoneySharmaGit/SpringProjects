package org.ps.business;

import org.springframework.stereotype.Service;

@Service // annotation specifies that this is used to Business logic.
public class BBusiness {
	public BBusiness() {
		System.out.println("BBusiness Constructor executed.");
	}
}
