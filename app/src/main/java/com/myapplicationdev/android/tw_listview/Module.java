package com.myapplicationdev.android.tw_listview;
public class Module {
    private String year;
    private String moduleCode;
    private boolean isProg;

    public Module(String year,String moduleCode,boolean isProg ){
        this.moduleCode = moduleCode;
        this.isProg = isProg;
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public String getModuleCode(){
        return moduleCode;
    }
    public boolean isProg(){
        return isProg;
    }


}
