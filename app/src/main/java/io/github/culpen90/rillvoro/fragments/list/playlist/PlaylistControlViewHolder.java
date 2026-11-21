package io.github.culpen90.rillvoro.fragments.list.playlist;

import io.github.culpen90.rillvoro.player.playqueue.PlayQueue;

/**
 * Interface for {@code R.layout.playlist_control} view holders
 * to give access to the play queue.
 */
public interface PlaylistControlViewHolder {
    PlayQueue getPlayQueue();
}
