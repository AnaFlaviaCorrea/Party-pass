package br.com.dao;

import br.com.entidade.Cliente;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public interface ClienteDao extends BaseDao<Cliente, Long> {

    List<Cliente> pesquisarPorNome(String nome, Session sessao) throws HibernateException;

    List<Cliente> pesquisarTodos(Session sessao) throws HibernateException;

    Cliente logar(String login, String senha, Session sessao) throws HibernateException;
}
