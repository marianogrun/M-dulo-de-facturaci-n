package facturacionfoobar;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import vistas.VistaCarga;
import vistas.VistaPrincipal;
import vistas.VistaVenta;

public class Controlador {

    private VistaPrincipal vp;
    private VistaCarga vc;
    private VistaVenta vv;
    private Modelo m;

    public void iniciar() {
        this.vp = new VistaPrincipal();
        this.m= new Modelo ();
        this.vp.cargarAccionDeBotonEntrar(new ManejadorBotonEntrarVP());
        this.vp.cargarAccionDeBotonVender(new ManejadorBotonVenderVP());
        this.vp.cargarAccionDeBotonCargar(new ManejadorBotonCargarVP());
        this.vp.cargarBotonUsuario(new ManejadorBotonUsuario());
        this.vp.cargarBotonClave(new ManejadorBotonClave());
        
        this.vp.iniciarVista();

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////// MANEJADORES PARA CADA ACCION //////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private class ManejadorBotonEntrarVP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           if (vp.obtenerNombreDeUsuario().equals("admin")&&vp.obtenerNombreClave().equals("codo2017")){
               vp.mostrarJPanel();
           }else {
               GUI.mostrarCartel("Usuario y/o clave incorrectos", "Datos incorrectos", 0);
           }
               
        }
    }

    private class ManejadorBotonVenderVP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
             vv = new VistaVenta();
            vv.cargarAccionDeBotonVender(new ManejadorBotonVenderVV());
            vv.cargarAccionDeBotonCancelar(new ManejadorBotonCancelarVV());
            vv.iniciarVista();
            vv.setCantidadesCarne(vp.obtenerValorEmpCarne());
            vv.setCantidadesPollo(vp.obtenerValorEmpPollo());
            vv.setCantidadesJamon(vp.obtenerValorEmpJamon());
            vv.setCantidadesManteca(vp.obtenerValorMedialunasManteca());
            vv.setCantidadesGrasa(vp.obtenerValorMedialunasGrasa());
        }
    }

    private class ManejadorBotonCargarVP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vc=new VistaCarga();
            vc.cargarAccionDeBotonCargar(new ManejadorBotonCargarVC());
            vc.cargarAccionDeBotonCancelar(new ManejadorBotonCancelarVC());
            vc.iniciarVista();
            vc.setCantidadesCarne(vp.obtenerValorEmpCarne());
            vc.setCantidadesPollo(vp.obtenerValorEmpPollo());
            vc.setCantidadesJamon(vp.obtenerValorEmpJamon());
            vc.setCantidadesManteca(vp.obtenerValorMedialunasManteca());
            vc.setCantidadesGrasa(vp.obtenerValorMedialunasGrasa());
        }
    }

    private class ManejadorBotonCargarVC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
    
            //m.cargar();
            vp.subirValorEmpCarne(vc.cargarEmpCarne());
            vp.subirValorEmpPollo(vc.cargarEmpPollo());
            vp.subirValorEmpJamonYQueso(vc.cargarEmpJamonYQueso());
            vp.subirValorMedialunasManteca(vc.cargarMedialunasDeManteca());
            vp.subirValorMedialunasDeGrasa(vc.cargarMedialunasDeGrasa());
            vc.setCantidadesCarne(vp.obtenerValorEmpCarne());
            vc.setCantidadesPollo(vp.obtenerValorEmpPollo());
            vc.setCantidadesJamon(vp.obtenerValorEmpJamon());
            vc.setCantidadesManteca(vp.obtenerValorMedialunasManteca());
            vc.setCantidadesGrasa(vp.obtenerValorMedialunasGrasa());
            vc.dispose();
        }
    }

    private class ManejadorBotonCancelarVC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vc.dispose();
        }
    }

    private class ManejadorBotonVenderVV implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vp.bajarValorEmpCarne(vv.descontarEmpCarne());
            vp.bajarValorEmpPollo(vv.descontarEmpPollo());
            vp.bajarValorEmpJamonYQueso(vv.descontarEmpJamonYQueso());
            vp.bajarValorMedialunaManteca(vv.descontarMedialunasManteca());
            vp.bajarValorMedialunaGrasa(vv.descontarMedialunasGrasa());
             vv.setCantidadesCarne(vp.obtenerValorEmpCarne());
            vv.setCantidadesPollo(vp.obtenerValorEmpPollo());
            vv.setCantidadesJamon(vp.obtenerValorEmpJamon());
            vv.setCantidadesManteca(vp.obtenerValorMedialunasManteca());
            vv.setCantidadesGrasa(vp.obtenerValorMedialunasGrasa());
            vv.dispose();
        }
    }

    private class ManejadorBotonCancelarVV implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vv.dispose();
        }
    }

    private class ManejadorBotonUsuario implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            
           if (vp.obtenerNombreDeUsuario().equals("Usuario")){
               vp.establecerNombreDeUsuario("");
               vp.pintarCadenaUsuario(Color.BLACK);
           }

        }

        @Override
        public void focusLost(FocusEvent e) {
            if (vp.obtenerNombreDeUsuario().isEmpty()){
               vp.establecerNombreDeUsuario("Usuario");
               vp.pintarCadenaUsuario(Color.GRAY);
           }

        }

    }

    private class ManejadorBotonClave implements FocusListener {
         String encriptada=vp.obtenerNombreClave();
        @Override
        public void focusGained(FocusEvent e) {
           
            if (vp.obtenerNombreClave().equals(encriptada)){
               vp.establecerNombreClave("");
               vp.pintarCadenaClave(Color.BLACK);
           }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (vp.obtenerNombreClave().isEmpty()){
               vp.establecerNombreClave(encriptada);
               vp.pintarCadenaClave(Color.GRAY);
           }
        }

    }
}
