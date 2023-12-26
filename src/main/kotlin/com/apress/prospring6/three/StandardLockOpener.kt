package com.apress.prospring6.three

import com.apress.prospring6.three.methodinject.KeyHelper
import com.apress.prospring6.three.methodinject.LockOpener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component("standardLockOpener")
internal class StandardLockOpener: LockOpener {
    var keyOpener: KeyHelper? = null

    override fun createKeyOpener(): KeyHelper? {
        return keyOpener
    }

    @Autowired
    @Qualifier("keyHelper")
    fun setKeyHelper(keyHelper: KeyHelper?) {
        keyOpener = keyHelper
    }

    override fun openLock() {
        keyOpener!!.open()
    }
}