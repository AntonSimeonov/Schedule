package ninja.paranoidandroid.schedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import ninja.paranoidandroid.schedule.utility.TaskAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView mAllTasksListView;
    private TaskAdapter mTaskAdapter;
    private List<Task> mTasksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_tasks);

        mAllTasksListView = (ListView) findViewById(R.id.lv_all_tasks);
        mTaskAdapter = new TaskAdapter(this, R.layout.task_tayout, mTasksList);
        mAllTasksListView.setAdapter(mTaskAdapter);
    }
}
