package br.com.tela;

import br.com.dao.ClienteDao;
import br.com.dao.ClienteDaoImpl;
import br.com.dao.HibernateUtil;
import br.com.dao.ProdutoDao;
import br.com.dao.ProdutoDaoImpl;
import br.com.entidade.Cliente;
import br.com.entidade.Produto;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class RealizarConsumo extends javax.swing.JFrame {

    private Session sessao;

    private Cliente cliente;
    private ClienteDao clienteDao = new ClienteDaoImpl();
    private List<Cliente> clientes;

    private List<Produto> produtos;
    private Produto produto;
    private ProdutoDao produtoDao = new ProdutoDaoImpl();

    public RealizarConsumo() {
        initComponents();
        btOkProduto.setVisible(false);
        btOkQuantidade.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_numero_comanda = new javax.swing.JLabel();
        varNumeroComanda = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        lb_cliente = new javax.swing.JLabel();
        varCliente = new javax.swing.JLabel();
        lb_codigo_produto = new javax.swing.JLabel();
        varCodigoProduto = new javax.swing.JTextField();
        btOkProduto = new javax.swing.JButton();
        lb_nome_produto = new javax.swing.JLabel();
        varNomeProduto = new javax.swing.JLabel();
        lb_valor_produto = new javax.swing.JLabel();
        varValorProduto = new javax.swing.JLabel();
        lb_quantidade = new javax.swing.JLabel();
        varQuantidade = new javax.swing.JTextField();
        lb_unidade = new javax.swing.JLabel();
        btOkQuantidade = new javax.swing.JButton();
        lb_total = new javax.swing.JLabel();
        varTotal = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        jPanelTitulo1 = new javax.swing.JPanel();
        lb_titulo1 = new javax.swing.JLabel();
        lb_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Consumo");

        lb_numero_comanda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_numero_comanda.setText("NÚMERO DA COMANDA");

        varNumeroComanda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        varNumeroComanda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        varNumeroComanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                varNumeroComandaKeyPressed(evt);
            }
        });

        btPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        btPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        lb_cliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cliente.setText("Cliente:");

        varCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_codigo_produto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_codigo_produto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_codigo_produto.setText("Código do Produto:");

        varCodigoProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        varCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                varCodigoProdutoKeyPressed(evt);
            }
        });

        btOkProduto.setBackground(new java.awt.Color(153, 153, 153));
        btOkProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btOkProduto.setText("Buscar");
        btOkProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkProdutoActionPerformed(evt);
            }
        });

        lb_nome_produto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nome_produto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome_produto.setText("Nome do Produto:");

        varNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_valor_produto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_valor_produto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_produto.setText("Valor do Produto:");

        varValorProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_quantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_quantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_quantidade.setText("Quantidade:");

        varQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        varQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                varQuantidadeKeyPressed(evt);
            }
        });

        lb_unidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_unidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_unidade.setText("Unidade(s)");

        btOkQuantidade.setBackground(new java.awt.Color(153, 153, 153));
        btOkQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btOkQuantidade.setText("OK");
        btOkQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkQuantidadeActionPerformed(evt);
            }
        });

        lb_total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_total.setText("Total:");

        varTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        btConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        jPanelTitulo1.setBackground(new java.awt.Color(153, 153, 153));

        lb_titulo1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo1.setText("Realizar Consumação");

        javax.swing.GroupLayout jPanelTitulo1Layout = new javax.swing.GroupLayout(jPanelTitulo1);
        jPanelTitulo1.setLayout(jPanelTitulo1Layout);
        jPanelTitulo1Layout.setHorizontalGroup(
            jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitulo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanelTitulo1Layout.setVerticalGroup(
            jPanelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitulo1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lb_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Logo PartyPass I.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lb_Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btConfirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(lb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lb_codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lb_valor_produto)
                                    .addComponent(lb_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(varCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(varCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btOkProduto))
                                            .addComponent(varTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(varValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(varQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lb_unidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btOkQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 230, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lb_numero_comanda)
                                .addGap(18, 18, 18)
                                .addComponent(varNumeroComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btPesquisar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varNumeroComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_numero_comanda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btPesquisar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(varCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btOkProduto))
                    .addComponent(lb_codigo_produto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nome_produto)
                    .addComponent(varNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_valor_produto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_quantidade)
                    .addComponent(lb_unidade)
                    .addComponent(btOkQuantidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_total))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String termoPesquisa = varNumeroComanda.getText().trim();
        try {
            sessao = HibernateUtil.abrirConexao();
            clientes = clienteDao.pesquisarId(Long.valueOf(termoPesquisa), sessao);
            if (clientes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum cliente com esse código!");
            } else {
                clientes.add(cliente);
                varCliente.setText(clientes.get(0).getNome());
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar o cliente: " + ex.getMessage());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btOkQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkQuantidadeActionPerformed
        String valor = varQuantidade.getText().trim();
        try {
            sessao = HibernateUtil.abrirConexao();
            varTotal.setText(String.valueOf(Double.valueOf(produtos.get(0).getValor()) * Double.valueOf(valor)));

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btOkQuantidadeActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed

        try {
            double saldo = clientes.get(0).getSaldo();
            sessao = HibernateUtil.abrirConexao();
            double total = Double.valueOf(varTotal.getText().trim());

            if (saldo < total) {
                JOptionPane.showMessageDialog(null, "Compra não permitida! Saldo inferior ao valor da venda");
            } else {
                double atualizado = saldo - total;
                clientes.get(0).setSaldo(atualizado);
                clienteDao.salvarOuAlterar(clientes.get(0), sessao);
                dispose();
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void varCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varCodigoProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btOkProdutoActionPerformed(null);
        }
    }//GEN-LAST:event_varCodigoProdutoKeyPressed

    private void btOkProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkProdutoActionPerformed
        if (validarPesquisa()) {
            String termoPesquisa = varCodigoProduto.getText().trim();
            try {
                sessao = HibernateUtil.abrirConexao();
                produtos = produtoDao.pesquisarPorCodigo(termoPesquisa, sessao);
                if (produtos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum produto com esse código!");
                } else {
                    produtos.add(produto);

                    varNomeProduto.setText(produtos.get(0).getNome());
                    varValorProduto.setText(String.valueOf(produtos.get(0).getValor()));
                }
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btOkProdutoActionPerformed

    private void varQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btOkQuantidadeActionPerformed(null);
        }
    }//GEN-LAST:event_varQuantidadeKeyPressed

    private void varNumeroComandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varNumeroComandaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btPesquisarActionPerformed(null);
        }
    }//GEN-LAST:event_varNumeroComandaKeyPressed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "Você fechará esta janela");
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private boolean validarPesquisa() {
        if (varCodigoProduto.getText().trim().length() > 10) {
            JOptionPane.showMessageDialog(null, "Valor de filtro não pode ultrapassar 10 caracteres!");
            return false;
        } else if (!validarFiltro()) {
            return false;
        }
        return true;
    }

    private boolean validarFiltro() {
        String valorFiltro = varCodigoProduto.getText().trim();
        if (valorFiltro.length() < 1) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 1 caracteres para pesquisar pelo código!");
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btOkProduto;
    private javax.swing.JButton btOkQuantidade;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_codigo_produto;
    private javax.swing.JLabel lb_nome_produto;
    private javax.swing.JLabel lb_numero_comanda;
    private javax.swing.JLabel lb_quantidade;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_unidade;
    private javax.swing.JLabel lb_valor_produto;
    private javax.swing.JLabel varCliente;
    private javax.swing.JTextField varCodigoProduto;
    private javax.swing.JLabel varNomeProduto;
    private javax.swing.JTextField varNumeroComanda;
    private javax.swing.JTextField varQuantidade;
    private javax.swing.JLabel varTotal;
    private javax.swing.JLabel varValorProduto;
    // End of variables declaration//GEN-END:variables
}
