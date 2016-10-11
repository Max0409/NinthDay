package common;

import java.util.Date;
/**
 * 网站特定日期策略
 * @author CLL
 *
 */
public class WebSpecialTimeStrategy extends Strategy{
	private double discount;
	private Date specialTime;
	
	public WebSpecialTimeStrategy(Date specialTime,double discount){
		this.discount=discount;
		this.setSpecialTime(specialTime);
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getSpecialTime() {
		return specialTime;
	}

	public void setSpecialTime(Date specialTime) {
		this.specialTime = specialTime;
	}
}
