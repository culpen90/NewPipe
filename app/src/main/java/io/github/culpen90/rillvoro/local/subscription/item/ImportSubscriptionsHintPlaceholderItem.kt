package io.github.culpen90.rillvoro.local.subscription.item

import android.view.View
import com.xwray.groupie.viewbinding.BindableItem
import io.github.culpen90.rillvoro.R
import io.github.culpen90.rillvoro.databinding.ListEmptyViewBinding

/**
 * When there are no subscriptions, show a hint to the user about how to import subscriptions
 */
class ImportSubscriptionsHintPlaceholderItem : BindableItem<ListEmptyViewBinding>() {
    override fun getLayout(): Int = R.layout.list_empty_view_subscriptions
    override fun bind(viewBinding: ListEmptyViewBinding, position: Int) {}
    override fun getSpanSize(spanCount: Int, position: Int): Int = spanCount
    override fun initializeViewBinding(view: View) = ListEmptyViewBinding.bind(view)
}
