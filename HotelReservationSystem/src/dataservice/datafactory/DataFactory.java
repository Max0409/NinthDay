package dataservice.datafactory;

import dataservice.availableroomdataservice.AvailableRoomDataService;
import dataservice.checkindataservice.CheckinDataService;
import dataservice.creditdataservice.CreditDataService;
import dataservice.hoteldataservice.HotelDataService;
import dataservice.hotelstrategydataservice.HotelStrategyDataService;
import dataservice.orderdataservice.OrderDataService;
import dataservice.personneldataservice.PersonnelDataService;
import dataservice.searchhoteldataservice.SearchHotelDataService;
import dataservice.userdataservice.UserDataService;
import dataservice.webstrategydataservice.WebStrategyDataService;

public interface DataFactory {
	public UserDataService getUserDataImpl();
	public PersonnelDataService getPersonnelDataImpl();
	public OrderDataService getOrderDataImpl();
	public CreditDataService getCreditDataImpl();
	public HotelDataService getHotelDataImpl();
	public AvailableRoomDataService getAvailableroomDataImpl();
	public CheckinDataService getCheckinDataImpl();
	public WebStrategyDataService getWebStrategyDataImpl();
	public HotelStrategyDataService getHotelStrategyDataImpl();
	public SearchHotelDataService getSearchHotelDataImpl();
}
