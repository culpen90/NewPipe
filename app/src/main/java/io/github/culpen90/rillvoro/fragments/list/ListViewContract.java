package io.github.culpen90.rillvoro.fragments.list;

import io.github.culpen90.rillvoro.fragments.ViewContract;

public interface ListViewContract<I, N> extends ViewContract<I> {
    void showListFooter(boolean show);

    void handleNextItems(N result);
}
