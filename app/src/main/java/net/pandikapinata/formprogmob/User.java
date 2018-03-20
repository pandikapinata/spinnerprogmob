package net.pandikapinata.formprogmob;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Pandika on 3/20/2018.
 */

class User implements Parcelable {
    private String nama;
    private String nim;
    private String alamat;
    private String agama;
    private String gender;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nama);
        parcel.writeString(this.nim);
        parcel.writeString(this.agama);
        parcel.writeString(this.alamat);
        parcel.writeString(this.gender);

    }

    public User() {
    }

    protected User(Parcel in) {
        this.nama = in.readString();
        this.nim = in.readString();
        this.alamat = in.readString();
        this.agama = in.readString();
        this.gender = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
