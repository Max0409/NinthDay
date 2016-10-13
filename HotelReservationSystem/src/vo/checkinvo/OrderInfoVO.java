package vo.checkinvo;

import java.util.Date;

public class OrderInfoVO {
	
	
/**记录订单显示的信息
	1）订单号（日期8位＋酒店编号4位＋会员编号6位）
	2）用户名
	3）真实姓名
	4)入住人的联系电话（11位手机号）
	5）酒店名称
	6）下单时间（-年-月-日-时-分）
	7）实际入住时间（-年-月-日-时-分）（即执行时间）
	8）实际离开时间（-年-月-日-时-分）
	
 * @author Cy
 * 
 *  */
		private String ordernumber;//订单号
		private String username;//用户名
		private String customername;//真实姓名
		private String tel;//入住人的联系电话
		private String hotelname;//酒店名称
		private String ordertime;//下单时间
		private Date checkintime;//实际入住时间
		private Date checkouttime;//实际离开时间
		public  OrderInfoVO(){
			
		}
		public  OrderInfoVO(String ordernumber, String username,String customername,String tel
				,String hotelname,String ordertime,Date checkintime,Date checkouttime){
			this.ordernumber=ordernumber;
			this.username=username;
			this.customername=customername;
			this.tel=tel;
			this.hotelname=hotelname;
			this.ordertime=ordertime;
			this.checkintime=checkintime;
			this.checkouttime=checkouttime;
		}
		
		
		
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public Date getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(Date checkintime) {
		this.checkintime = checkintime;
	}
	public Date getCheckouttime() {
		return checkouttime;
	}
	public void setCheckouttime(Date checkouttime) {
		this.checkouttime = checkouttime;
	}
	
	
	
	
	
	
	


}
