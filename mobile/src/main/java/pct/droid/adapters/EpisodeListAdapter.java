package pct.droid.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import pct.droid.R;
import pct.droid.base.providers.media.models.Episode;

public class EpisodeListAdapter extends BaseAdapter {

    private List<Episode> mData;
    private LayoutInflater mInflater;
    private int mColor = 0x0;

    class ViewHolder {
        public ViewHolder(View v) {
            ButterKnife.inject(this, v);
        }

        @InjectView(R.id.info)
        TextView number;
        @InjectView(R.id.title)
        TextView title;
    }

    public EpisodeListAdapter(LayoutInflater inflater, List<Episode> data, int color) {
        mData = data;
        mInflater = inflater;
        mColor = color;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Episode getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.episode_list_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Episode episode = getItem(position);
        holder.title.setText(episode.title);
        holder.number.setText("E" + episode.episode);
        holder.number.setTextColor(mColor);

        return convertView;
    }

}
