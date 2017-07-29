package org.cc11001100.blog.dto;

/**
 * @author CC11001100
 * @date 2017/7/29 22:27
 * @email CC11001100@qq.com
 */
public class WpCategory {

    private String name;

    private String slug;

    private Integer parent_id;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }
}
