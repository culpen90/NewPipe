/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings.model

import org.jetbrains.compose.resources.StringResource
import rillvoro.shared.generated.resources.Res
import rillvoro.shared.generated.resources.channel_tab_about
import rillvoro.shared.generated.resources.channel_tab_albums
import rillvoro.shared.generated.resources.channel_tab_channels
import rillvoro.shared.generated.resources.channel_tab_courses
import rillvoro.shared.generated.resources.channel_tab_likes
import rillvoro.shared.generated.resources.channel_tab_livestreams
import rillvoro.shared.generated.resources.channel_tab_playlists
import rillvoro.shared.generated.resources.channel_tab_podcasts
import rillvoro.shared.generated.resources.channel_tab_shorts
import rillvoro.shared.generated.resources.channel_tab_tracks
import rillvoro.shared.generated.resources.channel_tab_videos

/**
 * Tabs of a channel page, as listed in the Content settings.
 */
enum class ChannelTab(val title: StringResource, val showKey: String, val fetchKey: String?) {
    VIDEOS(Res.string.channel_tab_videos, "show_channel_tabs_videos", "fetch_channel_tabs_videos"),
    TRACKS(Res.string.channel_tab_tracks, "show_channel_tabs_tracks", "fetch_channel_tabs_tracks"),
    SHORTS(Res.string.channel_tab_shorts, "show_channel_tabs_shorts", "fetch_channel_tabs_shorts"),
    LIVESTREAMS(
        Res.string.channel_tab_livestreams,
        "show_channel_tabs_livestreams",
        "fetch_channel_tabs_livestreams"
    ),
    CHANNELS(Res.string.channel_tab_channels, "show_channel_tabs_channels", null),
    PLAYLISTS(Res.string.channel_tab_playlists, "show_channel_tabs_playlists", null),
    ALBUMS(Res.string.channel_tab_albums, "show_channel_tabs_albums", null),
    LIKES(Res.string.channel_tab_likes, "show_channel_tabs_likes", "fetch_channel_tabs_likes"),
    PODCASTS(Res.string.channel_tab_podcasts, "show_channel_tabs_podcasts", "fetch_channel_tabs_podcasts"),
    COURSES(Res.string.channel_tab_courses, "show_channel_tabs_courses", "fetch_channel_tabs_courses"),
    ABOUT(Res.string.channel_tab_about, "show_channel_tabs_about", null);

    companion object {
        val SHOW_KEYS: Set<String> = entries.mapTo(linkedSetOf()) { tab -> tab.showKey }
        val FETCH_KEYS: Set<String> = entries.mapNotNullTo(linkedSetOf()) { tab -> tab.fetchKey }
    }
}
