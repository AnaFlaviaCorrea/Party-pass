package br.com.tela;

import br.com.dao.HibernateUtil;
import br.com.dao.ProdutoDao;
import br.com.dao.ProdutoDaoImpl;
import br.com.entidade.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PesquisarProduto extends javax.swing.JFrame {

    private List<Produto> produtos;
    private Produto produto;
    private final ProdutoDao produtoDao = new ProdutoDaoImpl();
    private Session sessao;

    public PesquisarProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_filtro = new javax.swing.JLabel();
        varPesquisa = new javax.swing.JComboBox<>();
        varProduto = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        lb_Logo = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        lb_titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Produto");
        setResizable(false);

        lb_filtro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_filtro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_filtro.setText("Selecione um filtro:");

        varPesquisa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        varPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um filtro...", "Código", "Nome", "Tipo" }));

        btPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        btPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(153, 153, 153));
        btAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        tbProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Código Produto", "Nome", "Tipo", "Valor"
            }
        ));
        tbProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbProduto.setName(""); // NOI18N
        tbProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbProduto);

        lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Logo PartyPass I.png"))); // NOI18N

        jPanelTitulo.setBackground(new java.awt.Color(153, 153, 153));

        lb_titulo1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo1.setText("Pesquisar Produto");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lb_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_filtro)
                        .addGap(18, 18, 18)
                        .addComponent(varPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_filtro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(varPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(varProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisar)
                        .addComponent(btAlterar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if (validarPesquisa()) {
            String termoPesquisa = varProduto.getText().trim();
            int opcaoFiltro = varPesquisa.getSelectedIndex();
            try (Session sessao = HibernateUtil.abrirConexao()) {
                switch (opcaoFiltro) {
                    case 0:
                        produtos = produtoDao.pesquisarTodos(sessao);
                        break;
                    case 1:
                        produtos = produtoDao.pesquisarPorCodigo(termoPesquisa, sessao);
                        if (produtos.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum produto com esse código!");
                        }
                        break;
                    case 2:
                        produtos = produtoDao.pesquisarPorNome(termoPesquisa, sessao);
                        break;
                    case 3:
                        produtos = produtoDao.pesquisarPorTipo(termoPesquisa, sessao);
                        if (produtos.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum produto encontrado!");
                        } else {
                            carregarTabelaProduto();
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Opção de filtro inválida: " + opcaoFiltro);
                }
                carregarTabelaProduto();
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void carregarTabelaProduto() {
        DefaultTableModel defaultTable = (DefaultTableModel) tbProduto.getModel();
        defaultTable.setNumRows(0);
        produtos.stream()
                .forEach(produto -> {
                    defaultTable.addRow(new Object[]{
                        produto.getId(),
                        produto.getCodigo(),
                        produto.getNome(),
                        produto.getTipo(),
                        produto.getValor(),});
                });
    }

    private boolean validarPesquisa() {
        if (varProduto.getText().trim().length() > 30) {
            JOptionPane.showMessageDialog(null, "Valor de filtro não pode ultrapassar 30 caracteres!");
            return false;
        } else if (!validarFiltro()) {
            return false;
        }
        return true;
    }

    private boolean validarFiltro() {
        int opcaoPesquisa = varPesquisa.getSelectedIndex();
        String valorFiltro = varProduto.getText().trim();
        if (opcaoPesquisa == 1 && valorFiltro.length() < 1) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 1 caracteres para pesquisar pelo código!");
            return false;
        } else if (opcaoPesquisa == 2 && valorFiltro.length() < 3) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 3 caracteres para pesquisar por nome!");
            return false;
        } else if (opcaoPesquisa == 3 && valorFiltro.length() < 1) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 3 caracteres para pesquisar por tipo!");
            return false;
        }
        return true;
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (tbProduto.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar!");
        } else {
            new CadastrarProduto(produtos.get(tbProduto.getSelectedRow())).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lb_filtro;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JComboBox<String> varPesquisa;
    private javax.swing.JTextField varProduto;
    // End of variables declaration//GEN-END:variables
}
