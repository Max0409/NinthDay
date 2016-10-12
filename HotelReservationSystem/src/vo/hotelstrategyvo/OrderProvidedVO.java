package vo.hotelstrategyvo;

public class OrderProvidedVO {
	/**
	 *订单优惠信息 
	 *@author Cy
	 */
	private String  Strname;//优惠名字
	private int sale;//优惠折扣值
	public OrderProvidedVO(String  Strname,int sale){
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
