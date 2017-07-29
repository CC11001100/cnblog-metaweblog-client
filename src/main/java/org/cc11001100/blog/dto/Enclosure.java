package org.cc11001100.blog.dto;

/**
 *
 *  附件信息
 *
 * @author CC11001100
 * @date 2017/7/29 22:25
 * @email CC11001100@qq.com
 */
public class Enclosure {

    /**
     * 大小（可选）
     */
    private Integer length;

    /**
     * 可选（可选）
     */
    private String type;

    /**
     * 路径（可选）
     */
    private String url;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
