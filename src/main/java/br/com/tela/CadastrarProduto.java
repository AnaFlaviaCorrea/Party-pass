package br.com.tela;

import br.com.dao.HibernateUtil;
import br.com.dao.ProdutoDao;
import br.com.dao.ProdutoDaoImpl;
import br.com.entidade.Produto;
import br.com.exceptions.ProdutoAtivoException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CadastrarProduto extends javax.swing.JFrame {

    private Produto produto;
    private final ProdutoDao produtoDao = new ProdutoDaoImpl();
    private Session sessao;

    public CadastrarProduto() {
        initComponents();
    }

    public CadastrarProduto(Produto produto) {
        initComponents();
        this.produto = produto;
        varCodigo.setText(produto.getCodigo());
        varNome.setText(produto.getNome());
        varTipo.setSelectedItem(produto.getTipo());
        varValor.setText(String.valueOf(produto.getValor()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_Logo = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        varCodigo = new javax.swing.JTextField();
        varTipo = new javax.swing.JComboBox<>();
        varValor = new javax.swing.JTextField();
        lb_codigo = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        lb_nome = new javax.swing.JLabel();
        lb_tipo = new javax.swing.JLabel();
        lb_valor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setResizable(false);

        lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Logo PartyPass I.png"))); // NOI18N

        jPanelTitulo.setBackground(new java.awt.Color(153, 153, 153));

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Cadastrar Produtos");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        varTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um tipo...", "Bebida", "Comida", "Outros" }));
        varTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTipoActionPerformed(evt);
            }
        });

        lb_codigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_codigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_codigo.setText("Código Produto:");

        lb_nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        lb_tipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tipo.setText("Tipo de Produto:");

        lb_valor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_valor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor.setText("Valor:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(lb_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_codigo)
                                .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1)))
                    .addComponent(lb_tipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varValor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 111, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_codigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tipo))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTipoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if (validarFormulario()) {
            if (produto == null) {
                produto = new Produto();
            }
        }
        carregarFormulario();
        try {
            sessao = HibernateUtil.abrirConexao();
            produtoDao.salvarOuAlterar(produto, sessao);
            JOptionPane.showMessageDialog(null, "Produto criado/alterado com sucesso!\n"
                    + "O código do seu produto é " + produto.getCodigo());
            this.dispose();
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto!");
        } finally {
            sessao.close();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void carregarFormulario() {
        produto.setCodigo(varCodigo.getText().trim());
        produto.setNome(varNome.getText().trim());
        produto.setTipo((String) varTipo.getSelectedItem());
        produto.setValor(Double.valueOf(varValor.getText().trim()));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    private boolean validarFormulario() {
        if (varTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um tipo de produto!");
            return false;
        } else if (varCodigo.getText().trim().length() < 4) {
            JOptionPane.showMessageDialog(null, "O código do produto deve ter no mínimo 4 caracteres!");
            return false;
        } else if (varNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do produto!");
            return false;
        } else if (varValor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o valor do produto!");
            return false;
        } else if (varNome.getText().trim().length() < 6) {
            JOptionPane.showMessageDialog(null, "O nome do produto deve ter no mínimo 6 caracteres!");
            return false;
        }

        sessao = HibernateUtil.abrirConexao();
        List<Produto> codigosProdutos = produtoDao.pesquisarPorCodigo(varCodigo.getText().trim(), sessao);
        for (Produto produto : codigosProdutos) {
            if (produto.getCodigo().equals(varCodigo.getText().trim())) {
                JOptionPane.showMessageDialog(null, "O código do produto já existe no sistema!");
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_valor;
    private javax.swing.JTextField varCodigo;
    private javax.swing.JTextField varNome;
    private javax.swing.JComboBox<String> varTipo;
    private javax.swing.JTextField varValor;
    // End of variables declaration//GEN-END:variables
}
