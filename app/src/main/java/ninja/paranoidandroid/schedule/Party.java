package ninja.paranoidandroid.schedule;

import java.util.List;

/**
 * Created by anton on 02.05.16.
 */
public class Party {

    private String mName;
    private List<Task> mTasks;
    private List<User> mUsers;

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmTasks(List<Task> mTasks) {

        this.mTasks = mTasks;
    }

    public void setmUsers(List<User> mUsers) {

        this.mUsers = mUsers;
    }

    public String getmName() {

        return mName;
    }

    public List<Task> getmTasks() {

        return mTasks;
    }

    public List<User> getmUsers() {

        return mUsers;
    }
}
