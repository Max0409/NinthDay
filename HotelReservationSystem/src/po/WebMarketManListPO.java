package po;

import java.io.Serializable;
import java.util.ArrayList;

public class WebMarketManListPO implements Serializable{
/**
 * 网站工作人员的列表信息
 * @author Cy
 */
	
	
private ArrayList<WebMarketManDetailPO >WebMarketManListPO;//酒店工作人员的具体信息
    public WebMarketManListPO(ArrayList <WebMarketManDetailPO >WebMarketManListPO){
    	this.WebMarketManListPO=WebMarketManListPO;
    	
    }


    public ArrayList <WebMarketManDetailPO >getWebMarketManListPO() {
		return WebMarketManListPO;
	}

	public void setWebMarketManListPO(ArrayList<WebMarketManDetailPO > webMarketManListPO) {
		WebMarketManListPO = webMarketManListPO;
	}

	
	
	
	
}