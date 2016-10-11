package common;
/**
 * 网站特定商圈优惠策略
 * @author CLL
 *
 */
public class WebSpecialAreaStrategy extends Strategy {
	private double discount;
	private String specialArea;
	
	public WebSpecialAreaStrategy(String specialArea,double discount){
		this.specialArea=specialArea;
		this.discount=discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getSpecialArea() {
		return specialArea;
	}

	public void setSpecialArea(String specialArea) {
		this.specialArea = specialArea;
	}
}
