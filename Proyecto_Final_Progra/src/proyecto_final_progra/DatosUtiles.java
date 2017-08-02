/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_progra;

import javax.swing.JOptionPane;

/**
 *
 * @author danovargas
 */
public class DatosUtiles {
    
   public void buscar (){
       
       int busco = Integer.parseInt(buscaTxt.getText());
        for (int i = 0; i < Info.gundam.length; i++){
            if(Info.gundam[i] != null){
                if (busco==Info.gundam[i].getSeasonYear()){
                    infoTxt.setText(""+Info.gundam[i]);
            }
            
                
            }
        }
       
   } 
    
    static Gundams gundam[] = new Gundams[5];
int cont = 0;
    private void agregarBtnMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    try {
            String gundamName = GundamNameTxt.getText();
            String gundamSeason = GundamSeasonTxt.getText();
            int seasonYear = Integer.parseInt(SeasonYearTxt.getText());

            gundam[cont] = new Gundams(gundamName, gundamSeason, seasonYear);
            cont++;

            JOptionPane.showMessageDialog(null, "Informacion se guardo");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "no se pueden ingresar numeros en el año");
        }

    } 
    
    
    
    
    
    
}
