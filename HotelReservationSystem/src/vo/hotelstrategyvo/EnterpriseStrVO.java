
package vo.hotelstrategyvo;

import common.TradingArea;

/**
 * 特殊商圈策略
 * 
 * @author Cy
 *
 */
public class EnterpriseStrVO {
	 private TradingArea place;//商圈
	int sale; // 折扣值
	public  EnterpriseStrVO(TradingArea place,int sale){
		this.place=place;
		this.sale=sale;
	}
	
	public TradingArea getPlace() {
		return place;
	}
	public void setPlace(TradingArea place) {
		this.place = place;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	

}

