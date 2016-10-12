package vo.creditvo;

import java.util.ArrayList;

public class CreditInfoVO {
	/**信用记录信息
	1)用户名
	2）用户编号
	3）当前信用值
	4)信用记录
	@author Cy
	*/
	private String name;//用户名
	private String customernumber;//用户编号
	private int credit;//当前信用值
	private ArrayList<String> creditinfo;//信用记录
	public CreditInfoVO(String name,String customernumber,int credit,ArrayList<String> creditinfo){
		this.name=name;
		this.customernumber=customernumber;
		this.credit=credit;
		this.creditinfo=creditinfo;
		
		
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomernumber() {
		return customernumber;
	}
	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public ArrayList<String> getCreditinfo() {
		return creditinfo;
	}

    public void setCreditinfo(ArrayList<String> creditinfo) {
		this.creditinfo = creditinfo;
	}

	

}


