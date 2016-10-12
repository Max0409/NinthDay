package dataservice.orderdataservice;

import java.util.ArrayList;

import common.ResultMessage;
import po.CheckTimePO;
import po.OrderInfoPO;
import po.OrderListPO;
import po.OrderStatePO;
import po.RemarkPO;

public interface OrderDataService {
	public void initial();
	public OrderInfoPO getOrderInfo(String orderID);
	public ArrayList<OrderListPO> getOrderList(String keyword);
	public ResultMessage addOrderState(OrderStatePO po);
	public ResultMessage setOrderRemark(RemarkPO po);
	public ResultMessage setCheckintime(CheckTimePO po);
	public ResultMessage setCheckouttime(CheckTimePO po);
	public ResultMessage addOrder(OrderInfoPO po);
}
