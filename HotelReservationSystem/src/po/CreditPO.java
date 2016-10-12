package po;

import java.io.Serializable;

public class CreditPO  implements Serializable{
	/**记录用户信用值：
	 * 1)用户名
	 * 2）用户编号
	 * 3）当前信用值
	 * @author Cy
	 * 
     */
	 
	private String name;//用户名
	private String customernumber;//用户编号
	private int credit;//当前信用值

	
	public CreditPO(String name,String customernumber,int credit){
		this.name=name;
		this.customernumber=customernumber;
		this.credit=credit;
		
		
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
	

	

}
