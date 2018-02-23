package modules.com.github.gaohome123.webservice.entity;

/**
 * 直报主体定义
 */

public class ReportEntity {

    private String pkid;
    private String enterpirseName;
    private String orgaizationId;

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    public String getEnterpirseName() {
        return enterpirseName;
    }

    public void setEnterpirseName(String enterpirseName) {
        this.enterpirseName = enterpirseName;
    }

    public String getOrgaizationId() {
        return orgaizationId;
    }

    public void setOrgaizationId(String orgaizationId) {
        this.orgaizationId = orgaizationId;
    }
}