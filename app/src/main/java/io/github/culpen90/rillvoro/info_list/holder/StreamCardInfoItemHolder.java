package io.github.culpen90.rillvoro.info_list.holder;

import android.view.ViewGroup;

import io.github.culpen90.rillvoro.R;
import io.github.culpen90.rillvoro.info_list.InfoItemBuilder;

/**
 * Card layout for stream.
 */
public class StreamCardInfoItemHolder extends StreamInfoItemHolder {

    public StreamCardInfoItemHolder(final InfoItemBuilder infoItemBuilder, final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_stream_card_item, parent);
    }
}
