package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que gerencia a Fabrica de Entity Manager,
 * permitindo somente uma única instância da fabrica
 */
public class EntityManagerFactorySingleton {

	//atributo estático que armazena a única instância
	private static EntityManagerFactory fabrica;
	
	//construtor privado -> não é possível instanciar a classe
	private EntityManagerFactorySingleton() {}
	
	//método estático que retorna a única instância
	public static EntityManagerFactory getInstance() {
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
	
}