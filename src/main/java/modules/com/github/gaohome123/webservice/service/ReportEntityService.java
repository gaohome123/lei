package modules.com.github.gaohome123.webservice.service;

import modules.com.github.gaohome123.webservice.entity.ReportEntity;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * 接口定义
 *  @WebService用于定义webservice对外开放的接口
 *  @create 2018-01-23 16:22
 */
@WebService
public interface  ReportEntityService {

    /**
     *
     * @param pkid
     * @return
     */
    ReportEntity findOne(String pkid);

    /**
     *
     * @param pkid
     * @return
     */
    ReportEntity findTwo(String pkid);
}
