package hello.upload.domain;

import lombok.Data;

// 업로드 파일 정보 보관
@Data
public class UploadFile {

    private String uploadFileName; // 고객이 업로드한 파일명
    private String storeFileName; // 서버 내부에서 관리하는 이름, 서버에서는 저장할 파일명이 겹치지 않도록 내부에서 관리하는 별도의 파일명 필요


    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
