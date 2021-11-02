/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author namita
 */
public class AllPatientLogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AllPatientLogJPanel
     */
    PatientDirectory directory;
    City city;
    //House house;
    public AllPatientLogJPanel(PatientDirectory history,City city) {
        initComponents();
        this.directory = history;
        this.city=city;
        populateTable();
    }
        
        private void populateTable() {
      
         //System.out.println("populateTable");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (int i=0;i< directory.getpatientDirectory().size();i++){
            
      //   System.out.println("forLoop"+i);
            Patient p=directory.getpatientDirectory().get(i);
          // addObjectToRow(p);
          
          for(Encounter e: p.getEncounterHistory().getEncounterHistory())
        {
            Object[] object=
             {           
            p.getName(),
            p.getPatientID(),
            p.getAge(),
            p.getMobileNo(),
            p.getHouse().getHouseNumber(),
            p.getCommunity().getCommunityName(),
            city.getCityName(),
            e.getVitalSigns().getBt(),
            e.getVitalSigns().getHeartRate(),
            e.getVitalSigns().getBp(),
            e.getVitalSigns().getRespiratoryRate(),
            
             };
            model.addRow(object); 
        }
            
            
            
            
//            Object[] row = new Object[12];
//           // row[0] = vs;
//            row[0] = vs.getName();
//            row[1] = vs.getPatientID();
//            row[2] = vs.getAge();
//            row[3] = vs.getMobileNo();
//          //  row[4] = vs.getResidence();
//            //row[5] = vs.getCommunity();
//          //  row[6] = vs.getCity();
//         //   row[7] = vs.getBp();
//          // row[8] = vs.getCity();
//         //   row[8] = vs.getBt();
//           // row[9] = vs.getPulse();
//           // row[10] = vs.getRespiration();
//            //row[11] = vs.getTimestamp();
//             
//            model.addRow(row); 
        }
 }

    private void addObjectToRow(Patient p)
    {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        //House house1 = new House();
        Community community = new Community();
      //community.
        for(Encounter e: p.getEncounterHistory().getEncounterHistory())
        {
            Object[] object=
             {           
            p.getName(),
            p.getPatientID(),
            p.getAge(),
            p.getMobileNo(),
            p.getStreetName(),
            e.getVitalSigns().getBt(),
            e.getVitalSigns().getHeartRate(),
            e.getVitalSigns().getBp(),
            e.getVitalSigns().getRespiratoryRate()
             };
            model.addRow(object); 
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Age", "Phone", "Residence", "Community", "City", "Blood Pressure", "Temperature", "Pulse", "Respiration", "Visit Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}