package common;
/**
 * 网站会员特惠策略
 * @author CLL
 *
 */
public class WebVIPStrategy extends Strategy {
	private double discount;
	private int VIPgrade;
	
	public WebVIPStrategy(int VIPgrade,double discount){
		this.discount=discount;
		this.VIPgrade=VIPgrade;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getVIPgrade() {
		return VIPgrade;
	}

	public void setVIPgrade(int vIPgrade) {
		VIPgrade = vIPgrade;
	}
}
