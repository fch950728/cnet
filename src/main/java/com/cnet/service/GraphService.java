package com.cnet.service;

import com.cnet.core.domain.BrndOprtGrp;
import com.cnet.core.domain.CmdtyInfo;
import com.cnet.core.domain.ConferrenceMainTable;
import com.cnet.core.domain.PayInfo;
import com.cnet.core.domain.RtlOprtGrp;

/**
 * 服务层接口
 * @author zodiac
 * @version 1.0
 *
 */
public interface GraphService {
	
    public int addConferrenceMainTable(ConferrenceMainTable conferrenceMainTable);
    public int addBrndOprtGr(BrndOprtGrp brndOprtGr);
    public int addPayInfo(PayInfo payInfo);
    public int addRtlOprtGrp(RtlOprtGrp rtlOprtGrp);
    public int addCmdtyInfo(CmdtyInfo cmdtyInfo);
}
