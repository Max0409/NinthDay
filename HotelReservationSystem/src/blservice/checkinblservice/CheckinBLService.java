package blservice.checkinblservice;

import common.ResultMessage;
import vo.checkinvo.AvailableRoomInfoVO;
import vo.checkinvo.AvailableRoomNumberVO;
import vo.checkinvo.CheckinInfoVO;
import vo.checkinvo.OrderInfoVO;

public interface CheckinBLService {
	public OrderInfoVO getOrderInfo(String orderID);
	public CheckinInfoVO getCheckinInfo(String orderID);
	public ResultMessage checkIDLength(String ID);
	public ResultMessage confirmCheckinInfo(CheckinInfoVO checkinInfoVO);
	public ResultMessage confirmCheckoutInfo(CheckinInfoVO checkinInfoVO);
	public ResultMessage checkAvailableRoomNumber(String roomType,String number);
	public ResultMessage confirmAvailableRoomNumber(AvailableRoomNumberVO availableRoomNumberVO);
	public AvailableRoomInfoVO getAvailableRoomInfo();
	
}
