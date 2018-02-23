package modules.com.github.gaohome123.webservice.service;

import modules.com.github.gaohome123.webservice.entity.ReportEntity;

import javax.jws.WebMethod;

/**
 * webservice接口实现
 * @author GAOLEI
 * @create 2018-01-23 16:23
 **/
public class ReportEntityServiceImpl2 implements ReportEntityService2 {

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

    public ReportEntityServiceImpl2() {
        System.out.println("初始化ReportEntityServiceImpl");
    }
}
