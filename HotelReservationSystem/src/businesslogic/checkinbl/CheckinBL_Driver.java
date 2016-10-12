package businesslogic.checkinbl;

import blservice.checkinblservice.CheckinBLService;
import vo.checkinvo.AvailableRoomInfoVO;
import vo.checkinvo.CheckinInfoVO;
import vo.checkinvo.OrderInfoVO;

/**
 * 模拟顾客入住退房模块界面层和逻辑层交互的实现
 * @author CLL
 *
 */
public class CheckinBL_Driver {
	public void drive(CheckinBLService stub){
		OrderInfoVO orderInfoVO=stub.getOrderInfo("201610120001000001");
		CheckinInfoVO checkinInfoVO=stub.getCheckinInfo("201610120001000001");
		System.out.println(stub.checkIDLength(""));
		System.out.println(stub.confirmCheckinInfo(checkinInfoVO));
		System.out.println(stub.confirmCheckoutInfo(checkinInfoVO));
		System.out.println(stub.checkAvailableRoomNumber(null, "1"));
		System.out.println(stub.checkAvailableRoomNumber(null, "1"));
		AvailableRoomInfoVO availableRoomInfo=stub.getAvailableRoomInfo();
	}
	
	public static void main(String[] args){
		new CheckinBL_Driver().drive(new CheckinBL_Stub());
	}
}
