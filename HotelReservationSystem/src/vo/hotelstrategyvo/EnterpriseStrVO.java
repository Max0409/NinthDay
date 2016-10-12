
package vo.hotelstrategyvo;


/**
 * 特殊商圈策略
 * 
 * @author Cy
 *
 */
public class EnterpriseStrVO {
	private String place;//商圈
	int sale; // 折扣值
	public  EnterpriseStrVO(String place,int sale){
		this.place=place;
		this.sale=sale;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	

}

