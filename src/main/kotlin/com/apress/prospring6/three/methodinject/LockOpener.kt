package com.apress.prospring6.three.methodinject

interface LockOpener {
    fun createKeyOpener(): KeyHelper
    fun openLock()
}