package dataservice.searchhoteldataservice;
import java.util.ArrayList;

import common.HotelSortType;
import po.HotelListPO;

public interface SearchHotelDataService {
	public void initial();
	public ArrayList<HotelListPO> getHotelList();
	public ArrayList<HotelListPO> getSortedHotelList(HotelSortType type);
}
