package com.cnet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnet.core.domain.BrndOprtGrp;
import com.cnet.core.domain.CmdtyInfo;
import com.cnet.core.domain.ConferrenceMainTable;
import com.cnet.core.domain.PayInfo;
import com.cnet.core.domain.RtlOprtGrp;
import com.cnet.mapper.GraphMapper;
import com.cnet.service.GraphService;

/**
 * 服务层接口的实现类，封装了数据持久层（mapper）方法为服务层的方法，接口供controller层使用
 * @author zodiac
 * @version 1.0
 */
@Service
public class GraphServiceImpl implements GraphService{
	
	// 自动将mapper层的方法注入graphMapper对象，供服务层调用
	@Autowired
	private GraphMapper graphMapper;

	@Override
	public int addConferrenceMainTable(ConferrenceMainTable conferrenceMainTable) {
		graphMapper.addConferrenceMainTable(conferrenceMainTable);
		return 1;
	}

	@Override
	public int addBrndOprtGr(BrndOprtGrp brndOprtGr) {
		graphMapper.addBrndOprtGr(brndOprtGr);
		return 1;
	}

	@Override
	public int addPayInfo(PayInfo payInfo) {
		graphMapper.addPayInfo(payInfo);
		return 1;
	}

	@Override
	public int addRtlOprtGrp(RtlOprtGrp rtlOprtGrp) {
		graphMapper.addRtlOprtGrp(rtlOprtGrp);
		return 1;
	}

	@Override
	public int addCmdtyInfo(CmdtyInfo cmdtyInfo) {
		graphMapper.addCmdtyInfo(cmdtyInfo);
		return 1;
	}
	
}
