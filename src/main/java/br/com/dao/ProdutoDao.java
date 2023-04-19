package br.com.dao;

import br.com.entidade.Produto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public interface ProdutoDao extends BaseDao<Produto, Long> {

    List<Produto> pesquisarPorCodigo(String codigo, Session sessao) throws HibernateException;

    List<Produto> pesquisarPorNome(String nome, Session sessao) throws HibernateException;

    List<Produto> pesquisarPorTipo(String tipo, Session sessao) throws HibernateException;

    List<Produto> pesquisarTodos(Session sessao) throws HibernateException;
}
