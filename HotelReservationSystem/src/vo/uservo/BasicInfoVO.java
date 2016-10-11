package vo.uservo;

import java.awt.Image;
/**
 * 用户基本信息
 * @author CYF
 * @version 1.0
 */
public class BasicInfoVO {
	//用户名
	private String userName;
	//用户头像
	private Image userImage;
	public BasicInfoVO(String userName,Image userImage){
		this.setUserImage(userImage);
		this.setUserName(userName);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Image getUserImage() {
		return userImage;
	}
	public void setUserImage(Image userImage) {
		this.userImage = userImage;
	}

}
