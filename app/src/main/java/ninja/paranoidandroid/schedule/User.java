package ninja.paranoidandroid.schedule;

/**
 * Created by anton on 02.05.16.
 */
public class User {
    private String mUserName;
    private String mName;
    private String mJob;
    private String mEmail;

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmEmail() {

        return mEmail;
    }

    private Party mParty;

    public String getmUserName() {
        return mUserName;
    }

    public String getmName() {
        return mName;
    }

    public String getmJob() {
        return mJob;
    }

    public Party getmParty() {
        return mParty;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmJob(String mJob) {
        this.mJob = mJob;
    }

    public void setmParty(Party mParty) {
        this.mParty = mParty;
    }
}
