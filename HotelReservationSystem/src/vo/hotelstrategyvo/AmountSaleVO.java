package vo.hotelstrategyvo;

/**
 * 3间及以上优惠策略
 * @author Cy
 *
 */

public class AmountSaleVO {
  private  int sale;//折扣数
  public AmountSaleVO(int sale){
	  this.sale=sale;
	  
  }
  public int getSale() {
	return sale;
}
public void setSale(int sale) {
	this.sale = sale;
}

    
}
