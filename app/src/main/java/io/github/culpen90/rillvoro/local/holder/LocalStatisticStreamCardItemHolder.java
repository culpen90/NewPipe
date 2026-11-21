package io.github.culpen90.rillvoro.local.holder;

import android.view.ViewGroup;

import io.github.culpen90.rillvoro.R;
import io.github.culpen90.rillvoro.local.LocalItemBuilder;

public class LocalStatisticStreamCardItemHolder extends LocalStatisticStreamItemHolder {
    public LocalStatisticStreamCardItemHolder(final LocalItemBuilder infoItemBuilder,
                                              final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_stream_card_item, parent);
    }
}
