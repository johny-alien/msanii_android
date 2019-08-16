package com.example.msanii;

import android.os.Parcel;
import android.os.Parcelable;

public class publicinfomod implements Parcelable {

    public String nickname;
    public String lastname;
    public String fname;
    public int phone;
    public String mail;
    public int eage;
    public String sgender;
   public Boolean actor;
    public Boolean mu;
    public Boolean hip;
    public Boolean rn;
    public Boolean mo;
    public Boolean vi;
    public Boolean me;
    public Boolean sc;

    public Boolean getActor() {
        return actor;
    }

    public publicinfomod()
    {

    }

    public void setActor(Boolean actor) {
        this.actor = actor;
    }

    public Boolean getMu() {
        return mu;
    }

    public void setMu(Boolean mu) {
        this.mu = mu;
    }

    public Boolean getHip() {
        return hip;
    }

    public void setHip(Boolean hip) {
        this.hip = hip;
    }

    public Boolean getRn() {
        return rn;
    }

    public void setRn(Boolean rn) {
        this.rn = rn;
    }

    public Boolean getMo() {
        return mo;
    }

    public void setMo(Boolean mo) {
        this.mo = mo;
    }

    public Boolean getVi() {
        return vi;
    }

    public void setVi(Boolean vi) {
        this.vi = vi;
    }

    public Boolean getMe() {
        return me;
    }

    public void setMe(Boolean me) {
        this.me = me;
    }

    public Boolean getSc() {
        return sc;
    }

    public void setSc(Boolean sc) {
        this.sc = sc;
    }

    public publicinfomod(String nickname, String firstname, String fname, int phone, String lname, int eage, String sgender) {
        this.nickname = nickname;
        this.lastname = firstname;
        this.fname = fname;
        this.phone = phone;
        this.mail = lname;
        this.eage = eage;
        this.sgender = sgender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.lastname = firstname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLname() {
        return mail;
    }

    public void setLname(String lname) {
        this.mail = lname;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(nickname);
        parcel.writeString(lastname);
        parcel.writeString(fname);
        parcel.writeInt(phone);
        parcel.writeString(mail);
        parcel.writeInt(eage);
        parcel.writeString(sgender);
        parcel.writeBoolean(actor);
        parcel.writeBoolean(mu);
        parcel.writeBoolean(hip);
        parcel.writeBoolean(rn);
        parcel.writeBoolean(mo);
        parcel.writeBoolean(vi);
        parcel.writeBoolean(me);
        parcel.writeBoolean(sc);

    }

    protected publicinfomod(Parcel parcel)
    {
        nickname = parcel.readString();
        lastname = parcel.readString();
        fname= parcel.readString();
        phone= parcel.readInt();
        mail= parcel.readString();
        eage= parcel.readInt();
        sgender= parcel.readString();
        actor=parcel.readBoolean();
        mu=parcel.readBoolean();
        hip=parcel.readBoolean();
        rn=parcel.readBoolean();
        mo=parcel.readBoolean();
        vi=parcel.readBoolean();
        me=parcel.readBoolean();
        sc=parcel.readBoolean();

    }

    public static final Creator<publicinfomod> CREATOR = new Creator<publicinfomod>() {
        @Override
        public publicinfomod createFromParcel(Parcel parcel) {
            return new publicinfomod(parcel);
        }

        @Override
        public publicinfomod[] newArray(int i) {
            return new publicinfomod[i];
        }
    };
}
