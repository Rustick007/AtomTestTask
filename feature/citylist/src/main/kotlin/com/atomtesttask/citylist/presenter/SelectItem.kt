package com.atomtesttask.citylist.presenter

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import com.atomtesttask.citylist.R
import com.atomtesttask.citylist.models.Constants

object SelectItem {
    /**
     * @param title заголовок
     * @param subtitleLeft подзаголовок слева внизу
     * @param subtitleRight подзаголовок справа внизу
     * @param backgroundColor цвет фона
     * @param onClick коллбек клика по холдеру
     * @param isEnable позволяет сделать холдер некликабельным
     * @param isChecked показывает выбран холдер или нет
     */
    @Composable
    fun Item(
        modifier: Modifier = Modifier,
        title: String? = null,
        subtitleLeft: String? = null,
        subtitleRight: String? = null,
        backgroundColor: Color? = null,
        onClick: (() -> Unit)? = null,
        isEnable: Boolean = true,
        isChecked: Boolean = false
    ) {
        ConstraintLayout(
            modifier = modifier
                .fillMaxWidth()
                .background(color = backgroundColor ?: Color.White)
                .clickable { onClick?.invoke() }
                .padding(
                    bottom = Constants.dimensions.x3,
                    start = Constants.dimensions.x2,
                    end = Constants.dimensions.x2
                ),
        ) {
            val (titleRef, subtitleLeftRef, iconRef) = createRefs()
            Text(
                modifier = Modifier
                    .constrainAs(titleRef) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                    }
                    .padding(
                        bottom =
                        if (subtitleLeft.isNullOrEmpty() && subtitleRight.isNullOrEmpty())
                            Constants.dimensions.x1_5
                        else
                            Constants.dimensions.x1
                    ),
                text = title ?: Constants.STRING_EMPTY,
                style = MaterialTheme.typography.h6,
                color = if (isEnable && isChecked) Color.Red
                else if (isEnable) Color.Black
                else Color.Gray
            )
            if (isChecked) Icon(
                modifier = Modifier
                    .constrainAs(iconRef) {
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                    }
                    .size(Constants.dimensions.x5),
                painter = painterResource(id = R.drawable.ic_check_success),
                contentDescription = null,
                tint = if (isEnable) Color.Red
                else Color.LightGray
            )
            if (!subtitleLeft.isNullOrEmpty()) Text(
                modifier = Modifier
                    .constrainAs(subtitleLeftRef) {
                        start.linkTo(parent.start)
                        top.linkTo(titleRef.bottom)
                    },
                text = subtitleLeft,
                style = MaterialTheme.typography.body2,
                color = if (isEnable) Color.Gray
                else Color.LightGray
            )
        }
    }
}
