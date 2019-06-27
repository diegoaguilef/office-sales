/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ArticleDAO;
import javax.swing.JOptionPane;
import models.Article;

/**
 *
 * @author diego
 */
public class ArticlesMaintainer extends javax.swing.JFrame {

    /**
     * Creates new form UsersMaintainer
     */
    public ArticlesMaintainer() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public void fillForm(Article article) {
        txtId.setText(String.valueOf(article.getId()));
        txtName.setText(article.getName());
        txtPrice.setText(String.valueOf(article.getPrice()));
        txtStock.setText(String.valueOf(article.getStock()));

    }

    public void clearForm() {
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
        txtStock.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stxTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnList = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        articlesList = new javax.swing.JTextArea();
        JButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stxTitle.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        stxTitle.setText("Mantenedor de Articulos");
        jPanel1.add(stxTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel1.setText("Nombre Artículo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 40, -1));

        jLabel2.setText("ID Artículo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, -1));

        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 40, -1));

        jLabel4.setText("Stock:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel5.setText("$");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        btnList.setText("Listar");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });
        jPanel1.add(btnList, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 90, -1));

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 90, -1));

        btnCreate.setText("Crear");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 90, -1));

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 90, -1));

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, -1));

        articlesList.setColumns(20);
        articlesList.setRows(5);
        jScrollPane1.setViewportView(articlesList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 380, 140));

        JButton1.setText("Salir");
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:

        articlesList.setText("");
        ArticleDAO.all().forEach((article) -> {
            articlesList.append(article.toString() + "\n");
        });
    }//GEN-LAST:event_btnListActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int id;
        Article article = null;
        if (!txtId.getText().equals("")) {
            id = Integer.parseInt(txtId.getText());
            article = ArticleDAO.find(id);
            if (article != null) {
                fillForm(article);
                JOptionPane.showMessageDialog(null, "Artículo Encontrado", "Buscar", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Artículo No Encontrado", "Buscar", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Id del artículo", "Buscar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int id, price, stock;
        String name;
        Article article = null;
        if (!txtId.getText().equals("") 
                && !txtName.getText().equals("")
                && !txtPrice.getText().equals("")
                && !txtStock.getText().equals("")) {
            id = Integer.parseInt(txtId.getText());
            name = txtName.getText();
            price = Integer.parseInt(txtPrice.getText());
            stock = Integer.parseInt(txtStock.getText());
            article = new Article(id, name, price, stock);
            if (ArticleDAO.update(article)) {
                clearForm();
                JOptionPane.showMessageDialog(null, "Artículo Editado", "Editar", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Artículo No Encontrado", "Editar", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos del artículo", "Editar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        int id, price, stock;
        String name;
        Article article = null;
        if (!txtId.getText().equals("") 
                && !txtName.getText().equals("")
                && !txtPrice.getText().equals("")
                && !txtStock.getText().equals("")) {
            id = Integer.parseInt(txtId.getText());
            name = txtName.getText();
            price = Integer.parseInt(txtPrice.getText());
            stock = Integer.parseInt(txtStock.getText());
            article = new Article(id, name, price, stock);
            if (ArticleDAO.create(article)) {
                clearForm();
                JOptionPane.showMessageDialog(null, "Artículo Creado", "Crear", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear Artículo: Id ya existe", "Crear", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos del artículo", "Crear", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id;
        if (!txtId.getText().equals("")) {
            id = Integer.parseInt(txtId.getText());
            if (ArticleDAO.delete(id)) {
                clearForm();
                JOptionPane.showMessageDialog(null, "Artículo eliminado", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Artículo No Encontrado", "Eliminar", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Id del artículo", "Eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_JButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArticlesMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArticlesMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArticlesMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArticlesMaintainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArticlesMaintainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea articlesList;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton JButton1;
    private javax.swing.JLabel stxTitle;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
