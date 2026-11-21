/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.screen.settings.model

/**
 * One-off confirmations shown after an action on the History and cache settings screen.
 */
enum class HistoryMessage {
    METADATA_CACHE_WIPED,
    WATCH_HISTORY_DELETED,
    PLAYBACK_STATES_DELETED,
    SEARCH_HISTORY_DELETED,
    RECAPTCHA_COOKIES_CLEARED
}
