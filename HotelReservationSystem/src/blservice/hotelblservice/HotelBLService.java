package blservice.hotelblservice;

import java.util.ArrayList;

import common.ResultMessage;
import vo.hotelvo.HotelBasicInfoVO;
import vo.hotelvo.HotelDetailInfoVO;
import vo.hotelvo.HotelOrderInfoVO;
import vo.hotelvo.HotelOrderVO;

public interface HotelBLService {
	public HotelBasicInfoVO getHotelBasicInfo(String hotelID);
	public HotelDetailInfoVO getHotelDetailInfo(String hotelID,String customerID);
	public ResultMessage checkTel(String telNum);
	public ResultMessage confirmModifyInfo(HotelBasicInfoVO hotelBasicInfoVO);
	public ArrayList<HotelOrderVO> getHotelOrder(String hotelID);
	public HotelOrderInfoVO getHotelOrderInfo(String orderID);
	
}
