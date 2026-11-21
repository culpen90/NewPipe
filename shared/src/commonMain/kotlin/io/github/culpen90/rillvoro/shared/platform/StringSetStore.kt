/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package io.github.culpen90.rillvoro.shared.platform

/**
 * Stores sets of strings
 */
interface StringSetStore {

    fun get(key: String, defaultValue: Set<String>): Set<String>

    fun put(key: String, value: Set<String>)
}
