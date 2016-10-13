package dataservice.userdataservice;

import common.ResultMessage;
import po.CilentPO;

public interface UserDataService {
	public void initial();
	public CilentPO getUserPassword(String name);
	public ResultMessage setPassword(CilentPO po);
}
