package br.edu.ifpb;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateTable {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.
		          createEntityManagerFactory("tarefas");

		    factory.close();

	}


}
