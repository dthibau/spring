package org.formation.service;

import java.util.List;

import org.formation.model.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class MovieListerTest extends TestCase {

	public void testDirectedBy() {

		//Initialiser Spring


		// Récupérer le bean de type MovieLister


	
		List<Movie> hitchcock = movieLister.moviesDirectedBy("Hitchcock");
		List<Movie> HITCHCOCK = movieLister.moviesDirectedBy("HITCHCOCK");
		assertEquals(hitchcock.size(), 2);
		assertEquals(HITCHCOCK.size(), 2);
		List<Movie> empty = movieLister.moviesDirectedBy("");
		assertNotNull(empty);
		assertEquals(0, empty.size());
		
		
	}
}
