package com.infopuls.tash.news;

import org.eclipse.persistence.jaxb.xmlmodel.XmlAccessType;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@XmlRootElement(name="rss")
public class News {

    private String source;
    private Date createdDate;

    @XmlPath("channel/item/description")
    private String content;

    @XmlPath("channel/item/title")
    private String title;


    private String imagePath;
    private String category;
    private String author;

    private File image;

    public News() {
    }

    public News(String content, String title, String imagePath) {
        this.content = content;
        this.title = title;
        this.imagePath = imagePath;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }


    public List <News>  getNewsList(){
        List <News> newsList = new  ArrayList <News> ();

        News news1 = new News ();
        news1.setTitle("Title for news 1");
        news1.setContent("Content for News1");
        news1.setImagePath("images/fujifilm.jpg");
        newsList.add(news1);

        News news2 = new News ();
        news2.setTitle("Title for news 2");
        news2.setContent("Content for News2");
        news2.setImagePath("/images/gutman-island.jpg");
        newsList.add(news2);

        News news3 = new News ();
        news3.setTitle("Title for news 3");
        news3.setContent("Content for News3");
        news3.setImagePath("/images/japan.jpg");
        newsList.add(news3);

        return newsList;
    }

    public List <News>  getArchivNewsList(){
        List <News> newsList = new  ArrayList <News> ();

        News news1 = new News ();
        news1.setTitle("Title for Archiv 1");
        news1.setContent("Content for Archiv 1");
        news1.setImagePath("../images/fujifilm.jpg");
        newsList.add(news1);

        News news2 = new News ();
        news2.setTitle("Title for Archiv 2");
        news2.setContent("Content for  Archiv 2");
        news2.setImagePath("../images/gutman-island.jpg");
        newsList.add(news2);

        News news3 = new News ();
        news3.setTitle("Title for Archiv 3");
        news3.setContent("Content for Archiv 3");
        news3.setImagePath("../images/japan.jpg");
        newsList.add(news3);

        return newsList;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
