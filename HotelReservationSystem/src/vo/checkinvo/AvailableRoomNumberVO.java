package vo.checkinvo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class AvailableRoomNumberVO  implements Serializable{
	/**
	 * 记录未来一个月内的房间预订数量
	 * int[]的长度为30，记录某一种房间类型在未来三十天可用客房数。
	 * map 记录房间类型和未来30天的预订房间数。
	 * @author Cy
	 * 
	 */
	 
	private String hotelname;//酒店名字
	private Map<String,int[]> orderedroonnumber;//房间类型和未来30天可用数量
	public AvailableRoomNumberVO(String hotelname,Map<String,int[]> orderedroonnumber){
		this.orderedroonnumber=orderedroonnumber;
		this.hotelname=hotelname;
	}
	
	public String getHotelnumber() {
		return hotelname;
	}
	public void setHotelnumber(String hotelnumber) {
		this.hotelname = hotelnumber;
	}
	public Map<String,int[]> getOrderedroonnumber() {
		return orderedroonnumber;
	}
	public void setOrderedroonnumber(Map<String,int[]> orderedroonnumber) {
		this.orderedroonnumber = orderedroonnumber;
	}
	
	
	
	
	
	

}
