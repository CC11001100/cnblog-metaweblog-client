package org.cc11001100.blog.dto;

/**
 * @author CC11001100
 * @date 2017/7/29 22:30
 * @email CC11001100@qq.com
 */
public class CategoryInfo {

    private String description;

    private String htmlUrl;

    private String rssUrl;

    private String title;

    private String categoryid;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getRssUrl() {
        return rssUrl;
    }

    public void setRssUrl(String rssUrl) {
        this.rssUrl = rssUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }
}
