package view;

import model.MissingPerson;
import model.Suspect;
import service.DataManager;
import javax.swing.JOptionPane;

public class PersonFormFrame extends javax.swing.JFrame {
    private String tipe;

    public PersonFormFrame(String tipe) {
        initComponents();
        this.tipe = tipe;

        setSize(520, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        getContentPane().setBackground(new java.awt.Color(41, 0, 0));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/title1.gif")));
        if (tipe.equals("missing")) {
            lblTitle.setText(" - Create Missing");
            lblRisiko.setVisible(false);
            txtRisiko.setVisible(false);
        } else {
            lblTitle.setText(" - Create Buronan");
            lblRisiko.setVisible(true);
            txtRisiko.setVisible(true);
        }
        lblTitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
        lblTitle.setForeground(java.awt.Color.WHITE);

        lblId.setForeground(java.awt.Color.WHITE);
        lblNama.setForeground(java.awt.Color.WHITE);
        lblUmur.setForeground(java.awt.Color.WHITE);
        lblLokasi.setForeground(java.awt.Color.WHITE);
        lblCiri.setForeground(java.awt.Color.WHITE);
        lblStatus.setForeground(java.awt.Color.WHITE);
        lblRisiko.setForeground(java.awt.Color.WHITE);
        lblFotoPreview.setForeground(java.awt.Color.WHITE);

        txtId.setBackground(new java.awt.Color(55, 0, 0));
        txtId.setForeground(java.awt.Color.WHITE);
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 0, 0)));
        txtId.setCaretColor(java.awt.Color.WHITE);

        txtNama.setBackground(new java.awt.Color(55, 0, 0));
        txtNama.setForeground(java.awt.Color.WHITE);
        txtNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 0, 0)));
        txtNama.setCaretColor(java.awt.Color.WHITE);

        txtUmur.setBackground(new java.awt.Color(55, 0, 0));
        txtUmur.setForeground(java.awt.Color.WHITE);
        txtUmur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 0, 0)));
        txtUmur.setCaretColor(java.awt.Color.WHITE);

        txtCiri.setBackground(new java.awt.Color(55, 0, 0));
        txtCiri.setForeground(java.awt.Color.WHITE);
        txtCiri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 0, 0)));
        txtCiri.setCaretColor(java.awt.Color.WHITE);

        txtStatus.setBackground(new java.awt.Color(55, 0, 0));
        txtStatus.setForeground(java.awt.Color.WHITE);
        txtStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 0, 0)));
        txtStatus.setCaretColor(java.awt.Color.WHITE);

        txtRisiko.setBackground(new java.awt.Color(55, 0, 0));
        txtRisiko.setForeground(java.awt.Color.WHITE);
        txtRisiko.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 0, 0)));
        txtRisiko.setCaretColor(java.awt.Color.WHITE);

        txtFoto.setBackground(new java.awt.Color(55, 0, 0));
        txtFoto.setForeground(java.awt.Color.WHITE);
        txtFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 0, 0)));
        txtFoto.setCaretColor(java.awt.Color.WHITE);

        cmbLokasi.setBackground(new java.awt.Color(80, 0, 0));
        cmbLokasi.setForeground(java.awt.Color.WHITE);

        btnSave.setBackground(new java.awt.Color(80, 0, 0));
        btnSave.setForeground(java.awt.Color.WHITE);
        btnCancel.setBackground(new java.awt.Color(80, 0, 0));
        btnCancel.setForeground(java.awt.Color.WHITE);
        btnChooseFoto.setBackground(new java.awt.Color(80, 0, 0));
        btnChooseFoto.setForeground(java.awt.Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblUmur = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblLokasi = new javax.swing.JLabel();
        lblCiri = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblRisiko = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtUmur = new javax.swing.JTextField();
        txtCiri = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtRisiko = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblFotoPreview = new javax.swing.JLabel();
        btnChooseFoto = new javax.swing.JButton();
        txtFoto = new javax.swing.JTextField();
        cmbLokasi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("Create New Missing Person / Buronan");

        lblId.setText("ID");

        lblUmur.setText("Umur");

        lblNama.setText("Nama");

        lblLokasi.setText("Lokasi Terakhir");

        lblCiri.setText("Ciri-ciri");

        lblStatus.setText("Status");

        lblRisiko.setText("Risiko");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmurActionPerformed(evt);
            }
        });

        txtCiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiriActionPerformed(evt);
            }
        });

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtRisiko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRisikoActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnChooseFoto.setText("Choose Photo");
        btnChooseFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFotoActionPerformed(evt);
            }
        });

        txtFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFotoActionPerformed(evt);
            }
        });

        cmbLokasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semarang", "Jakarta", "Bandung",
                "Surabaya", "Yogyakarta", "Bekasi", "Depok", "Tangerang", "Bogor" }));
        cmbLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLokasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblUmur, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblLokasi)
                                                        .addComponent(lblCiri)
                                                        .addComponent(lblStatus)
                                                        .addComponent(lblRisiko)
                                                        .addComponent(btnSave))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(txtRisiko,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                151, Short.MAX_VALUE)
                                                                        .addComponent(txtStatus,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                151, Short.MAX_VALUE)
                                                                        .addComponent(txtId)
                                                                        .addComponent(txtNama)
                                                                        .addComponent(txtUmur)
                                                                        .addComponent(txtCiri)
                                                                        .addComponent(cmbLokasi, 0,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        33, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                        .addComponent(btnChooseFoto)
                                                                                        .addGap(11, 11, 11))
                                                                        .addComponent(lblFotoPreview,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                170,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                        .addComponent(txtFoto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                74,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(50, 50, 50))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(142, 142, 142)
                                                                .addComponent(btnCancel)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTitle)
                                        .addComponent(btnChooseFoto))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblId)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblNama)
                                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(16, 16, 16)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblUmur)
                                                        .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblLokasi)
                                                        .addComponent(cmbLokasi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblCiri)
                                                        .addComponent(txtCiri, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(lblFotoPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStatus)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblRisiko)
                                        .addComponent(txtRisiko, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFoto, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSave)
                                        .addComponent(btnCancel))
                                .addGap(16, 16, 16)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtIdActionPerformed
    }// GEN-LAST:event_txtIdActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNamaActionPerformed
    }// GEN-LAST:event_txtNamaActionPerformed

    private void txtUmurActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUmurActionPerformed
    }// GEN-LAST:event_txtUmurActionPerformed

    private void txtCiriActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCiriActionPerformed
    }// GEN-LAST:event_txtCiriActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtStatusActionPerformed
    }// GEN-LAST:event_txtStatusActionPerformed

    private void txtRisikoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtRisikoActionPerformed
    }// GEN-LAST:event_txtRisikoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
        String id = txtId.getText();
        String nama = txtNama.getText();
        String lokasi = cmbLokasi.getSelectedItem().toString();
        String ciri = txtCiri.getText();
        String status = txtStatus.getText();
        String fotoPath = txtFoto.getText();

        if (id.isEmpty() || nama.isEmpty() || lokasi.isEmpty() || ciri.isEmpty() || status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua data wajib diisi");
            return;
        }

        if (nama.length() < 3) {
            JOptionPane.showMessageDialog(this, "Nama minimal 3 karakter");
            return;
        }
        int umur;

        try {
            umur = Integer.parseInt(txtUmur.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Umur harus berupa angka");
            return;
        }

        if (umur < 1 || umur > 90) {
            JOptionPane.showMessageDialog(this, "Umur harus antara 1 sampai 90");
            return;
        }

        if (id.isEmpty() || nama.isEmpty() || lokasi.isEmpty() || status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data belum lengkap");
            return;
        }

        status = status.toLowerCase().trim();

        if (tipe.equals("missing")) {
            if (!status.equals("belum ketemu") && !status.equals("found")) {
                JOptionPane.showMessageDialog(this, "Status missing person harus 'belum ketemu' atau 'found'");
                return;
            }

            MissingPerson p = new MissingPerson(id, nama, umur, lokasi, ciri, status, fotoPath);
            DataManager.addMissing(p);

        } else {
            if (!status.equals("buron") && !status.equals("tertangkap")) {
                JOptionPane.showMessageDialog(this, "Status buronan harus 'buron' atau 'tertangkap'");
                return;
            }

            String risiko = txtRisiko.getText().trim();

            if (risiko.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Risiko belum diisi");
                return;
            }

            Suspect s = new Suspect(id, nama, umur, lokasi, ciri, risiko, status, fotoPath);
            DataManager.addSuspect(s);
        }

        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
        dispose();
    }// GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }// GEN-LAST:event_btnCancelActionPerformed

    private void btnChooseFotoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChooseFotoActionPerformed
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        int hasil = chooser.showOpenDialog(this);

        if (hasil == javax.swing.JFileChooser.APPROVE_OPTION) {
            String path = chooser.getSelectedFile().getAbsolutePath();
            txtFoto.setText(path);

            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(path);
            java.awt.Image img = icon.getImage().getScaledInstance(
                    lblFotoPreview.getWidth(),
                    lblFotoPreview.getHeight(),
                    java.awt.Image.SCALE_SMOOTH);

            lblFotoPreview.setText("");
            lblFotoPreview.setIcon(new javax.swing.ImageIcon(img));
        }
    }// GEN-LAST:event_btnChooseFotoActionPerformed

    private void txtFotoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFotoActionPerformed
    }// GEN-LAST:event_txtFotoActionPerformed

    private void cmbLokasiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cmbLokasiActionPerformed
    }// GEN-LAST:event_cmbLokasiActionPerformed

    public static void main(String args[]) {
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonFormFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonFormFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonFormFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonFormFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonFormFrame("missing").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChooseFoto;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbLokasi;
    private javax.swing.JLabel lblCiri;
    private javax.swing.JLabel lblFotoPreview;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblRisiko;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUmur;
    private javax.swing.JTextField txtCiri;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtRisiko;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
