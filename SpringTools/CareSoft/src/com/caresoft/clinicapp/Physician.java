package com.caresoft.clinicapp;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA{
	
	public Physician(Integer id, int pin)
	{
		super(id, pin);
	}
//... importa definición de clase...copy
    
    // Dentro de la clase:    
    private ArrayList<String> patientNotes;
	
    // PARA HACER: Constructor que tome un ID
    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // PARA HACER: Setters y Getters

}
