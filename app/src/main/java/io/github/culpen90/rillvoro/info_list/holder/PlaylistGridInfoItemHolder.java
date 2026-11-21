package io.github.culpen90.rillvoro.info_list.holder;

import android.view.ViewGroup;

import io.github.culpen90.rillvoro.R;
import io.github.culpen90.rillvoro.info_list.InfoItemBuilder;

public class PlaylistGridInfoItemHolder extends PlaylistMiniInfoItemHolder {
    public PlaylistGridInfoItemHolder(final InfoItemBuilder infoItemBuilder,
                                      final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
