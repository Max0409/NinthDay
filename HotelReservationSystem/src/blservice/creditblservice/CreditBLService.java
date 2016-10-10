package blservice.creditblservice;

import common.ResultMessage;
import vo.creditvo.CreditInfoVO;
import vo.creditvo.CreditVO;

public interface CreditBLService {
	public CreditInfoVO getCreditInfo (String customerID);
	public ResultMessage addCredit (CreditVO creditVO);
	public ResultMessage cutCredit (CreditVO creditVO);
	public ResultMessage confirmCreditDeposit (double money);

}
