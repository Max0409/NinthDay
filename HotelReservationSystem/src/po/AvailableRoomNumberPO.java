package po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class AvailableRoomNumberPO  implements Serializable{
	/**
	 * 记录未来一个月内的房间预订数量
	 * int[]的长度为30，记录某一种房间类型在未来三十天的可用客房数量。
	 * map 记录房间类型和未来30天的预订房间数。
	 * @author Cy
	 * 
	 */
	 
	private int hotelnumber;//  记录酒店编号
	private Map<String,int[]> orderedroonnumber;//记录房间类型和30天预订客房
	public AvailableRoomNumberPO(int hotelnumber,Map<String,int[]> orderedroonnumber){
		this.orderedroonnumber=orderedroonnumber;
		this.hotelnumber=hotelnumber;
	}
	
	public int getHotelnumber() {
		return hotelnumber;
	}
	public void setHotelnumber(int hotelnumber) {
		this.hotelnumber = hotelnumber;
	}
	public Map<String,int[]> getOrderedroonnumber() {
		return orderedroonnumber;
	}
	public void setOrderedroonnumber(Map<String,int[]> orderedroonnumber) {
		this.orderedroonnumber = orderedroonnumber;
	}
	
	
	
	
	
	

}
