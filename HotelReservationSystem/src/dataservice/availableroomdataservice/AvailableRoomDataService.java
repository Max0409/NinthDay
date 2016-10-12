package dataservice.availableroomdataservice;

import common.ResultMessage;
import po.AvailableRoomInfoPO;
import po.AvailableRoomNumberPO;

public interface AvailableRoomDataService {
	public void initial();
	public AvailableRoomInfoPO getAvailableRoomInfo (String hotelID);
	public ResultMessage addAvailableRoomInfo (AvailableRoomInfoPO po);
	public ResultMessage modifyAvailableRoomInfo (AvailableRoomInfoPO po);
	public ResultMessage setAvailableRoomNumber (AvailableRoomNumberPO po);
	public double getRoomPrice(String hotelID,String roomType);
	public ResultMessage setBestPrice(AvailableRoomInfoPO po);
}
