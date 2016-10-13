package vo.hotelstrategyvo;

import common.HotelStrategyType;

public class OrderProvidedVO {
	/**
	 *订单优惠信息 
	 *@author Cy
	 */
	private HotelStrategyType Strname;//优惠名字
	private int sale;//优惠折扣值
	public OrderProvidedVO(HotelStrategyType  Strname,int sale){
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
