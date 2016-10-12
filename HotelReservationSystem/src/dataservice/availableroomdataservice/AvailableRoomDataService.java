package dataservice.availableroomdataservice;

import common.BedType;
import common.ResultMessage;
import po.AvailableRoomInfoPO;
import po.AvailableRoomNumberPO;

public interface AvailableRoomDataService {
	public void initial();
	public AvailableRoomInfoPO getAvailableRoomInfo (String hotelID);
	public ResultMessage addAvailableRoomInfo (AvailableRoomInfoPO po);
	public ResultMessage modifyAvailableRoomInfo (AvailableRoomInfoPO po);
	public ResultMessage setAvailableRoomNumber (AvailableRoomNumberPO po);
	public double getRoomPrice(String hotelID,BedType bedType);
	public ResultMessage setBestPrice(AvailableRoomInfoPO po);
}
