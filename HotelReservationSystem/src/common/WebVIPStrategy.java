package common;

import java.util.Map;

/**
 * 网站会员特惠策略
 * @author CLL
 *
 */
public class WebVIPStrategy extends Strategy {
	private Map<Integer,Double> allDiscount;
	/**
	 * 初始化该等级的折扣值
	 * @param VIPgrade
	 * @param discount
	 */
	public WebVIPStrategy(int VIPgrade,double discount){
		allDiscount.put(VIPgrade, discount);
	}
	/**
	 * 获取该等级的折扣值
	 * @param VIPgrade
	 * @return
	 */
	public double getDiscount(int VIPgrade) {
		return allDiscount.get(VIPgrade);
	}
	/**
	 * 重新设置该等级的折扣值
	 * @param VIPgrade
	 * @param discount
	 */
	public void setDiscount(int VIPgrade,double discount) {
		allDiscount.remove(VIPgrade);
		allDiscount.put(VIPgrade, discount);
	}
	/**
	 * 返回所有等级的折扣值
	 * @return
	 */
	public Map<Integer,Double> getAllDiscount(){
		return allDiscount;
	}
}
