package com.atomtesttask.citylist.presenter

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import com.atomtesttask.citylist.models.Constants

@Composable
fun Indicator(
    modifier: Modifier,
    size: Dp = Constants.dimensions.x8,
    sweepAngle: Float = Constants.digital.f90,
    color: Color = Color.Red,
    strokeWidth: Dp = ProgressIndicatorDefaults.StrokeWidth
) {
    val transition = rememberInfiniteTransition()
    val currentArcStartAngle by transition.animateValue(
        Constants.digital.i0,
        Constants.digital.i360,
        Int.VectorConverter,
        infiniteRepeatable(
            animation = tween(
                durationMillis = Constants.digital.i1100,
                easing = LinearEasing
            )
        )
    )

    val stroke = with(LocalDensity.current) {
        Stroke(width = strokeWidth.toPx(), cap = StrokeCap.Square)
    }

    Canvas(
        modifier then
                Modifier
                    .progressSemantics()
                    .size(size)
                    .padding(strokeWidth / Constants.digital.i2)
    ) {
        drawCircle(Color.LightGray, style = stroke)
        drawArc(
            color,
            startAngle = currentArcStartAngle.toFloat() - Constants.digital.i90,
            sweepAngle = sweepAngle,
            useCenter = false,
            style = stroke
        )
    }
}