package ninja.paranoidandroid.schedule;

import android.graphics.Color;

import ninja.paranoidandroid.schedule.utility.Priority;

/**
 * Created by anton on 02.05.16.
 */
public class Task {
    private String mTitle;
    private String mDescription;
    private String mDateOfExecution;
    private Priority mPriority;
    private User mUser;
    private boolean mStatus;

    public boolean isDone() {
        return mStatus;
    }

    public void setmStatus(boolean mStatus) {
        this.mStatus = mStatus;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmDateOfExecution(String mDateOfExecution) {
        this.mDateOfExecution = mDateOfExecution;
    }

    public void setmPriority(Priority mPriority) {
        this.mPriority = mPriority;
    }

    public void setmUser(User mUser) {
        this.mUser = mUser;
    }

    public String getmTitle() {

        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmDateOfExecution() {
        return mDateOfExecution;
    }

    public Priority getmPriority() {
        return mPriority;
    }

    public User getmUser() {
        return mUser;
    }

    public int getTaskPriorityColor(){

        int color = 0;
        if(mPriority.equals("NORMAL")){
            color = Color.BLACK;
        }else if(mPriority.equals("HIGH")){
           color = Color.RED;
        }else if(mPriority.equals("LOW")){
            color = Color.BLUE;
        }

        return color;
    }
}
