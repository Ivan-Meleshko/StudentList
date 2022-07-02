package com.skillfactory.studentlist;

import java.util.UUID;

public class Student {

    /**
     * id ��������
     */
    private String id;

    /**
     * ��� ��������
     */
    private String name;

    /**
     * ������� ��������
     */
    private String phone;

    /**
     * ����� ��������
     */
    private String eMail;

    public Student(String name, String phone, String eMail) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}