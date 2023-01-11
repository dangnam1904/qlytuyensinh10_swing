package model;

public class KetQuaTrungTuyen {

	private String maHS, ghiChu;
	private float diiemXT;
	public String getMaHS() {
		return maHS;
	}
	public void setMaHS(String maHS) {
		this.maHS = maHS;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public float getDiiemXT() {
		return diiemXT;
	}
	public void setDiiemXT(float diiemXT) {
		this.diiemXT = diiemXT;
	}
	public KetQuaTrungTuyen(String maHS, String ghiChu, float diiemXT) {
		
		this.maHS = maHS;
		this.ghiChu = ghiChu;
		this.diiemXT = diiemXT;
	}
	@Override
	public String toString() {
		return "KetQuaTrungTuyen [maHS=" + maHS + ", ghiChu=" + ghiChu + ", diiemXT=" + diiemXT + "]";
	}
	public KetQuaTrungTuyen() {
		
	}
	
}
