package com.example.lenovo.l_json;

public class news {
    private String title;
    private String newsImageUrl;

    @Override
    public String toString() {
        return "news{" +
                "title='" + title + '\'' +
                ", newsImageUrl='" + newsImageUrl + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsImageUrl() {
        return newsImageUrl;
    }

    public void setNewsImageUrl(String newsImageUrl) {
        this.newsImageUrl = newsImageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public news(String title, String newsImageUrl, String content) {

        this.title = title;
        this.newsImageUrl = newsImageUrl;
        this.content = content;
    }

    private String content;

}
