package dataservice.webstrategydataservice;

import common.ResultMessage;
import po.GradeRulePO;
import po.WebStrPO;

public interface WebStrategyDataService {
	public void initial();
	public GradeRulePO getGradeRule();
	public WebStrPO getWebStrategy(String type);
	public ResultMessage setGradeRule(GradeRulePO po);
	public ResultMessage setWebStrategy(WebStrPO po);
}
