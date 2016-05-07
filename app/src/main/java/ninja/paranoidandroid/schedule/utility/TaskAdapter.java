package ninja.paranoidandroid.schedule.utility;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

import ninja.paranoidandroid.schedule.R;
import ninja.paranoidandroid.schedule.Task;

/**
 * Created by anton on 02.05.16.
 */
public class TaskAdapter extends ArrayAdapter<Task>{

    private Context mContext;
    private List<Task> mTasksList;


    public TaskAdapter(Context cntx, int resource, List<Task> tasks) {
        super(cntx, resource, tasks);
        mContext = cntx;
        mTasksList = tasks;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return mTasksList.size();
    }

    @Override
    public Task getItem(int i) {

        return mTasksList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TaskHolder taskHolder = new TaskHolder();

        if(view == null){

            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(R.layout.task_tayout, viewGroup);

            taskHolder.mTitleTextView = (TextView) view.findViewById(R.id.tv_task_layout_title);
            taskHolder.mUserTextView = (TextView) view.findViewById(R.id.tv_task_layout_user);
            taskHolder.mDescriptionTextView = (TextView) view.findViewById(R.id.tv_task_layout_description);
            taskHolder.mDateOfExecutionTextView = (TextView) view.findViewById(R.id.tv_task_layout_date_of_execution);
            taskHolder.mTaskStatusCheckBox = (CheckBox) view.findViewById(R.id.chb_tasklayout_task_status);

        }

        Task task = getItem(i);

        taskHolder.mTitleTextView.setText(task.getmTitle());
        taskHolder.mTitleTextView.setTextColor(task.getTaskPriorityColor());
        taskHolder.mDescriptionTextView.setText(task.getmDescription());
        taskHolder.mUserTextView.setText(task.getmUser().getmUserName());
        taskHolder.mDateOfExecutionTextView.setText(task.getmDateOfExecution());
        taskHolder.mTaskStatusCheckBox.setChecked(task.isDone());

        return view;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


     private class TaskHolder{
        TextView mTitleTextView;
        TextView mUserTextView;
        TextView mDescriptionTextView;
        TextView mDateOfExecutionTextView;
        CheckBox mTaskStatusCheckBox;
    }
}
