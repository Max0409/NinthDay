package dataservice.hotelstrategydataservice;

import common.HotelStrategyType;
import common.ResultMessage;
import po.HotelStrPO;

public interface HotelStrategyDataService {
	public void initial();
	public HotelStrPO getHotelStrategy(String hotelID,HotelStrategyType type);
	public ResultMessage setHotelStrategy(HotelStrPO po);
}
