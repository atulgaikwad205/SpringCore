package com.example.FileHandling.pojo;

public class fileInfo {




    private  String filename;
    private  int id;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public fileInfo(String filename, int id){
        this.filename=filename;
        this.id=id;
    }


}
