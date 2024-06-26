package com.javagroup.maxconcessionaria.view;

import com.javagroup.maxconcessionaria.controller.MotorcycleController;
import com.javagroup.maxconcessionaria.model.Motorcycle;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScreenMotorUpdate extends javax.swing.JFrame {
    
    private final MotorcycleController motorcycleController;
    
    @Autowired
    public ScreenMotorUpdate(MotorcycleController motorcycleController) {
        this.motorcycleController = motorcycleController;
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextTitle = new javax.swing.JLabel();
        TextPlate = new javax.swing.JLabel();
        Plate = new javax.swing.JScrollPane();
        fieldPlate = new javax.swing.JTextPane();
        TextChassis = new javax.swing.JLabel();
        Chassis = new javax.swing.JScrollPane();
        fieldChassis = new javax.swing.JTextPane();
        TextBrand = new javax.swing.JLabel();
        Brand = new javax.swing.JScrollPane();
        fieldBrand = new javax.swing.JTextPane();
        TextModel = new javax.swing.JLabel();
        Model = new javax.swing.JScrollPane();
        fieldModel = new javax.swing.JTextPane();
        TextColor = new javax.swing.JLabel();
        Color = new javax.swing.JScrollPane();
        fieldColor = new javax.swing.JTextPane();
        TextYear = new javax.swing.JLabel();
        Year = new javax.swing.JScrollPane();
        fieldYear = new javax.swing.JTextPane();
        TextAvailable = new javax.swing.JLabel();
        boxAvailable = new javax.swing.JComboBox<>();
        ButtonUpdate = new javax.swing.JButton();
        ReturnButton6 = new javax.swing.JButton();
        TextAvailable1 = new javax.swing.JLabel();
        boxSaddlebag = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextTitle.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        TextTitle.setText("Atualização de Moto");

        TextPlate.setText("Placa:");

        Plate.setViewportView(fieldPlate);

        TextChassis.setText("Chassi:");

        Chassis.setViewportView(fieldChassis);

        TextBrand.setText("Marca:");

        Brand.setViewportView(fieldBrand);

        TextModel.setText("Modelo:");

        Model.setViewportView(fieldModel);

        TextColor.setText("Cor:");

        Color.setViewportView(fieldColor);

        TextYear.setText("Ano Fabricado:");

        Year.setViewportView(fieldYear);

        TextAvailable.setText("Disponível:");

        boxAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        ButtonUpdate.setText("Atualizar Moto");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        ReturnButton6.setText("Voltar");
        ReturnButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButton6ActionPerformed(evt);
            }
        });

        TextAvailable1.setText("Tem Alforge?:");

        boxSaddlebag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextModel)
                                    .addComponent(TextColor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextBrand, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextChassis, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextPlate, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Color)
                                    .addComponent(Brand)
                                    .addComponent(Model)
                                    .addComponent(Chassis)
                                    .addComponent(Plate, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextAvailable1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(boxSaddlebag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TextYear)
                                        .addComponent(TextAvailable))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(boxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 108, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 224, Short.MAX_VALUE)
                        .addComponent(ButtonUpdate)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ReturnButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextTitle)
                        .addGap(176, 176, 176))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPlate))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextChassis)
                    .addComponent(Chassis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextBrand))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextModel)
                    .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextColor)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAvailable1)
                    .addComponent(boxSaddlebag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonUpdate)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAvailable)
                            .addComponent(boxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        try {
            Boolean available = boxAvailable.getSelectedItem().equals("Sim");
        
            Boolean saddlebag = boxSaddlebag.getSelectedItem().equals("Sim");
        
            Motorcycle motorcycle = new Motorcycle(saddlebag, fieldPlate.getText(), fieldChassis.getText(), fieldBrand.getText(), fieldModel.getText(), fieldColor.getText(), Integer.valueOf(fieldYear.getText()), null, available);
        
            motorcycleController.update(motorcycle);
        }
        
        catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "TIPO DE DADO CADASTRADO ERRADO!", "ERRO NA ATUALIZAÇÃO DA MOTO", 0);
        }
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ReturnButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButton6ActionPerformed
        ScreenEmployeeMotorMenu screenEmployeeMotorMenu = ScreenEmployeeMotorMenu.geraScreenEmployeeMotorMenu();
        screenEmployeeMotorMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
                MotorcycleController motorcycleController = context.getBean(MotorcycleController.class);
                new ScreenMotorUpdate(motorcycleController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Brand;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JScrollPane Chassis;
    private javax.swing.JScrollPane Color;
    private javax.swing.JScrollPane Model;
    private javax.swing.JScrollPane Plate;
    private javax.swing.JButton ReturnButton6;
    private javax.swing.JLabel TextAvailable;
    private javax.swing.JLabel TextAvailable1;
    private javax.swing.JLabel TextBrand;
    private javax.swing.JLabel TextChassis;
    private javax.swing.JLabel TextColor;
    private javax.swing.JLabel TextModel;
    private javax.swing.JLabel TextPlate;
    private javax.swing.JLabel TextTitle;
    private javax.swing.JLabel TextYear;
    private javax.swing.JScrollPane Year;
    private javax.swing.JComboBox<String> boxAvailable;
    private javax.swing.JComboBox<String> boxSaddlebag;
    private javax.swing.JTextPane fieldBrand;
    private javax.swing.JTextPane fieldChassis;
    private javax.swing.JTextPane fieldColor;
    private javax.swing.JTextPane fieldModel;
    private javax.swing.JTextPane fieldPlate;
    private javax.swing.JTextPane fieldYear;
    // End of variables declaration//GEN-END:variables
}
