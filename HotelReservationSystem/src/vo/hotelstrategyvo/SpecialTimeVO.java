package vo.hotelstrategyvo;

import java.util.Date;

public class SpecialTimeVO {
   /**
    * 特殊时期优惠
    * @author Cy
    */
	
	
	private Date starttime;//开始时间
	private Date endtime;//结束时间
	private int sale;//折扣值
	public SpecialTimeVO(Date starttime,Date endtime,int sale){
		this.endtime=endtime;
		this.starttime=starttime;
		this.sale=sale;
		
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}

}
