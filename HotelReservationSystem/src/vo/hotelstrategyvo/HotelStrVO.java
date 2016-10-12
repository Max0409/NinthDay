package vo.hotelstrategyvo;



public class HotelStrVO {
	/**
	 * hotelStr：
	 *   包含四中折扣信息
	 *   @author Cy

	 */
	private BirthStrVO birthStrVO;//生日优惠
	private AmountSaleVO amountSaleVO;//三间及以上优惠
	private SpecialTimeVO specialTimeVO;//特殊时期优惠
	private EnterpriseStrVO enterpriseStrVO;//特殊商圈优惠
	
	public HotelStrVO(BirthStrVO birthStrVO,AmountSaleVO amountSaleVO
			,SpecialTimeVO specialTimeVO,EnterpriseStrVO enterpriseStrVO){
		this.birthStrVO=birthStrVO;
		this.amountSaleVO=amountSaleVO;
		this.specialTimeVO=specialTimeVO;
		this.enterpriseStrVO=enterpriseStrVO;
		
				
	}
	
	
	
	
	public BirthStrVO getBirthStrVO() {
		return birthStrVO;
	}


	public void setBirthStrVO(BirthStrVO birthStrVO) {
		this.birthStrVO = birthStrVO;
	}


	public AmountSaleVO getAmountSaleVO() {
		return amountSaleVO;
	}


	public void setAmountSaleVO(AmountSaleVO amountSaleVO) {
		this.amountSaleVO = amountSaleVO;
	}


	public SpecialTimeVO getSpecialTimeVO() {
		return specialTimeVO;
	}


	public void setSpecialTimeVO(SpecialTimeVO specialTimeVO) {
		this.specialTimeVO = specialTimeVO;
	}


	public EnterpriseStrVO getEnterpriseStrVO() {
		return enterpriseStrVO;
	}


	public void setEnterpriseStrVO(EnterpriseStrVO enterpriseStrVO) {
		this.enterpriseStrVO = enterpriseStrVO;
	}


	
	
	
	
	

}
