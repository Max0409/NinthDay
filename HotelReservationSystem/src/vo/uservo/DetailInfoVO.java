package vo.uservo;

import java.awt.Image;
import java.util.Date;

import common.UserType;

/**
 * 个人详细信息
 * 
 * @author CYF
 * @version 1.0
 */
public class DetailInfoVO {
	// 用户名
	private String userName;
	// 联系方式
	private String telephone;
	// 用户头像
	private Image userImage;
	// 用户种类
	private UserType userType;
	// 所属企业
	private String enterprise;
	// 生日
	private Date birth;

	public DetailInfoVO(String userName, String telephone, Image userImage, UserType userType, String enterprise,
			Date birth) {
		this.setUserName(userName);
		this.setTelephone(telephone);
		this.setUserImage(userImage);
		this.setUserType(userType);
		this.setEnterprise(enterprise);
		this.setBirth(birth);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Image getUserImage() {
		return userImage;
	}

	public void setUserImage(Image userImage) {
		this.userImage = userImage;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
