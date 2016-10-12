package dataservice.searchhoteldataservice;
import java.util.ArrayList;
import po.HotelListPO;

public interface SearchHotelDataService {
	public void initial();
	public ArrayList<HotelListPO> getHotelList();
	public ArrayList<HotelListPO> getSortedHotelList(String type);
}
