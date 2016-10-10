package blservice.availableroomblservice;

import common.ResultMessage;
import vo.availableroomvo.AvailableRoomInfoVO;
import vo.availableroomvo.AvailableRoomNumberVO;

public interface AvailableRoomBLService {
	public AvailableRoomInfoVO getAvailableRoomInfo(String hotelID);
	public ResultMessage confirmAvailableRoomInfo (AvailableRoomInfoVO availableRoomInfoVO);
	public ResultMessage setAvailableRoomNumber (AvailableRoomNumberVO availableRoomNumberVO);
	public ResultMessage setBestPrice (double discount);
	public double getRoomPrice (String hotelID,String roomType);
	public ResultMessage checkAvailableRoomNumber (AvailableRoomNumberVO availableRoomNumberVO);

}
