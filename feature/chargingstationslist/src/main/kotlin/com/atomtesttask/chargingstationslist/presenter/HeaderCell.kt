package com.atomtesttask.chargingstationslist.presenter

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp

//@Composable
//private fun HeaderCellBase(
//    title: String,
//    titleStyle: TextStyleThemeDefault,
//    modifier: Modifier = Modifier,
//    titleTextColor: Color = TITLE_TEXT_COLOR_DEFAULT,
//    isTitleUppercase: Boolean = false,
//    subtitle: String? = null,
//    subtitleTextColor: Color = SUBTITLE_TEXT_COLOR_DEFAULT,
//    isTextCentered: Boolean = false,
//    actionType: ActionType? = null,
//    bottomPadding: Dp = SynergyTheme.dimensions.x3,
//    maxViewScale: ViewScale? = null,
//) = Box(modifier = modifier) {
//    val maxWidthModifier = Modifier.fillMaxWidth()
//    Column(
//        modifier = maxWidthModifier
//            .padding(
//                start = SynergyTheme.dimensions.x4,
//                top = SynergyTheme.dimensions.x3_5,
//                end = SynergyTheme.dimensions.x4,
//                bottom = bottomPadding,
//            )
//    ) {
//        Row(
//            modifier = maxWidthModifier,
//            verticalAlignment = Alignment.CenterVertically,
//        ) {
//            val isActionTypeWithText = actionType is ActionType.Text ||
//                    (actionType as? ActionType.DropDown)?.text != null
//            TitleContent(
//                title = title,
//                titleStyle = titleStyle,
//                titleTextColor = titleTextColor,
//                isTitleUppercase = isTitleUppercase,
//                isTextCentered = isTextCentered,
//                isActionTypeWithText = isActionTypeWithText,
//                maxViewScale = maxViewScale,
//            )
//            if (actionType != null) {
//                ActionContent(actionType = actionType, maxViewScale = maxViewScale)
//            }
//        }
//        if (subtitle != null) {
//            Text(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = SynergyTheme.dimensions.x1),
//                text = subtitle,
//                textAlign = if (isTextCentered) TextAlign.Center else TextAlign.Start,
//                style = SynergyTheme.typography.text1RegularDefault
//                    .fontSizeMaxScale(maxScale = maxViewScale),
//                color = subtitleTextColor,
//            )
//        }
//    }
//}