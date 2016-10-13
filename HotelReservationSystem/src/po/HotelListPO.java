package po;


import java.io.Serializable;
import java.util.ArrayList;

public class HotelListPO  implements Serializable{
	/**
	 * 记录酒店列表信息
	 * @author Cy
	 * 
	 */
		private ArrayList<HotelBasicInfoPO> HotelBasicInfoListPO;//酒店基本信息
		private ArrayList<HotelBestPricePO> HotelBestPriceListPO;//酒店最低价格
		
		public HotelListPO(){
			
		}
		public HotelListPO(ArrayList<HotelBasicInfoPO> HotelBasicInfoListPO, ArrayList<HotelBestPricePO> HotelBestPriceListPO){
			this.HotelBasicInfoListPO=HotelBasicInfoListPO;
			this.HotelBestPriceListPO=HotelBestPriceListPO;
			
		}
		
    public ArrayList<HotelBasicInfoPO> getHotelBasicInfoListPO() {
		return HotelBasicInfoListPO;
	}
	public void setHotelBasicInfoListPO(ArrayList<HotelBasicInfoPO> hotelBasicInfoListPO) {
		HotelBasicInfoListPO = hotelBasicInfoListPO;
	}
	public ArrayList<HotelBestPricePO> getHotelBestPriceListPO() {
		return HotelBestPriceListPO;
	}
	public void setHotelBestPriceListPO(ArrayList<HotelBestPricePO> hotelBestPriceListPO) {
		HotelBestPriceListPO = hotelBestPriceListPO;
	}

}
