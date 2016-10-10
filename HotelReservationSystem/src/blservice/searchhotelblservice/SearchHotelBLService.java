package blservice.searchhotelblservice;

import java.util.ArrayList;

import vo.searchhotelvo.HotelListVO;

public interface SearchHotelBLService {
	public ArrayList<HotelListVO> getHotelList();
	public ArrayList<HotelListVO> getSortedHotelList(String type);
	public ArrayList<HotelListVO> getBookedHotelList(String customerID,String type);

}
