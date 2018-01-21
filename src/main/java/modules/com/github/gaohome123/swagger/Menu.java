package modules.com.github.gaohome123.swagger;

public class Menu {

    private String title;
    private String icon;
    private String href;
    private boolean spread;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }

    public void setHref(String href) {
        this.href = href;
    }
    public String getHref() {
        return href;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }
    public boolean getSpread() {
        return spread;
    }

}