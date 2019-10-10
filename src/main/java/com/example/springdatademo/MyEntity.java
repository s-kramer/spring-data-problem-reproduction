package com.example.springdatademo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "single_use_code")
class MyEntity {
    public MyEntity(int fieldOne, String fieldTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }

    public MyEntity() {
    }

    @Id
    @GeneratedValue
    int fieldOne;

    String fieldTwo;

    @Override
    public String toString() {
        return "MyEntity{" +
                "fieldOne='" + fieldOne + '\'' +
                ", fieldTwo='" + fieldTwo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyEntity myEntity = (MyEntity) o;

        if (fieldOne != myEntity.fieldOne) return false;
        return fieldTwo != null ? fieldTwo.equals(myEntity.fieldTwo) : myEntity.fieldTwo == null;
    }

    @Override
    public int hashCode() {
        int result = fieldOne;
        result = 31 * result + (fieldTwo != null ? fieldTwo.hashCode() : 0);
        return result;
    }

    public int getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(int fieldOne) {
        this.fieldOne = fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

}
