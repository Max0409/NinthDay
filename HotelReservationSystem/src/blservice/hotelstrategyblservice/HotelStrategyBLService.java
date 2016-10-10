package blservice.hotelstrategyblservice;

import common.ResultMessage;
import vo.hotelstrategyvo.HotelBestStrVO;
import vo.hotelstrategyvo.HotelStrVO;
import vo.hotelstrategyvo.OrderProvidedVO;

public interface HotelStrategyBLService {
	public HotelBestStrVO getBestHotelStrategy(OrderProvidedVO orderProvidedVO);
	public HotelStrVO getHotelStrategy(String hotelID,String type);
	public ResultMessage confirmHotelStrategy(HotelStrVO hotelStrVO);
}
