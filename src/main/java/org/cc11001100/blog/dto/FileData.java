package org.cc11001100.blog.dto;

/**
 * @author CC11001100
 * @date 2017/7/29 22:29
 * @email CC11001100@qq.com
 */
public class FileData {

    private Byte[] bits;

    private String name;

    private String type;

    public Byte[] getBits() {
        return bits;
    }

    public void setBits(Byte[] bits) {
        this.bits = bits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
