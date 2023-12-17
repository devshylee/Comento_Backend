package com.devfun.settingweb_boot.domain;

public class Holiday {
 private String date;

 public String getDate() {
     return date;
 }

 public void setDate(String date) {
     this.date = date;
 }

 @Override
 public String toString() {
     return "Holiday{" +
             "date='" + date + '\'' +
             '}';
 }
}
