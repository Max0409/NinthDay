package vo.hotelvo;

import java.util.List;

import vo.ordervo.RemarkVO;

public class HotelBasicInfoVO {
	// 酒店id
	private String hotelID;
	// 酒店名
	private String name;
	// 地址
	private String address;
	// 联系方式
	private String telephone;
	// 星级
	private double star;
	// 评分
	private double score;
	// 最低价格
	private double lowestPrice;
	// 预定记录？
	// private String reserveRecords;
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
	// 住户点评
	private List<RemarkVO> remarks;
}
