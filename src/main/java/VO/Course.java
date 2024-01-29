package VO;

public class Course {
	private String cno;
	private String cname;
	private double ccredit;
	private String cintroduction;
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCno() {
		return cno;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}
	public void setCcredit(double ccredit) {
		this.ccredit = ccredit;
	}
	public double getCcredit() {
		return ccredit;
	}
	public void setCintroduction(String cintroduction) {
		this.cintroduction = cintroduction;
	}
	public String getCintroduction() {
		return cintroduction;
	}
}