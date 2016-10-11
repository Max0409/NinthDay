package vo.hotelvo;

import java.util.List;
/**
 * 酒店基本信息vo
 * @author CYF
 * @version 1.0
 */

public class HotelBasicInfoVO {
	// 酒店id
	private String hotelID;
	// 酒店名
	private String hotelName;
	// 地址
	private String address;
	// 商圈
	private String businessArea;
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

	public HotelBasicInfoVO(String hotelID, String hotelName, String address, String businessArea, String telephone,
			double star, String introduce, String commonFacility, String activityFacility, String service,
			String roomFacility, String[] enterprises) {
		this.setHotelID(hotelID);
		this.setHotelName(hotelName);
		this.setAddress(address);
		this.setBusinessArea(businessArea);
		this.setTelephone(telephone);
		this.setStar(star);
		this.setIntroduce(introduce);
		this.setCommonFacility(commonFacility);
		this.setService(service);
		this.setRoomFacility(roomFacility);
		this.setEnterprises(enterprises);
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public double getStar() {
		return star;
	}

	public void setStar(double star) {
		this.star = star;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getCommonFacility() {
		return commonFacility;
	}

	public void setCommonFacility(String commonFacility) {
		this.commonFacility = commonFacility;
	}

	public String getActivityFacility() {
		return activityFacility;
	}

	public void setActivityFacility(String activityFacility) {
		this.activityFacility = activityFacility;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getRoomFacility() {
		return roomFacility;
	}

	public void setRoomFacility(String roomFacility) {
		this.roomFacility = roomFacility;
	}

	public String[] getEnterprises() {
		return enterprises;
	}

	public void setEnterprises(String[] enterprises) {
		this.enterprises = enterprises;
	}

}
