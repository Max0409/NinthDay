package po;


import java.io.Serializable;

public class CheckinInfoPO implements Serializable{
/**
 * 记录酒店入住信息:
 * 1）用户真实姓名
2）身份证号（数字）
3）联系方式（11位手机号）
4）房间号（数字）
5）房间类型
6）实际入住时间（-年-月-日-时-分）
7）实际退房时间（-年-月-日-时-分）
8）酒店编号
9）订单号
@author Cy



 */
	private String name;//用户真实姓名
	private String ID;//身份证号（数字
	private String tel;//联系方式（11位手机号）
	private String roomtype;//房间号（数字）
	private int roomnumber;//房间类型
	private String checkintime;//实际入住时间（-年-月-日-时-分）
	private String checkouttime;//实际退房时间（-年-月-日-时-分
	private int hotelnumber;//酒店编号
	private int ordernumber;//订单号
	
	public CheckinInfoPO(String name,String ID,String tel,String roomtype,int roomnumber
			,String checkintime,String checkouttime,int hotelnumber,int ordernumber){
		this.name=name;
		this.ID=ID;
		this.tel=tel;
		this.roomtype=roomtype;
		this.roomnumber=roomnumber;
		this.checkintime=checkintime;
		this.checkouttime=checkouttime;
		this.hotelnumber=hotelnumber;
		this.ordernumber=ordernumber;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(String checkintime) {
		this.checkintime = checkintime;
	}
	public String getCheckouttime() {
		return checkouttime;
	}
	public void setCheckouttime(String checkouttime) {
		this.checkouttime = checkouttime;
	}
	public int getHotelnumber() {
		return hotelnumber;
	}
	public void setHotelnumber(int hotelnumber) {
		this.hotelnumber = hotelnumber;
	}
	public int getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}
	
	
	
	
	
	
}
