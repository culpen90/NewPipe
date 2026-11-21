package io.github.culpen90.rillvoro.local.holder;

import android.view.ViewGroup;

import io.github.culpen90.rillvoro.R;
import io.github.culpen90.rillvoro.local.LocalItemBuilder;

public class LocalPlaylistGridItemHolder extends LocalPlaylistItemHolder {
    public LocalPlaylistGridItemHolder(final LocalItemBuilder infoItemBuilder,
                                       final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
