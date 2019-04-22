package vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelFacturacion = new javax.swing.JPanel();
        jLabelCarne = new javax.swing.JLabel();
        jLabelPollo = new javax.swing.JLabel();
        jLabelJamon = new javax.swing.JLabel();
        jLabelGrasa = new javax.swing.JLabel();
        jLabelManteca = new javax.swing.JLabel();
        jProgressBarCarne = new javax.swing.JProgressBar();
        jProgressBarPollo = new javax.swing.JProgressBar();
        jProgressBarJamon = new javax.swing.JProgressBar();
        jProgressBarManteca = new javax.swing.JProgressBar();
        jProgressBarGrasa = new javax.swing.JProgressBar();
        jButtonVender = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema FooBar");
        setBackground(new java.awt.Color(217, 200, 184));
        setResizable(false);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N

        jTextFieldUsuario.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsuario.setText("Usuario");
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusLost(evt);
            }
        });

        jPasswordFieldClave.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPasswordFieldClave.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldClave.setText("12345678");

        jButtonEntrar.setBackground(new java.awt.Color(218, 193, 159));
        jButtonEntrar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonEntrar.setText("ENTRAR");

        jLabelCarne.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCarne.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCarne.setText("Empanadas de carne:");
        jLabelCarne.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelPollo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPollo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPollo.setText("Empanadas de pollo:");
        jLabelPollo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelJamon.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelJamon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelJamon.setText("Empanadas de J y Q:");
        jLabelJamon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelGrasa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelGrasa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGrasa.setText("Medialunas de grasa:");
        jLabelGrasa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelManteca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelManteca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelManteca.setText("Medialunas de manteca:");
        jLabelManteca.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jProgressBarCarne.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarCarne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarCarne.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarCarne.setMaximum(60);
        jProgressBarCarne.setToolTipText("");
        jProgressBarCarne.setValue(44);
        jProgressBarCarne.setString("cant de MAX");
        jProgressBarCarne.setStringPainted(true);

        jProgressBarPollo.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarPollo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarPollo.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarPollo.setMaximum(60);
        jProgressBarPollo.setValue(31);
        jProgressBarPollo.setString("cant de MAX");
        jProgressBarPollo.setStringPainted(true);

        jProgressBarJamon.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarJamon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarJamon.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarJamon.setMaximum(60);
        jProgressBarJamon.setValue(58);
        jProgressBarJamon.setString("cant de MAX");
        jProgressBarJamon.setStringPainted(true);

        jProgressBarManteca.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarManteca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarManteca.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarManteca.setMaximum(120);
        jProgressBarManteca.setValue(50);
        jProgressBarManteca.setString("cant de MAX");
        jProgressBarManteca.setStringPainted(true);

        jProgressBarGrasa.setBackground(new java.awt.Color(218, 193, 159));
        jProgressBarGrasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarGrasa.setForeground(new java.awt.Color(149, 120, 99));
        jProgressBarGrasa.setMaximum(120);
        jProgressBarGrasa.setValue(43);
        jProgressBarGrasa.setString("cant de MAX");
        jProgressBarGrasa.setStringPainted(true);

        jButtonVender.setBackground(new java.awt.Color(218, 193, 159));
        jButtonVender.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonVender.setText("VENDER");

        jButtonCargar.setBackground(new java.awt.Color(218, 193, 159));
        jButtonCargar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonCargar.setText("CARGAR STOCK");

        javax.swing.GroupLayout jPanelFacturacionLayout = new javax.swing.GroupLayout(jPanelFacturacion);
        jPanelFacturacion.setLayout(jPanelFacturacionLayout);
        jPanelFacturacionLayout.setHorizontalGroup(
            jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFacturacionLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBarCarne, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jProgressBarPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarJamon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarManteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarGrasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFacturacionLayout.createSequentialGroup()
                            .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                            .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelManteca, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
                        .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                            .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCarne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelJamon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(300, 300, 300)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelFacturacionLayout.setVerticalGroup(
            jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBarCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarJamon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarManteca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFacturacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelCarne)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelPollo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelJamon)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelManteca)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelGrasa)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(jPanelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLogo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addComponent(jPanelFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained

    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jTextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioFocusLost

    public void iniciarVista() {
        this.setLocationRelativeTo(null); // Aparecerá en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // La aplicación por defecto se cierra al tocar la cruz
        this.establecerIcono(); // OPCIONAL. Personaliza el ícono de la ventana
        this.jButtonEntrar.requestFocus(); // El foco inicial estará por defecto sobre el botón "Entrar"
        this.setVisible(true); // Hace la ventana visible
        this.jPanelFacturacion.setVisible(false);
    }

    private void establecerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/DibujoCaemci.png"));
        setIconImage(icon);
    }

    public String obtenerNombreDeUsuario() {
        return jTextFieldUsuario.getText();
    }

    public void establecerNombreDeUsuario(String text) {
        this.jTextFieldUsuario.setText(text);
    }

    public void cargarBotonUsuario(FocusListener fl) {
        this.jTextFieldUsuario.addFocusListener(fl);
    }

    public void cargarBotonClave(FocusListener fl) {
        this.jPasswordFieldClave.addFocusListener(fl);
    }

    public String obtenerNombreClave() {
        return String.valueOf(this.jPasswordFieldClave.getPassword());
    }

    public void establecerNombreClave(String text) {
        this.jPasswordFieldClave.setText(text);
    }

    public void pintarCadenaUsuario(Color color) {
        this.jTextFieldUsuario.setForeground(color);
    }

    public void pintarCadenaClave(Color color) {
        this.jPasswordFieldClave.setForeground(color);
    }

    public void cargarAccionDeBotonEntrar(ActionListener al) {
        this.jButtonEntrar.addActionListener(al);
    }

    public void cargarAccionDeBotonVender(ActionListener al) {
        this.jButtonVender.addActionListener(al);
    }

    public void cargarAccionDeBotonCargar(ActionListener al) {
        this.jButtonCargar.addActionListener(al);
    }

    public void mostrarJPanel() {

        this.jPanelFacturacion.setVisible(true);
        this.jProgressBarCarne.setString(this.jProgressBarCarne.getValue()+" de "+this.jProgressBarCarne.getMaximum());
        this.jProgressBarPollo.setString(this.jProgressBarPollo.getValue()+" de "+this.jProgressBarPollo.getMaximum());
        this.jProgressBarJamon.setString(this.jProgressBarJamon.getValue()+" de "+this.jProgressBarJamon.getMaximum());
        this.jProgressBarManteca.setString(this.jProgressBarManteca.getValue()+" de "+this.jProgressBarManteca.getMaximum());
        this.jProgressBarGrasa.setString(this.jProgressBarGrasa.getValue()+" de "+this.jProgressBarGrasa.getMaximum());
    }
    public void subirValorEmpCarne (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarCarne.getValue()+cantidad;
        this.jProgressBarCarne.setValue(valorTotal);
        this.jProgressBarCarne.setString(this.jProgressBarCarne.getValue()+" de "+this.jProgressBarCarne.getMaximum());
        
        
       
    }
    
    public void subirValorEmpPollo (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarPollo.getValue()+cantidad;
        this.jProgressBarPollo.setValue(valorTotal);
        this.jProgressBarPollo.setString(this.jProgressBarPollo.getValue()+" de "+this.jProgressBarPollo.getMaximum());
        
        
    }
    public void subirValorEmpJamonYQueso (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarJamon.getValue()+cantidad;
        this.jProgressBarJamon.setValue(valorTotal);
        this.jProgressBarJamon.setString(this.jProgressBarJamon.getValue()+" de "+this.jProgressBarJamon.getMaximum());
        
        
    }
    public void subirValorMedialunasManteca (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarManteca.getValue()+cantidad;
        this.jProgressBarManteca.setValue(valorTotal);
        this.jProgressBarManteca.setString(this.jProgressBarManteca.getValue()+" de "+this.jProgressBarManteca.getMaximum());
        
        
    }
    public void subirValorMedialunasDeGrasa (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarGrasa.getValue()+cantidad;
        this.jProgressBarGrasa.setValue(valorTotal);
        this.jProgressBarGrasa.setString(this.jProgressBarGrasa.getValue()+" de "+this.jProgressBarGrasa.getMaximum());
        
       
    }
    
    public void bajarValorEmpCarne (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarCarne.getValue()-cantidad;
        this.jProgressBarCarne.setValue(valorTotal);
        this.jProgressBarCarne.setString(this.jProgressBarCarne.getValue()+" de "+this.jProgressBarCarne.getMaximum());
        
        
    }
    public void bajarValorEmpPollo (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarPollo.getValue()-cantidad;
        this.jProgressBarPollo.setValue(valorTotal);
        this.jProgressBarPollo.setString(this.jProgressBarPollo.getValue()+" de "+this.jProgressBarPollo.getMaximum());
        
        
    }
    public void bajarValorEmpJamonYQueso (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarJamon.getValue()-cantidad;
        this.jProgressBarJamon.setValue(valorTotal);
        this.jProgressBarJamon.setString(this.jProgressBarJamon.getValue()+" de "+this.jProgressBarJamon.getMaximum());
        
        
    }
    public void bajarValorMedialunaManteca (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarManteca.getValue()-cantidad;
        this.jProgressBarManteca.setValue(valorTotal);
        this.jProgressBarManteca.setString(this.jProgressBarManteca.getValue()+" de "+this.jProgressBarManteca.getMaximum());
        
        
    }
    public void bajarValorMedialunaGrasa (int cantidad){
        int valorTotal;
        valorTotal=this.jProgressBarGrasa.getValue()-cantidad;
        this.jProgressBarGrasa.setValue(valorTotal);
        this.jProgressBarGrasa.setString(this.jProgressBarGrasa.getValue()+" de "+this.jProgressBarGrasa.getMaximum());
        
        
    }
    public int obtenerValorEmpCarne(){
        return this.jProgressBarCarne.getValue();
    }
    public int obtenerValorEmpPollo(){
        return this.jProgressBarPollo.getValue();
    }
    public int obtenerValorEmpJamon(){
        return this.jProgressBarJamon.getValue();
    }
    public int obtenerValorMedialunasManteca(){
        return this.jProgressBarManteca.getValue();
    }
    public int obtenerValorMedialunasGrasa(){
        return this.jProgressBarGrasa.getValue();
    }
    
    public int obtenerValorMaximoCarne(){
        return this.jProgressBarCarne.getMaximum();
    }
    
     public int obtenerValorMaximoEmpPollo(){
        return this.jProgressBarPollo.getMaximum();
    }
    public int obtenerValorMaximoEmpJamon(){
        return this.jProgressBarJamon.getMaximum();
    }
    public int obtenerValorMaximoMedialunasManteca(){
        return this.jProgressBarManteca.getMaximum();
    }
    public int obtenerValorMaximoMedialunasGrasa(){
        return this.jProgressBarGrasa.getMaximum();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelCarne;
    private javax.swing.JLabel jLabelGrasa;
    private javax.swing.JLabel jLabelJamon;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelManteca;
    private javax.swing.JLabel jLabelPollo;
    private javax.swing.JPanel jPanelFacturacion;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JProgressBar jProgressBarCarne;
    private javax.swing.JProgressBar jProgressBarGrasa;
    private javax.swing.JProgressBar jProgressBarJamon;
    private javax.swing.JProgressBar jProgressBarManteca;
    private javax.swing.JProgressBar jProgressBarPollo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
