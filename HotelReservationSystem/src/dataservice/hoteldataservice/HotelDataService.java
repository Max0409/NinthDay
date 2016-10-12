package dataservice.hoteldataservice;

import common.ResultMessage;
import po.HotelBasicInfoPO;
import po.HotelBestPricePO;
import po.RemarkPO;

public interface HotelDataService {
	public void initial();
	public HotelBasicInfoPO getHotelBasicInfo(String hotelID);
	public String addRemarkInfo(RemarkPO po);
	public ResultMessage addHotelBasicInfo(HotelBasicInfoPO po);
	public ResultMessage setHotelBasicInfo(HotelBasicInfoPO po);
	public ResultMessage setBestPrice(HotelBestPricePO po);
}
