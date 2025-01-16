package com.atomtesttask.citylist.models

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

internal object Constants {
    val digital: Digital = Digital()
    const val STRING_EMPTY = ""
    val dimensions: Dimensions = Dimensions()
    val fontSize: FontSize = FontSize()
}

internal data class Digital(
    val i0: Int = 0,
    val i1: Int = 1,
    val i2: Int = 2,
    val i3: Int = 3,
    val i4: Int = 4,
    val i5: Int = 5,
    val i10: Int = 10,
    val f1: Float = 1f,
    val f04: Float = 0.4f,
    val f05: Float = 0.5f,
    val f06: Float = 0.6f,
    val f08: Float = 0.8f,
)

internal data class Dimensions(
    val divider: Dp = 1.dp,
    val x0: Dp = 0.dp,
    val x0_5: Dp = 2.dp,
    val x0_7: Dp = 3.dp,
    val x1: Dp = 4.dp,
    val x1_5: Dp = 6.dp,
    val x1_7: Dp = 7.dp,
    val x2: Dp = 8.dp,
    val x2_5: Dp = 10.dp,
    val x3: Dp = 12.dp,
    val x3_5: Dp = 14.dp,
    val x4: Dp = 16.dp,
    val x4_5: Dp = 18.dp,
    val x5: Dp = 20.dp,
    val x5_5: Dp = 22.dp,
    val x6: Dp = 24.dp,
    val x6_5: Dp = 26.dp,
    val x7: Dp = 28.dp,
    val x7_5: Dp = 30.dp,
    val x8: Dp = 32.dp,
    val x8_5: Dp = 34.dp,
    val x9: Dp = 36.dp,
    val x9_5: Dp = 38.dp,
    val x10: Dp = 40.dp,
    val x11: Dp = 44.dp,
    val x12: Dp = 48.dp,
    val x13: Dp = 52.dp,
    val x13_5: Dp = 54.dp,
    val x14: Dp = 56.dp,
    val d50: Dp = 50.dp,
    val d52: Dp = 52.dp,
    val d60: Dp = 60.dp,
)

internal data class FontSize(
    val f12: TextUnit = 12.sp,
    val f16: TextUnit = 16.sp,
    val f20: TextUnit = 20.sp,
    val f22: TextUnit = 22.sp,
    val f24: TextUnit = 24.sp,
    val f28: TextUnit = 28.sp,
)