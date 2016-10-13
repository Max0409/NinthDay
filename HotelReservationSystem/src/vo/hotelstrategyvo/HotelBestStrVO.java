package vo.hotelstrategyvo;

import common.HotelStrategyType;

public class HotelBestStrVO {
	/**
	 * 酒店最低折扣
	 * @author Cy
	 */
	private  HotelStrategyType Strname;//折扣名称
	private int sale;//折扣值
	public HotelBestStrVO(HotelStrategyType  Strname,int sale){
		this.sale=sale;
		this.Strname=Strname;
		
		
	}
	
	public HotelStrategyType getStrname() {
		return Strname;
	}
	public void setStrname(HotelStrategyType strname) {
		Strname = strname;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
}
