package io.github.culpen90.rillvoro.local.subscription.workers

import io.github.culpen90.rillvoro.BuildConfig
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class SubscriptionData(
    val subscriptions: List<SubscriptionItem>
) {
    @SerialName("app_version")
    private val appVersion = BuildConfig.VERSION_NAME

    @SerialName("app_version_int")
    private val appVersionInt = BuildConfig.VERSION_CODE
}

@Serializable
data class SubscriptionItem(
    @SerialName("service_id")
    val serviceId: Int,
    val url: String,
    val name: String
)
