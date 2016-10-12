package dataservice.personneldataservice;

import java.util.ArrayList;

import common.ResultMessage;
import po.CustomerDetailPO;
import po.CustomerListPO;
import po.HotelWorkerDetailPO;
import po.HotelWorkerListPO;
import po.WebMarketManDetailPO;
import po.WebMarketManListPO;

public interface PersonnelDataService {
	public void initial();
	public ResultMessage addCustomer(CustomerDetailPO customerDetailPO);
	public ResultMessage addHotelworker(HotelWorkerDetailPO hotelWorkerDetailPO);
	public ResultMessage addWebMarketMan(WebMarketManDetailPO webMarketManDetailPO);
	public ArrayList<HotelWorkerListPO>  getHotelWorkerList();
	public ArrayList<WebMarketManListPO>  getWebMarketManList();
	public ArrayList<CustomerListPO>  getCustomerList();
	public HotelWorkerDetailPO  getHotelWorkerDetail(String hotelID);
	public WebMarketManDetailPO  getWebMarketManDetail(String webWorkerManID);
	public CustomerDetailPO  getCustomerDetail(String customerID);
	public ResultMessage setHotelWorker (HotelWorkerDetailPO hotelWorkerDetailPO);
	public ResultMessage setWebMarketMan (WebMarketManDetailPO webMarketManDetailPO);
	public ResultMessage setCustomer (CustomerDetailPO customerDetailPO);
}
