package io.github.culpen90.rillvoro.local.subscription.item

import android.view.View
import com.xwray.groupie.viewbinding.BindableItem
import io.github.culpen90.rillvoro.R
import io.github.culpen90.rillvoro.databinding.FeedGroupAddNewItemBinding

class FeedGroupAddNewItem : BindableItem<FeedGroupAddNewItemBinding>() {
    override fun getLayout(): Int = R.layout.feed_group_add_new_item
    override fun initializeViewBinding(view: View) = FeedGroupAddNewItemBinding.bind(view)
    override fun bind(viewBinding: FeedGroupAddNewItemBinding, position: Int) {
        // this is a static item, nothing to do here
    }
}
