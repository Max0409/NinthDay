package blservice.orderblservice;

import java.util.ArrayList;

import common.ResultMessage;
import vo.ordervo.OrderInfoVO;
import vo.ordervo.OrderVO;
import vo.ordervo.RemarkVO;
import vo.ordervo.TypeInfoVO;

public interface OrderBLService {
	public ResultMessage checkUserCredit(String CustomerID);
	public ResultMessage checkTelephone(String telNum);
	public ResultMessage checkTime(String time);
	public ResultMessage confirmAddOrder(OrderInfoVO orderInfoVO);
	public OrderInfoVO getOrderInfo(String orderID);
	public ArrayList<OrderVO> getOrderList(TypeInfoVO typeInfoVO);
	public ResultMessage cancelOrderConfirm (String orderID);
	public ResultMessage remarkOrder(RemarkVO remarkVO);
	public double getPrice(String orderID);
	public ResultMessage setCheckinTime(String time);
	public ResultMessage setCheckoutTime(String time);
	public ResultMessage setReturnCredit(int creditNum);
	
}
