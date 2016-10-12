package po;

import java.io.Serializable;
import java.util.ArrayList;

import common.Strategy;
/**
 * 传递所有的网站营销策略
 * @author CLL
 *
 */
public class WebStrPO implements Serializable{
	private ArrayList<Strategy> strategies;
	
	public WebStrPO(ArrayList<Strategy> strategies){
		this.setStrategies(strategies);
	}

	public ArrayList<Strategy> getStrategies() {
		return strategies;
	}

	public void setStrategies(ArrayList<Strategy> strategies) {
		this.strategies = strategies;
	}
}
