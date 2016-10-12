package po;

import java.io.Serializable;
import java.util.ArrayList;

public class CustomerListPO implements Serializable {
	/**
	 *  记录顾客的列表信息
	 *  @author Cy
	 */
	private ArrayList<CustomerDetailPO>	CustomerListPO;//存放顾客的具体信息
	
	public CustomerListPO(ArrayList<CustomerDetailPO>	CustomerListPO){
		this.CustomerListPO=CustomerListPO;
	}
      public ArrayList getCustomerListPO() {
		return CustomerListPO;
	}

	public void setCustomerList(ArrayList<CustomerDetailPO> customerListPO) {
		CustomerListPO = customerListPO;
	}

	
      

}
