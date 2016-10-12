package vo.checkinvo;

import java.io.Serializable;

public class AvailableRoomInfoVO implements Serializable {
	/**
	 *  当前可用客房信息（AvailableroomPO)
	 *  房型、床型、各房型总数量、可用客房信息、原始价格、最低价格、酒店编号
	 *  @author Cy
	 * */
	private int  hotelnumber;//酒店编号
	private String[] roomtype;//房型
	private String[] bedtype;//床型
	private double[] originalprice;//原始价格
	private double[] lowestprice;//最低价格
	private int[] originalnumbers;//各房型总数量
	private int[] avalablenumbers;//可用客房信息
	public AvailableRoomInfoVO (int hotelnumber,String[] roomtype,String[] bednumber,double[] originalprice,double[] lowestprice
			,int[] originalnumbers,int[] avalablenumbers){
		this.hotelnumber=hotelnumber;
		this.bedtype=bedtype;
		this.roomtype=roomtype;
		this.originalnumbers=originalnumbers;
		this.lowestprice=lowestprice;
		this.originalprice=originalprice;
		this.avalablenumbers=avalablenumbers;
		
	}

	public int getHotelnumber() {
		return hotelnumber;
	}

	public void setHotelnumber(int hotelnumber) {
		this.hotelnumber = hotelnumber;
	}
	public String[] getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String[] roomtype) {
		this.roomtype = roomtype;
	}
	public String[] getBedtype() {
		return bedtype;
	}

	public void setBedtype(String[] bedtype) {
		this.bedtype = bedtype;
	}
	public double[] getOriginalprice() {
		return originalprice;
	}

	public void setOriginalprice(double[] originalprice) {
		this.originalprice = originalprice;
	}

	public double[] getLowestprice() {
		return lowestprice;
	}

	public void setLowestprice(double[] lowestprice) {
		this.lowestprice = lowestprice;
	}

	public int[] getOriginalnumbers() {
		return originalnumbers;
	}

	public void setOriginalnumbers(int[] originalnumbers) {
		this.originalnumbers = originalnumbers;
	}

	public int[] getAvalablenumbers() {
		return avalablenumbers;
	}

	public void setAvalablenumbers(int[] avalablenumbers) {
		this.avalablenumbers = avalablenumbers;
	}
	
	
	

}

