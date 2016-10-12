package po;


import java.io.Serializable;
import java.util.ArrayList;

public class HotelWorkerListPO implements Serializable {
	/**
	 * 
	 * 
	 * 记录酒店工作人员列表信息
	 * @author CY
	 *  
	 * 
	 */
	
	private ArrayList<HotelWorkerDetailPO>	HotelWorkerListPO;
	//酒店工作人员具体信息
	public HotelWorkerListPO( ArrayList	<HotelWorkerDetailPO>HotelWorkerListPO){
		this.HotelWorkerListPO= HotelWorkerListPO;
		
	}
	

	public ArrayList<HotelWorkerDetailPO> getHotelWorkerListPO() {
		return HotelWorkerListPO;
	}

	public void setHotelWorkerListPO(ArrayList <HotelWorkerDetailPO>hotelWorkerListPO) {
		HotelWorkerListPO = hotelWorkerListPO;
	}
	
}