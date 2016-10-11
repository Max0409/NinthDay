package common;
/**
 * 酒店企业特惠策略
 * @author CLL
 *
 */
public class HotelEnterpriseStrategy extends Strategy {
	private double discount;
	private String hotelId;
	private String enterpriseName;
	
	public HotelEnterpriseStrategy(String hotelId,String enterpriseName,double discount){
		this.hotelId=hotelId;
		this.enterpriseName=enterpriseName;
		this.discount=discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
}
