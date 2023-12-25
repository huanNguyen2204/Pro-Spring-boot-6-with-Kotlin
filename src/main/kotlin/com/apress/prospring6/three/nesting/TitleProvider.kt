package com.apress.prospring6.three.nesting

class TitleProvider {
    var title: String? = "Gravity"

    companion object {
        fun instance(title: String?): TitleProvider {
            val childProvider = TitleProvider()
            if (title != null && title.isNotBlank())
                childProvider.title = title
            return childProvider
        }
    }
}