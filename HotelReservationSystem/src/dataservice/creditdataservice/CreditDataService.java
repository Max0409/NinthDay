package dataservice.creditdataservice;

import common.ResultMessage;
import po.CreditInfoPO;
import po.CreditPO;

public interface CreditDataService {
	public void initial();
	public ResultMessage setCredit (CreditPO po);
	public CreditInfoPO getCreditInfo(String customerID);
}
