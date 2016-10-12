package businesslogic.creditbl;

import vo.creditvo.CreditInfoVO;
import vo.creditvo.CreditVO;

/**
 * 模拟管理信用模块界面层与逻辑层交互的实现
 * @author CLL
 *
 */
public class CreditBL_Driver {
	public void drive(CreditBL_Stub stub){
		CreditInfoVO creditInfoVO=stub.getCreditInfo("000001");
		System.out.println(stub.addCredit(new CreditVO()));
		System.out.println(stub.cutCredit(new CreditVO()));
		System.out.println(stub.confirmCreditDeposit(10));
	}
	
	public static void main(String[] args){
		new CreditBL_Driver().drive(new CreditBL_Stub());
	}
}
