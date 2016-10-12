package vo.hotelstrategyvo;



public class SpecialTimeVO {
   /**
    * 特殊时期优惠
    * @author Cy
    */
	
	
	private String starttime;//开始时间
	private String endtime;//结束时间
	private int sale;//折扣值
	public SpecialTimeVO(String starttime,String endtime,int sale){
		this.endtime=endtime;
		this.starttime=starttime;
		this.sale=sale;
		
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}

}
