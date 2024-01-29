package VO;

public class StudentScore {
	private String cno;
	private String cname;
	private double ccredit;
	private double score;
	private String sno;
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
	public void setScore(double score) {
		this.score = score;
	}
	public double getScore() {
		return score;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSno() {
		return sno;
	}
}