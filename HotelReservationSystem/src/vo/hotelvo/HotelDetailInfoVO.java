package vo.hotelvo;

import vo.availableroomvo.AvailableRoomInfoVO;
import vo.hotelstrategyvo.HotelStrVO;

public class HotelDetailInfoVO {
	String hotelName;
	private String address;
	// 联系方式
	private String telephone;
	// 星级
	private double star;
	// 酒店简介
	private String introduce;
	// 通用设施
	private String commonFacility;
	// 活动设施
	private String activityFacility;
	// 服务项目
	private String service;
	// 客房设施
	private String roomFacility;
	// 合作企业
	private String[] enterprises;
	private HotelStrVO hotelStrVO;
	private AvailableRoomInfoVO availableRoomInfoVo;
	


}
