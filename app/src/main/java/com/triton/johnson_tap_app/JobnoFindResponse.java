package com.triton.johnson_tap_app;

public class JobnoFindResponse {

    private String Status;
    private String Message;
    private DataBean Data;
    private int Code;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;

    }


    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;

    }

    public DataBean getData() {
        return Data;
    }

    public void setData(DataBean Data) {
        this.Data = Data;

    }


    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;

    }

    public static class DataBean {
        /**
         * email_id : mohammedimthi2395@gmail.com
         * otp : 912364
         */

        private String job_no;
        private String cont_no;


        public String getJob_no() {
            return job_no;
        }

        public void setJob_no(String job_no) {
            this.job_no = job_no;

        }

        public String getCont_no() {
            return cont_no;
        }

        public void setCont_no(String cont_no) {
            this.cont_no = cont_no;

        }

    }
}
