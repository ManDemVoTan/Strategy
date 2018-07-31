package BanPhim;

public class keyWith {
	private String chu;
	private int so;
	public String getChu() {
		return chu;
	}
	public void setChu(String chu) {
		this.chu = chu;
	}
	public int getSo() {
		return so;
	}
	public void setSo(int so) {
		this.so = so;
	}
	public keyWith() {
	}
	public keyWith(String chu, int so) {

		this.chu = chu;
		this.so = so;
	}
	public void annut(){
		SukienAnNut.nguoiDungAnNut(ten);
		
	}
	private String ten;
	public keyWith(String chu, int so, String ten, PhanHoiAnNut sukienAnNut) {
		super();
		this.chu = chu;
		this.so = so;
		this.ten = ten;
		SukienAnNut = sukienAnNut;
	}
	
	public keyWith(String ten) {
		super();
		this.ten = ten;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	private PhanHoiAnNut SukienAnNut;
	public PhanHoiAnNut getSukienAnNut() {
		return SukienAnNut;
	}
	public void setSukienAnNut(PhanHoiAnNut sukienAnNut) {
		SukienAnNut = sukienAnNut;
	}
}
