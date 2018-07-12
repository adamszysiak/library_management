package com.spring.librarymanagement.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "books")
public class BookEntity
{
    public BookEntity()
    {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "PUBLISHER")
    private String publisher;

    @Column(name = "QUANTITY")
    private int quantity;

    @Column(name = "ISSUED")
    private int issued;

    @Column(name = "ADDED_DATE")
    private Date addedDate;

    @Column(name = "USER_ID")
    private  Long userID;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getIssued()
    {
        return issued;
    }

    public void setIssued(int issued)
    {
        this.issued = issued;
    }

    public Date getAddedDate()
    {
        return addedDate;
    }

    public void setAddedDate(Date addedDate)
    {
        this.addedDate = addedDate;
    }

    public Long getUserID()
    {
        return userID;
    }

    public void setUserID(Long userID)
    {
        this.userID = userID;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity bookEntity = (BookEntity) o;
        return quantity == bookEntity.quantity &&
                issued == bookEntity.issued &&
                Objects.equals(id, bookEntity.id) &&
                Objects.equals(name, bookEntity.name) &&
                Objects.equals(author, bookEntity.author) &&
                Objects.equals(publisher, bookEntity.publisher) &&
                Objects.equals(addedDate, bookEntity.addedDate) &&
                Objects.equals(userID, bookEntity.userID);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(id, name, author, publisher, quantity, issued, addedDate, userID);
    }

    @Override
    public String toString()
    {
        return "BookEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                ", issued=" + issued +
                ", addedDate='" + addedDate + '\'' +
                ", userID=" + userID +
                '}';
    }
}
