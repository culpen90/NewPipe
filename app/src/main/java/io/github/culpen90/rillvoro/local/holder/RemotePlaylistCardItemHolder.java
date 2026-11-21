package io.github.culpen90.rillvoro.local.holder;

import android.view.ViewGroup;

import io.github.culpen90.rillvoro.R;
import io.github.culpen90.rillvoro.local.LocalItemBuilder;

/**
 * Playlist card UI for list item.
 */
public class RemotePlaylistCardItemHolder extends RemotePlaylistItemHolder {

    public RemotePlaylistCardItemHolder(final LocalItemBuilder infoItemBuilder,
                                        final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_card_item, parent);
    }
}
