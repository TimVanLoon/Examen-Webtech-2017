package edu.ap.registratie;

import java.util.Date;

public class Registratie {
	private Date datumEnUurInterventie;
	private String naamPatient;
	private Date geboortedatumPatient;
	private String naamVerpleegkundige;
	private String diagnose;
	
	public Date getDatumEnUurInterventie() {
		return datumEnUurInterventie;
	}
	public void setDatumEnUurInterventie(Date datumEnUurInterventie) {
		this.datumEnUurInterventie = datumEnUurInterventie;
	}
	public String getNaamPatient() {
		return naamPatient;
	}
	public void setNaamPatient(String naamPatient) {
		this.naamPatient = naamPatient;
	}
	public Date getGeboortedatumPatient() {
		return geboortedatumPatient;
	}
	public void setGeboortedatumPatient(Date geboortedatumPatient) {
		this.geboortedatumPatient = geboortedatumPatient;
	}
	public String getNaamVerpleegkundige() {
		return naamVerpleegkundige;
	}
	public void setNaamVerpleegkundige(String naamVerpleegkundige) {
		this.naamVerpleegkundige = naamVerpleegkundige;
	}
	public String getDiagnose() {
		return diagnose;
	}
	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
}
