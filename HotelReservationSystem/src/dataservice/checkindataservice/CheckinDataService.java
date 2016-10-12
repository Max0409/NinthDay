package dataservice.checkindataservice;

import common.ResultMessage;
import po.CheckinInfoPO;

public interface CheckinDataService {
	public void initial();
	public ResultMessage addCheckinInfo (CheckinInfoPO po);
	public CheckinInfoPO getCheckinInfo (String orderID);
	public ResultMessage modifyCheckinInfo (CheckinInfoPO po);
}
