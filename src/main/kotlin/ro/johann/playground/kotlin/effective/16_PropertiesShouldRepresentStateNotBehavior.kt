package ro.johann.playground.kotlin.effective

import java.util.Date

class User {
    var name: String? = null
        get() = field?.uppercase()
        set(value) {
            if (!value.isNullOrBlank()) {
                field = value
            }
        }

    private var millis: Long = 0
    var date: Date
        get() = Date(millis)
        set(value) {
            millis = value.time
        }
}