package blservice.webstrategyblservice;

import common.ResultMessage;
import vo.webstrategyvo.GradeRuleVO;
import vo.webstrategyvo.WebBestStrVO;
import vo.webstrategyvo.WebStrVO;

public interface WebStrategyBLService {
	public WebBestStrVO getWebBestStrategy(String credit,String area,String time);
	public GradeRuleVO getGradeRule();
	public WebStrVO getWebStrategy(String type);
	public ResultMessage comfirmGradeRule(GradeRuleVO gradeRuleVO);
	public ResultMessage comfirmWebStrategy(WebStrVO webStrVO);
	
}
