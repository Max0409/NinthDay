package dataservice.hotelstrategydataservice;

import common.ResultMessage;
import po.HotelStrPO;

public interface HotelStrategyDataService {
	public void initial();
	public HotelStrPO getHotelStrategy(String hotelID,String type);
	public ResultMessage setHotelStrategy(HotelStrPO po);
}
