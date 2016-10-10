package blservice.personnelblservice;

import java.util.ArrayList;

import common.ResultMessage;
import vo.personnelvo.CustomerDetailVO;
import vo.personnelvo.CustomerListVO;
import vo.personnelvo.HotelWorkerDetailVO;
import vo.personnelvo.HotelWorkerListVO;
import vo.personnelvo.HotelWorkerVO;
import vo.personnelvo.WebMarketManDetailVO;
import vo.personnelvo.WebMarketManListVO;
import vo.personnelvo.WebMarketManVO;


public interface PersonnelBLService {
	public ResultMessage checkUserName(String userName);
	public ResultMessage checkUserTel(String userTel);
	public ResultMessage checkHotelTel(String hotelTel);
	public ResultMessage checkPassword(String password);
	public ResultMessage confirmRegister (CustomerDetailVO customerDetailVO);
	public ResultMessage addHotelWorker (HotelWorkerVO hotelWorkerVO);
	public ResultMessage addHotelworker (WebMarketManVO webMarketManVO);
	public ArrayList<HotelWorkerListVO> getHotelWorkerList();
	public ArrayList<WebMarketManListVO> getWebMarketManList();
	public ArrayList<CustomerListVO> getCustomerList();
	public HotelWorkerDetailVO getHotelWorkerDetail(String hotelID);
	public WebMarketManDetailVO getWebWorkerManDetail(String webWorkerManID);
	public CustomerDetailVO getCustomerDetail(String customerID);
	public ResultMessage modifyHotelworker(HotelWorkerDetailVO hotelWorkerDetailVO);
	public ResultMessage modifyWebMarketMan(WebMarketManDetailVO webMarketManDetailVO);
	public ResultMessage modifyCustomer(CustomerDetailVO customerDetailVO);
	
}
