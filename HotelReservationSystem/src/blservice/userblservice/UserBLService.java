package blservice.userblservice;

import common.ResultMessage;
import vo.uservo.BasicInfoVO;
import vo.uservo.DetailInfoVO;
import vo.uservo.PasswordVO;

public interface UserBLService {
	public ResultMessage Login(String name ,String password);
	public DetailInfoVO getDetailInfo(String name);
	public ResultMessage checkTel(String tel);
	public ResultMessage Confirm(DetailInfoVO detailInfoVO);
	public ResultMessage checkOldPassword(String name,String password);
	public ResultMessage checkNewPassword(String password);
	public ResultMessage confirmPassword(PasswordVO passwordVO);
	public BasicInfoVO getBasicInfo(String name);
	public String getUserID (String name);
	public int getGrade(String name);
}
