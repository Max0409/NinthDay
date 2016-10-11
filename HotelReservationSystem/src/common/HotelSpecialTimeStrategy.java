package common;
/**
 * 酒店特定时期特惠策略类
 * @author CLL
 *
 */
public class HotelSpecialTimeStrategy extends Strategy {
	private double discount;
	private String specialTime;
	private String hotelId;
	
	public HotelSpecialTimeStrategy(String hotelId,String specialTime,double discount){
		this.hotelId=hotelId;
		this.specialTime=specialTime;
		this.discount=discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getSpecialTime() {
		return specialTime;
	}

	public void setSpecialTime(String specialTime) {
		this.specialTime = specialTime;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
}
