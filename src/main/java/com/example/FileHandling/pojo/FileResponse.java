package com.example.FileHandling.pojo;




public class FileResponse  {

    private String fileName;

    private String meassage;
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getMeassage() {
        return meassage;
    }

    public void setMeassage(String meassage) {
        this.meassage = meassage;
    }



    public FileResponse(String fileName , String meassage){
        this.fileName=fileName;
        this.meassage=meassage;
    }
}
