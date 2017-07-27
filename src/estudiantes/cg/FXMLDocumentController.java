/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes.cg;


import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author camilo.bahamon
 */
public class FXMLDocumentController implements Initializable {
    
    LinkedList<Estudiante> lista; 
    
    @FXML
    private Label lnombre;
    @FXML
    private Label lcodigo;
    @FXML
    private TextField tbnombre; 
    @FXML
    private TextField tbcodigo;      
    
    @FXML
    private void btaceptar(ActionEvent event) {
        
        String nombre=tbnombre.getText();
        String codigo=tbcodigo.getText();
        Estudiante objE=new Estudiante(nombre, codigo);
        boolean guardar= lista.add(objE);
        
        
        if (guardar){
            tbcodigo.setText(" ");
            tbnombre.setText(" ");      
     }
    } 
    private void btmostar(ActionEvent event) {
        String mostrar="";
        for (int i = 0; i < lista.size(); i++) {
            mostrar += lista.get(i)+"\n";
        }
       JOptionPane.showMessageDialog(null, mostrar);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lista=new LinkedList<>();
    }    
    
}
