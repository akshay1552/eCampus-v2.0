package com.example.ecampus;

public class NoticeData {

    private String NoticeNo;
    private String NoticeDate;
    private String Notice;

    public NoticeData() {
    }


    public NoticeData(String noticeNo, String noticeDate, String notice) {
        NoticeNo = noticeNo;
        NoticeDate = noticeDate;
        Notice = notice;
    }

    public String getNoticeNo() {
        return NoticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        NoticeNo = noticeNo;
    }

    public String getNoticeDate() {
        return NoticeDate;
    }

    public void setNoticeDate(String noticeDate) {
        NoticeDate = noticeDate;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }

}
