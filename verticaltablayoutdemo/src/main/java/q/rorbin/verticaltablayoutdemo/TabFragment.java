package q.rorbin.verticaltablayoutdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by chqiu on 2017/1/16.
 */

public class TabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView view = new TextView(inflater.getContext());
        String text = getArguments().getString("index", "fragment");
        view.setText(text);
        view.setTextSize(30);
        return view;
    }
}
