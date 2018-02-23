package modules.com.github.gaohome123.webservice.service;

import modules.com.github.gaohome123.webservice.entity.ReportEntity;
import modules.com.github.gaohome123.webservice.service.ReportEntityService;

import javax.jws.WebMethod;

/**
 * webservice接口实现
 * @author GAOLEI
 * @create 2018-01-23 16:23
 **/
public class ReportEntityServiceImpl implements ReportEntityService {

    @Override
    @WebMethod
    public ReportEntity findOne(String pkid) {

        ReportEntity reportEntity = new ReportEntity();
        reportEntity.setPkid(pkid);
        reportEntity.setEnterpirseName(pkid + "_测试的直报主体");
        reportEntity.setOrgaizationId("12322222222");
        return reportEntity;
    }

    @Override
    public ReportEntity findTwo(String pkid) {
        ReportEntity reportEntity = new ReportEntity();
        reportEntity.setPkid(pkid);
        reportEntity.setEnterpirseName(pkid + "_测试的直报主体");
        reportEntity.setOrgaizationId("12322222222");
        return reportEntity;
    }

    public ReportEntityServiceImpl() {
        System.out.println("初始化ReportEntityServiceImpl");
    }
}
