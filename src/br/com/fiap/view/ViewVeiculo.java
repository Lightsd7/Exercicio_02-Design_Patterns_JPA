package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.impl.VeiculoDAOImpl;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.KeyNotFoundException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import oracle.net.aso.a;

public class ViewVeiculo {

	public static void main(String[] args) {

		// Criar a fabrica
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

//		GenericDAO<Veiculo, Integer> vdao = new GenericDAOImpl<Veiculo, Integer>(em){};

		VeiculoDAO vdao = new VeiculoDAOImpl(em);

		Veiculo v = new Veiculo(1, "ABC-1234", "Preto", 2019);

		// cadastrar
		try {
			vdao.cadastrar(v);
			vdao.commit();
			System.out.println("Cadastrado com sucesso! " + v.getVeiculo() + " " + v.getPlaca() 
				+ " " + v.getCor() + " " + v.getAno());
		} catch (CommitException e) {
			e.printStackTrace();
		}

		// pesquisar
		Veiculo busca = null;
		try {
			busca = vdao.pesquisar(v.getVeiculo());
			System.out.println("Código pesquisado: " + busca.getVeiculo());
		} catch (KeyNotFoundException e) {
			e.printStackTrace();
		}

		// atualizar
		String b1 = busca.getCor();
		busca.setCor("Prata");
		try {
			vdao.atualizar(busca);
			vdao.commit();
			System.out.println("Atualizado com sucesso! de: " + b1 + " para: " + busca.getCor());
		} catch (CommitException e) {
			e.printStackTrace();
		}

		// remover
		try {
			vdao.deletar(busca.getVeiculo());
			vdao.commit();
			System.out.println("Deletado com sucesso! Código: " + busca.getVeiculo());
		} catch (KeyNotFoundException | CommitException e) {
			e.printStackTrace();
		}

		// fechar conexões
		em.close();
		fabrica.close();
	}

}
