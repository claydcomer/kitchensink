package com.claydcomer.kitchensink.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BOOKSHELF", schema = "PUBLIC", catalog = "KITCHENSINK")
public class BookshelfEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "ROW_NUM")
    private Integer rowNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookshelfEntity that = (BookshelfEntity) o;

        if (id != that.id) return false;
        if (rowNum != null ? !rowNum.equals(that.rowNum) : that.rowNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (rowNum != null ? rowNum.hashCode() : 0);
        return result;
    }
}
