package vo.hotelstrategyvo;

public class HotelBestStrVO {
	/**
	 * 酒店最低折扣
	 * @author Cy
	 */
	private String  Strname;//折扣名称
	private int sale;//折扣值
	public HotelBestStrVO(String  Strname,int sale){
		this.sale=sale;
		this.Strname=Strname;
		
		
	}
	
	public String getStrname() {
		return Strname;
	}
	public void setStrname(String strname) {
		Strname = strname;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
}
