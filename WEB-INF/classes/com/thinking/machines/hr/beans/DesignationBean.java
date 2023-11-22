package com.thinking.machines.hr.beans;
public class DesignationBean implements java.io.Serializable{

private String title;
private int code;

public DesignationBean(){
this.title="";
this.code=0;
}

public String getTitle(){
return this.title;
}

public void setTitle(String title){
this.title=title;
}

public void setCode(int code){
this.code=code;
}

public int getCode(){
return this.code;
}


}