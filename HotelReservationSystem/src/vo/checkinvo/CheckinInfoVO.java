package vo.checkinvo;

public class CheckinInfoVO {
	/**
	 * 酒店入住信息（CheckinInfoPO）
1）用户真实姓名
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
	private String costumername;//用户真实姓名
	private String ID;//身份证号（数字
	private String tel;//联系方式（11位手机号）
	private int roomnumber;//房间号（数字
	private String roomtype;//房间类型
	private String checkintime;//实际入住时间（-年-月-日-时-分）
	private String checkouttime;//实际退房时间（-年-月-日-时-分）
	private String hotelnumber;//酒店编号
	private String ordernumber;//订单号
	
	public CheckinInfoVO( String costumername,String ID, String tel,int roomnumber, String roomtype,
			String checkintime, String checkouttime,String hotelnumber, String ordernumber){
		
		this.costumername=costumername;
		this. ID= ID;
		this.tel=tel;
		this.roomnumber=roomnumber;
		this.roomtype=roomtype;
		this.checkintime=checkintime;
		this.checkouttime=checkouttime;
		this.hotelnumber=hotelnumber;
		this.ordernumber=ordernumber;
		
		
		
		
	}
	
	public String getCostumername() {
		return costumername;
	}
	public void setCostumername(String costumername) {
		this.costumername = costumername;
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
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
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
	public String getHotelnumber() {
		return hotelnumber;
	}
	public void setHotelnumber(String hotelnumber) {
		this.hotelnumber = hotelnumber;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	
	
 
	
}
